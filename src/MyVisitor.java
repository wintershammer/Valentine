import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

public class MyVisitor extends MyGBaseVisitor<Value> {

	Map<String, Value> memory = new HashMap<String, Value>();

	public void setEnviroment(Map<String, Value> newEnv) {
		this.memory = newEnv;
	}

	@Override
	public Value visitAddSub(@NotNull MyGParser.AddSubContext ctx) {

		Value left = visit(ctx.expression(0));

		Value right = visit(ctx.expression(1));
		

		Value value = new Value();
		switch (ctx.op.getText().charAt(0)) {
		case '+':
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ //if either one is double then return a double Value
				value = new Value(left.getNumerical().doubleValue() + right.getNumerical().doubleValue());
			}
			else{ //else (both are integers)  : return an int Value
				value = new Value(left.getNumerical().intValue() + right.getNumerical().intValue());
			}
			break;
		case '-':
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ //if either one is double then return a double Value
				value = new Value(left.getNumerical().doubleValue() - right.getNumerical().doubleValue());
			}
			else{ //else (both are integers)  : return an int Value
				value = new Value(left.getNumerical().intValue() - right.getNumerical().intValue());
			}
			break;
		}

		return value;
	}

	@Override
	public Value visitInt(MyGParser.IntContext ctx) {
		return new Value(Integer.valueOf(ctx.INT().getText()));
	}
	
	@Override
	public Value visitDouble(MyGParser.DoubleContext ctx) {
		return new Value(Double.valueOf(ctx.DOUBLE().getText()));
	}

	@Override
	public Value visitBool(MyGParser.BoolContext ctx) {
		return new Value(Boolean.valueOf(ctx.BOOLEAN().getText()));
	}	
	
	
	@Override
	public Value visitString(MyGParser.StringContext ctx) {
		String trimed = ctx.getText().substring(1, ctx.getText().length()-1);
		return new Value(trimed);
	}	
	
	@Override
	public Value visitAssignment(MyGParser.AssignmentContext ctx) {
		String id = ctx.ID().getText();
		Value value = visit(ctx.expression());
		memory.put(id, value);

		return value;
	}

	@Override
	public Value visitReference(@NotNull MyGParser.ReferenceContext ctx) {

		String id = ctx.ID().getText();
		if (memory.containsKey(id)) {
			return memory.get(id);
		}
		return null;
	}

	@Override
	public Value visitParen(@NotNull MyGParser.ParenContext ctx) {

		return visit(ctx.expression());
	}

	@Override
	public Value visitMulDiv(@NotNull MyGParser.MulDivContext ctx) {

		Value left = visit(ctx.expression(0));

		Value right = visit(ctx.expression(1));

		Value value = new Value();
		switch (ctx.op.getText().charAt(0)) {
		case '*':
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ //if either one is double then return a double Value
				value = new Value(left.getNumerical().doubleValue() * right.getNumerical().doubleValue());
			}
			else{ //else (both are integers)  : return an int Value
				value = new Value(left.getNumerical().intValue() * right.getNumerical().intValue());
			}
			break;
		case '/':
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ //if either one is double then return a double Value
				value = new Value(left.getNumerical().doubleValue() / right.getNumerical().doubleValue());
			}
			else{ //else (both are integers)  : return an int Value
				value = new Value(left.getNumerical().intValue() / right.getNumerical().intValue());
			}
			break;

		}

		return value;
	}

	
	
	@Override
	public Value visitDelayStatement(@NotNull MyGParser.DelayStatementContext ctx) {
		
		ArrayList<ParseTree> bodyNode = new ArrayList<ParseTree>();
		ArrayList<String> idParam = new ArrayList<String>();
		
		for(int i = 0; i < ctx.expression().size() ; i++){
			bodyNode.add(ctx.expression(i));
		}

		Function function = new Function(idParam, bodyNode, this.memory);
		Value value = new Value(function);
		
		return value;
		
	}

	
	@Override
	public Value visitHead(@NotNull MyGParser.HeadContext ctx) {

		List list = null;
		Value rValue;
		
		if(ctx.headSt().expression() != null){  // or the first conditional expression to the result if it exists
			list = visit(ctx.headSt().expression()).getList();
		}
		
		rValue = list.first();
		
		return rValue;
		
	}

	@Override
	public Value visitTail(@NotNull MyGParser.TailContext ctx) {
		List list = null;
		Value rValue;
		
		if(ctx.tailSt().expression() != null){  // or the first conditional expression to the result if it exists
			list = visit(ctx.tailSt().expression()).getList();
		}
		
		List restList = new List(list.rest());
		
		rValue = new Value(restList);
		
		return rValue;
		
	}
	
	
	@Override
	public Value visitAppend(@NotNull MyGParser.AppendContext ctx) {
		List appendTo = null;
		
		appendTo = visit(ctx.expression(0)).getList();
		for(int i = 1; i < ctx.expression().size(); i++){
			Value element = visit(ctx.expression(i));
			appendTo.append(element);
		}
		
		Value rValue = new Value(appendTo);
		
		return rValue;
		
	}
	
	@Override
	public Value visitPrepend(@NotNull MyGParser.PrependContext ctx) {
		List prependTo = null;
		
		prependTo = visit(ctx.expression(0)).getList();
		for(int i = 1; i < ctx.expression().size(); i++){
			Value element = visit(ctx.expression(i));
			prependTo.prepend(element);
		}

		return new Value(prependTo);
		
	}
	
	@Override
	public Value visitInputStatement(@NotNull MyGParser.InputStatementContext ctx) {
	    Scanner input = new Scanner(System.in);
	    
	    if(ctx.ID().getText().equalsIgnoreCase("str")){
	    	String answer= input.nextLine();
	    	input.close();
	    	return new Value(answer);
	    }
	    
	    else if (ctx.ID().getText().equalsIgnoreCase("int")){
	    	int answer = input.nextInt();
	    	input.close();
	    	return new Value(answer);
	    }
	    
	    input.close();
		
		return new Value();
		
	}
	
	@Override
	public Value visitApply (@NotNull MyGParser.ApplyContext ctx) { 
		
		//HOW APPLY WORKS:
	    //(apply f args)
	    //(apply f x args)
	    //(apply f x y args)

	    //Applies fn f to the argument list formed by prepending intervening arguments(for example x,y) to args.
		
		Function function = null;
		ArrayList<Value> parameters = new ArrayList<Value>();
	
		int listIndex = ctx.expression().size()-1;
		
		function = visit(ctx.expression(0)).getFunction();
		
		if(visit(ctx.expression(listIndex)).getType() != "LIST"){
			System.out.println("Last argument of apply must always be list");
			return new Value();
		}
		
		else{
			parameters = visit(ctx.expression(listIndex)).getList().elements;
			ArrayList<Value> accumulator = new ArrayList<Value>();
			for(int i = 1; i < ctx.expression().size()-1; i++){ //size-1 because the last value will always be the list to apply to!
				accumulator.add(visit(ctx.expression(i)));
			}
			parameters.addAll(0, accumulator);
		}
		
		Value value;

		value = function.invoke(parameters);

		return value;
	}
	
	
	@Override
	public Value visitIfStatement(@NotNull MyGParser.IfStatementContext ctx) {
		
		
		ArrayList<Value> extraConditions = new ArrayList<Value>();
		Value value = new Value();
		Boolean result = null; //this initialisation could be a problem.
		
		
		if(ctx.expression(0) != null){  // or the first conditional expression to the result if it exists
			result = visit(ctx.expression(0)).getBoolean();
		}
		
		for (int i = 1; i < ctx.expression().size(); i++) { // now add all the subsequent conditions if they exist
			if (ctx.expression(i) != null) {
				extraConditions.add(visit(ctx.expression(0)));
			}
		}
		
		
		for (int i = 0; i < extraConditions.size(); i++){ //and check them against the previous ones using the operator
			if (ctx.boolOper(i) != null) {
				switch (ctx.boolOper(i).getText()) {
				case "and":
					result = result & extraConditions.get(i).getBoolean();
					break;
				case "or":
					result = result | extraConditions.get(i).getBoolean();
					break;
				}
			}
		}
		
		
		//System.out.println(condition.getBoolean());
		
		if (result != null) {
			if (result) {
				value = visit(ctx.consequent());
			} else {
				if (ctx.alternative() != null)
					value = visit(ctx.alternative());
			}
		}

		return value;
	}

	
	@Override
	public Value visitBoolCheck(@NotNull MyGParser.BoolCheckContext ctx) {
		
		Value left = new Value();
		Value right = new Value();
		Value rValue = new Value();
		
		left = visit(ctx.expression(0));
		right = visit(ctx.expression(1));
		
		switch(ctx.boolOper().getText()){
		case "and":
			rValue = new Value(left.getBoolean() && right.getBoolean());
			break;
		case "or":
			rValue = new Value(left.getBoolean() || right.getBoolean());
		}

		
		return rValue;
	}
		
	
	@Override
	public Value visitBoolNeg(@NotNull MyGParser.BoolNegContext ctx) {
		Boolean bool = visit(ctx.expression()).getBoolean();
		return new Value(!bool);
	}
	
	@Override
	public Value visitBoolExpress(@NotNull MyGParser.BoolExpressContext ctx) {
		
		Value left = visit(ctx.expression(0));

		Value right = visit(ctx.expression(1));
		
		//String typeLeft = left.getType();
		//String typeRight = right.getType();

		if(left.getType() != "INTEGER" && left.getType() != "DOUBLE"){
			System.out.println(left.printSelf() + " " + "Left is not of numerical type");
		}
		if(right.getType() != "INTEGER" && right.getType() != "DOUBLE"){
			System.out.println(right.printSelf() + " " + "right is not of numerical type");
		}

		Value value = new Value();
			switch (ctx.relOper().getText()) {
			case ">":
				if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ 
					if (left.getNumerical().doubleValue() > right.getNumerical().doubleValue())
						value = new Value(true);
					else
						value = new Value(false);
				}
				else{ 
					if (left.getNumerical().intValue() > right.getNumerical().intValue())
						value = new Value(true);
					else
						value = new Value(false);
				}
			break;
		case "<":
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ 
				if (left.getNumerical().doubleValue() < right.getNumerical().doubleValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			else{ 
				if (left.getNumerical().intValue() < right.getNumerical().intValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			break;
		case "<=":
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ 
				if (left.getNumerical().doubleValue() <= right.getNumerical().doubleValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			else{ 
				if (left.getNumerical().intValue() <= right.getNumerical().intValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			break;

		case ">=":
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ 
				if (left.getNumerical().doubleValue() >= right.getNumerical().doubleValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			else{ 
				if (left.getNumerical().intValue() >= right.getNumerical().intValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			break;

		case "==":
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ 
				if (left.getNumerical().doubleValue() == right.getNumerical().doubleValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			else{ 
				if (left.getNumerical().intValue() == right.getNumerical().intValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			break;

		case "!=":
			if(left.getType() == "DOUBLE" || right.getType() == "DOUBLE"){ 
				if (left.getNumerical().doubleValue() != right.getNumerical().doubleValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			else{ 
				if (left.getNumerical().intValue() != right.getNumerical().intValue())
					value = new Value(true);
				else
					value = new Value(false);
			}
			break;
		}
		
		return value;
		
	}
	
	@Override
	public Value visitPrintStatement(@NotNull MyGParser.PrintStatementContext ctx) {
		
		//ArrayList<Value> parameters = new ArrayList<Value>();
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < ctx.expression().size(); i++){
			Value val = visit(ctx.expression(i));
			builder.append(val.printSelf());
			builder.append(" ");
			
		}
		
		System.out.println(builder.toString());
		return new Value(builder.toString());
	}
	
	@Override
	public Value visitNullCheck(@NotNull MyGParser.NullCheckContext ctx) {
		
		String s = visit(ctx.expression()).getType();

		Boolean result = false;
		
		if(s == "NULL"){
			result = true;
		}
		else if( s == "LIST"){ //empty list is null too!
			if (visit(ctx.expression()).getList().elements.isEmpty()){
				result = true;
			}
		}
		
		Value rV = new Value(result);
		
		return rV;
		
	}
	
	
	@Override
	public Value visitListCheck(@NotNull MyGParser.ListCheckContext ctx) {
		
		String s = visit(ctx.expression()).getType();

		Boolean result = false;
		
		if(s == "LIST"){
			result = true;
		}
		
		Value rV = new Value(result);
		
		return rV;
		
	}

	@Override
	public Value visitFunCreation(@NotNull MyGParser.FunCreationContext ctx) {

		// TODO: ADD PARAMETERS DECLARED INSIDE FUNCTION BODY TO ITS ENVIROMENT

		ParseTree idNode = ctx.ID(0);
		ArrayList<ParseTree> bodyNode = new ArrayList<ParseTree>();
		String id = idNode.getText();
		String variadicParam = "";
		int varindex = 0;
		boolean variadicFunction = false;
		ArrayList<String> idParam = new ArrayList<String>();
		Function function;
		Map<String, Value> tempMem = this.memory; //only useful if we have default arguments, otherwise we could just pass memory to function constructor immediately
		int nDef = 0;
		
		
		for(int i = 0; i < ctx.expression().size() ; i++){
			bodyNode.add(ctx.expression(i));
		}

		for (int i = 1; i < ctx.ID().size(); i++) { //remember : we start from 1 because ID(0) is the name of the function we are defining
			idParam.add(ctx.ID(i).getText());
			varindex += 1; //variadicID is either first ( so this never runs and it remains 0), or its after all the regular ids (in which case this runs and increments to the last position where vararg should be
		}
		
		for(int i = 0; i < ctx.defaultID().size(); i++ ){
			idParam.add(ctx.defaultID(i).ID().getText());
			varindex += 1; //as above, we increment the pointer to the place that the variadic argument will eventually be placed
			tempMem.put(ctx.defaultID(i).ID().getText(),visit(ctx.defaultID(i).expression(i)));
			nDef += 1;
		}
		
		
		for (int i = 0; i < ctx.variadicID().size(); i++){ //remember : there can only be zero or one variadic argument!
			variadicFunction = true;
			variadicParam = ctx.variadicID(i).getText().substring(1, ctx.variadicID(i).getText().length()); //trim the leading (&)
		}
		
		if(variadicFunction == false){
			function = new Function(idParam, bodyNode, tempMem);
			function.incrementDefaults(nDef);
		}
		else{
			function = new Function(idParam,variadicParam,varindex,bodyNode,tempMem);
			function.incrementDefaults(nDef);
		}
		Value value = new Value(function);
		memory.put(id, value);

		return value;
	}


	@Override
	public Value visitFunCallFC(@NotNull MyGParser.FunCallFCContext ctx) {

		String key = ctx.ID().getText();

		Function function = null;

		ArrayList<Value> parameters = new ArrayList<Value>();
		
		
		for(int i = 0; i < ctx.expression().size(); i++){
			Value val = visit(ctx.expression(i));
			parameters.add(val);
		}
		
		

		if (memory.containsKey(key)) {
			function = memory.get(key).getFunction();
			//System.out.println("function exists");
		}
		

		Value value;

		value = function.invoke(parameters);

		return value;
	}
	
	@Override
	public Value visitAnonCreation(@NotNull MyGParser.AnonCreationContext ctx) {

		//ParseTree idNode = ctx.ID(0);
		ArrayList<ParseTree> bodyNode = new ArrayList<ParseTree>();
		//String id = idNode.getText();
		ArrayList<String> idParam = new ArrayList<String>();
		
		for(int i = 0; i < ctx.expression().size() ; i++){
			bodyNode.add(ctx.expression(i));
		}

		for (int i = 0; i < ctx.ID().size(); i++) {
			idParam.add(ctx.ID(i).getText());
		}

		Function function = new Function(idParam, bodyNode, this.memory);
		Value value = new Value(function);
		//System.out.println("created anon");
		//memory.put(id, value);

		return value;
	}
	
	@Override
	public Value visitAnonCall(@NotNull MyGParser.AnonCallContext ctx) {
		
		//System.out.println("Anon invoked");
		
		Value function = visit(ctx.anonCreation());

		ArrayList<Value> parameters = new ArrayList<Value>();
		
		
		for(int i = 0; i < ctx.expression().size(); i++){
			Value val = visit(ctx.expression(i));
			parameters.add(val);
		}
		
		
		Value rValue = new Value();
		
		rValue = function.getFunction().invoke(parameters);

		return rValue;
	}
	
	
	@Override
	public Value visitListCreation(@NotNull MyGParser.ListCreationContext ctx) {
		
		ArrayList<Value> container = new ArrayList<Value>();
		
		
		for(int i = 0; i < ctx.expression().size(); i++){
			Value val = visit(ctx.expression(i));
			container.add(val);
		}
			

		List list = new List(container);
		Value value = new Value(list);
		
		return value;
	}
	
	
	@Override
	public Value visitMapCreation(@NotNull MyGParser.MapCreationContext ctx) {
		
		HashMap<String,Value> container = new HashMap<String,Value>();
		
		
		for(int i = 0; i < ctx.STRING().size(); i++){
			String key = ctx.STRING(i).getText();
			Value val = visit(ctx.expression(i));
			container.put(key, val);
		}
			

		MyMap map = new MyMap(container);
		Value value = new Value(map);
		
		return value;
	}
	
	@Override
	public Value visitMapAdd(@NotNull MyGParser.MapAddContext ctx) {
		
		
		MyMap map = memory.get(ctx.ID().getText()).getMap();

		for (int i = 0; i < ctx.STRING().size(); i++) { // first id is the map to operate on
			String key = ctx.STRING(i).getText();
			Value val = visit(ctx.expression(i));
			map.add(key, val);
		}
		
		return new Value(map);
	}
	
	
	@Override
	public Value visitMapRemove(@NotNull MyGParser.MapRemoveContext ctx) {
		
		MyMap map = memory.get(ctx.ID().getText()).getMap();

		for (int i = 0; i < ctx.STRING().size(); i++) { // first id is the map to operate on
			String key = ctx.STRING(i).getText();
			map.remove(key);
		}
		
		return new Value(map);
	}
	
	@Override
	public Value visitMapGet(@NotNull MyGParser.MapGetContext ctx) {
		
		MyMap map = memory.get(ctx.ID().getText()).getMap();
		Value rValue = new Value(); //will be a single value if we only fetch a single key or a list if we fetch more than one
		ArrayList<Value> container = new ArrayList<Value>();
		

		if(ctx.STRING().size() == 1){
			rValue = map.get(ctx.STRING(0).getText());
		}
		else{
			for (int i = 0; i < ctx.STRING().size(); i++) { // first id is the map to operate on
				String key = ctx.STRING(i).getText();
				rValue = new Value(container.add(map.get(key)));
			}
		}
		return rValue;
	}

	@Override
	public Value visitLoadStatement(@NotNull MyGParser.LoadStatementContext ctx) {
		String filename = ctx.FILENAME().toString().substring(2, ctx.FILENAME().toString().length()-2);
		MyGLexer lexer;
		try {
			lexer = new MyGLexer(new ANTLRFileStream(filename));
			MyGParser parser = new MyGParser(new CommonTokenStream(lexer));
			ParseTree tree = parser.program();
			LibVisitor visitor = new LibVisitor();
			visitor.visit(tree);
			Map<String, Value> tempMem = this.memory;
			if(ctx.ID(0).getText() == "*"){ // if its the kleene star just add copy the visitor's memory
				tempMem = visitor.memory;
			}
			else{
				for (int i = 0; i < ctx.ID().size(); i++) {  //else just add the values that map to the IDs you passed as arguments in load
					if (visitor.memory.containsKey(ctx.ID(i).getText())) {
						tempMem.put(ctx.ID(i).getText(),visitor.memory.get(ctx.ID(i).getText()));
					}
				}
			}
			this.memory = tempMem;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new Value();
	}
	
	@Override
	public Value visitLoop(@NotNull MyGParser.LoopContext ctx) {
				
		boolean run = true;
		
		Value rValue = new Value();
		
		ArrayList<Value> extraConditions = new ArrayList<Value>();
		Value value = new Value();
		Boolean result = null; //this initialisation could be a problem.		
		
		
		while(run){
					
			if(ctx.expression(0) != null){  // or the first conditional expression to the result if it exists
				result = visit(ctx.expression(0)).getBoolean();
			}
			
			for (int i = 1; i < ctx.expression().size(); i++) { // now add all the subsequent conditions if they exist
				if (ctx.expression(i) != null) {
					extraConditions.add(visit(ctx.expression(0)));
				}
			}
			
			
			for (int i = 0; i < extraConditions.size(); i++){ //and check them against the previous ones using the operator
				if (ctx.boolOper(i) != null) {
					switch (ctx.boolOper(i).getText()) {
					case "and":
						result = result & extraConditions.get(i).getBoolean();
						break;
					case "or":
						result = result | extraConditions.get(i).getBoolean();
						break;
					}
				}
			}
			
			
			//System.out.println(condition.getBoolean());
			
			if (result != null) {
				if (result) {
					rValue = visit(ctx.consequent());
					run = false;
				} else {
					if (ctx.alternative() != null)
						rValue = visit(ctx.alternative());
				}
			}
			
			//------------------------------------------------------------------//
			
			Function f = null;
			String key = ctx.funCallFC().ID().getText();
			
			if (memory.containsKey(key)) {
				f = memory.get(key).getFunction();
				//System.out.println("function exists");
			}
			
			for(int i = 0; i < ctx.funCallFC().expression().size(); i++){
				Value val = visit(ctx.funCallFC().expression(i));
				memory.put(f.params.get(i), val);
			}
			
			
		}
		
		
		return rValue;
	}
	
	
	@Override
	public Value visitRandom(MyGParser.RandomContext ctx) {
		int max = visit(ctx.expression(0)).getInteger();
		int min = visit(ctx.expression(1)).getInteger();
		
		Random randomGenerator = new Random();
		double num = randomGenerator.nextDouble()*(max-min) + min;
		
		return new Value(num);
	}
	
	
}
