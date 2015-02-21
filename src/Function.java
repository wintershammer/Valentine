import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;


public class Function {
	ArrayList<String> params = new ArrayList<String>();
	ParseTree body;
	Map<String, Value> enviroment = new HashMap<String, Value>();
	
	
	public Function(ArrayList<String> params,ParseTree body,Map<String,Value> enviroment){
		this.params.addAll(params);
		this.body = body;
		this.enviroment = enviroment;
	}

	public Value invoke(ArrayList<Value> args){
		
		
		Map<String, Value> newEnv = new HashMap<String,Value>();
		
		
		newEnv.putAll(enviroment); //include all the previous bindings!
		
	
		

		
		for(int i = 0; i < this.params.size() ; i++){
			newEnv.put(this.params.get(i), args.get(i));
		}
		

		
		MyVisitor evaluate =  new MyVisitor();
		
		evaluate.setEnviroment(newEnv);
		
		
		Value val = evaluate.visit(body);
		
		
		return val;
		
		
	}
	
	
	
}
