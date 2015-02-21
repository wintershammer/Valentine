import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.codegen.model.LabeledOp;
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

	public Value visitPrintStatement(
			@NotNull MyGParser.PrintStatementContext ctx) {

		String id = ctx.ID().getText();
		if (memory.containsKey(id)) {
			Value value = memory.get(id);
			System.out.println(value.printSelf());
		}
		return null;
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
	public Value visitFunCall(@NotNull MyGParser.FunCallContext ctx) {

		String key = ctx.ID(0).getText();
		// String key2 = ctx.ID(1).getText();

		Function function = null;
		ArrayList<Value> parameters = new ArrayList<Value>();
		Value value;

		if (memory.containsKey(key)) {
			function = memory.get(key).getFunction();
		}

		for (int i = 1; i < ctx.ID().size(); i++) {
			String key2 = ctx.ID(i).getText();
			if (memory.containsKey(key2)) {

				parameters.add(memory.get(key2));
			}
		}

		value = function.invoke(parameters);

		return value;
	}

	@Override
	public Value visitFunCallInt(@NotNull MyGParser.FunCallIntContext ctx) {

		String key = ctx.ID().getText();

		Function function = null;
		// Value parameter1 = new Value(Integer.valueOf(ctx.INT(0).getText()));
		ArrayList<Value> parameters = new ArrayList<Value>();

		for (int i = 0; i < ctx.INT().size(); i++) {
			Value parameter = new Value(Integer.valueOf(ctx.INT(i).getText()));
			parameters.add(parameter);
		}

		// parameters.add(parameter1);

		if (memory.containsKey(key)) {
			function = memory.get(key).getFunction();
		}

		Value value;

		value = function.invoke(parameters);

		return value;
	}

	@Override
	public Value visitFunCallFC(@NotNull MyGParser.FunCallFCContext ctx) {

		String key = ctx.ID(0).getText();

		Function function = null;

		ArrayList<Value> parameters = new ArrayList<Value>();

		for (int i = 0; i < ctx.INT().size(); i++) {
			Value wtfs = new Value(Integer.valueOf(ctx.INT(i).getText()));
			parameters.add(wtfs);
		}
		
		for (int i = 1; i < ctx.ID().size(); i++) { // jump over index 0 of ID : its the called function's name
			String id = ctx.ID(i).getText();
			if (memory.containsKey(id)) {
				Value wtfs = memory.get(id);
				parameters.add(wtfs);
			}		
		}
		
		for (int i = 0; i < ctx.funCall().size(); i++) {
			Value wtfs = visit(ctx.funCall(i));
			parameters.add(wtfs);
		}

		for (int i = 0; i < ctx.funCallInt().size(); i++) {
			Value wtfs = visit(ctx.funCallInt(i));
			parameters.add(wtfs);
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
		
		for (int i = 0; i < ctx.ID().size(); i++) {
			String id = ctx.ID(i).getText();
			if (memory.containsKey(id)) {
				Value wtfs = memory.get(id);
				parameters.add(wtfs);
			}		
		}

		for (int i = 0; i < ctx.INT().size(); i++) {
			Value wtfs = new Value(Integer.valueOf(ctx.INT(i).getText()));
			parameters.add(wtfs);
		}

		
		for (int i = 0; i < ctx.funCall().size(); i++) {
			Value wtfs = visit(ctx.funCall(i));
			parameters.add(wtfs);
		}

		for (int i = 0; i < ctx.funCallInt().size(); i++) {
			Value wtfs = visit(ctx.funCallInt(i));
			parameters.add(wtfs);
		}
		Value rValue = new Value();
		
		rValue = function.getFunction().invoke(parameters);

		return rValue;
	}
}
