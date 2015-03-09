import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.codegen.model.LabeledOp;
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
			value = new Value(left.getInteger() + right.getInteger());
			break;
		case '-':
			value = new Value(left.getInteger() - right.getInteger());
			break;
		}

		return value;
	}

	@Override
	public Value visitInt(MyGParser.IntContext ctx) {
		return new Value(Integer.valueOf(ctx.INT().getText()));
	}

	@Override
	public Value visitBool(MyGParser.BoolContext ctx) {
		return new Value(Boolean.valueOf(ctx.BOOLEAN().getText()));
	}	
	
	
	@Override
	public Value visitString(MyGParser.StringContext ctx) {
		return new Value(ctx.getText());
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
			value = new Value(left.getInteger() * right.getInteger());
			break;
		case '/':
			value = new Value(left.getInteger() / right.getInteger());
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
			appendTo.append(appendTo, element);
		}
		
		Value rValue = new Value(appendTo);
		
		return rValue;
		
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
	public Value visitBoolExpress(@NotNull MyGParser.BoolExpressContext ctx) {
		
		Value left = visit(ctx.expression(0));

		Value right = visit(ctx.expression(1));
		
		String typeLeft = left.getType();
		String typeRight = right.getType();

		Value value = new Value();
			switch (ctx.relOper().getText()) {
			case ">":
			if (left.getInteger() > right.getInteger()) // should add a getType method on Value to compare more than integers
				value = new Value(true);
			else
				value = new Value(false);
			break;
		case "<":
			if (left.getInteger() < right.getInteger())
				value = new Value(true);
			else
				value = new Value(false);
		case "<=":
			if (left.getInteger() <= right.getInteger())
				value = new Value(true);
			else
				value = new Value(false);
			break;

		case ">=":
			if (left.getInteger() >= right.getInteger())
				value = new Value(true);
			else
				value = new Value(false);
			break;

		case "==":
			if (left.getInteger() == right.getInteger())
				value = new Value(true);
			else
				value = new Value(false);
			break;

		case "!=":
			if (left.getInteger() != right.getInteger())
				value = new Value(true);
			else
				value = new Value(false);
			break;
		}
		
		return value;
		
	}
	
	@Override
	public Value visitPrintStatement(@NotNull MyGParser.PrintStatementContext ctx) {

		Value printValue;
		
		printValue = visit(ctx.expression());
		
		System.out.println(printValue.printSelf());
		return null;
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
		ArrayList<String> idParam = new ArrayList<String>();
		
		for(int i = 0; i < ctx.expression().size() ; i++){
			bodyNode.add(ctx.expression(i));
		}

		for (int i = 1; i < ctx.ID().size(); i++) {
			idParam.add(ctx.ID(i).getText());
		}

		Function function = new Function(idParam, bodyNode, this.memory);
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
	public Value visitLoadStatement(@NotNull MyGParser.LoadStatementContext ctx) {
		String filename = ctx.FILENAME().toString().substring(2, ctx.FILENAME().toString().length()-2);
		MyGLexer lexer;
		try {
			lexer = new MyGLexer(new ANTLRFileStream(filename));
			MyGParser parser = new MyGParser(new CommonTokenStream(lexer));
			ParseTree tree = parser.program();
			LibVisitor visitor = new LibVisitor();
			visitor.visit(tree);
			Map tempMem = this.memory;
			if(ctx.ID(0).getText() == "*"){ // if its the kleene star just add copy the visitor's memory
				tempMem = visitor.memory;
			}
			else{
				for (int i = 0; i < ctx.ID().size(); i++) {  //else just add the values that map to the IDs you passed as arguments in load
					if (visitor.memory.containsKey(ctx.ID(i).getText())) {
						tempMem.put(ctx.ID(i).getText(),
								visitor.memory.get(ctx.ID(i).getText()));
					}
				}
			}
			this.memory = tempMem;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new Value();
	}
	
	
}
