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

		System.out.println("left: " + left.getInteger());

		Value right = visit(ctx.expression(1));

		System.out.println("right: " + right.getInteger());

		Value value = new Value();
		switch (ctx.op.getText().charAt(0)) {
		case '+':
			value = new Value(left.getInteger() + right.getInteger());
			break;
		case '-':
			value = new Value(left.getInteger() - right.getInteger());
			break;
		}

		System.out.println("value: " + value.getInteger());

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
		System.out.println("ASSIGNED: " + id + " with value "
				+ value.getInteger());
		return new Value();
	}

	@Override
	public Value visitInvocation(@NotNull MyGParser.InvocationContext ctx) {
		System.out.println("Invoked: " + ctx.ID().getText());
		String id = ctx.ID().getText();
		if (memory.containsKey(id))
			return memory.get(id);
		return null;
	}

	@Override
	public Value visitParen(@NotNull MyGParser.ParenContext ctx) {

		return visit(ctx.expression());
	}

	@Override
	public Value visitMulDiv(@NotNull MyGParser.MulDivContext ctx) {

		Value left = visit(ctx.expression(0));

		System.out.println("left: " + left.getInteger());

		Value right = visit(ctx.expression(1));

		System.out.println("right: " + right.getInteger());

		Value value = new Value();
		switch (ctx.op.getText().charAt(0)) {
		case '*':
			value = new Value(left.getInteger() * right.getInteger());
			break;
		case '/':
			value = new Value(left.getInteger() / right.getInteger());
			break;

		}

		System.out.println("value: " + value.getInteger());

		return value;
	}

	@Override
	public Value visitFunCreation(@NotNull MyGParser.FunCreationContext ctx) {

		
		//TODO:  ADD PARAMETERS DECLARED INSIDE FUNCTION BODY TO ITS ENVIROMENT
		
		ParseTree idNode = ctx.ID(0);
		ParseTree bodyNode = ctx.expression();
		String id = idNode.getText();
		String idParam = ctx.ID(1).getText();

		Function function = new Function(idParam, bodyNode, this.memory);
		Value value = new Value(function);
		memory.put(id, value);
		
		return value;
	}

	@Override 
	public Value visitFunCall(@NotNull MyGParser.FunCallContext ctx) {
		
		
		System.out.println("HI");
		
		String key = ctx.ID(0).getText();
		String key2 = ctx.ID(1).getText();

		Function function = null;
		Value parameter = null;
		Value value;

		if (memory.containsKey(key)) {
			function = memory.get(key).getFunction();
		}
		
		if (memory.containsKey(key2)) {
			parameter = memory.get(key2);
		}		
		
		value = function.invoke(parameter);
		
		System.out.println(value.getInteger());
		
		return value;
	}

}
