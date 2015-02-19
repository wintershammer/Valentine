import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;


public class Function {
	String param;
	ParseTree body;
	Map<String, Value> enviroment = new HashMap<String, Value>();
	
	
	public Function(String param,ParseTree body,Map<String,Value> enviroment){
		this.param = param;
		this.body = body;
		this.enviroment = enviroment;
	}

	public Value invoke(Value arg){
		
		System.out.println("HI");
		
		Map<String, Value> newEnv = new HashMap<String,Value>();
		
		
		newEnv.putAll(enviroment); //include all the previous bindings!
		
		newEnv.put(this.param, arg);
		
		System.out.println("WTF" + newEnv + "WTF");
		
		
		MyVisitor evaluate =  new MyVisitor();
		
		evaluate.setEnviroment(newEnv);
		
		
		Value val = evaluate.visit(body);
		
		return val;
		
		
	}
	
	
	
}
