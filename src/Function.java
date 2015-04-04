import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;


public class Function {
	ArrayList<String> params = new ArrayList<String>();
	ArrayList<ParseTree> body = new ArrayList<ParseTree>();
	Map<String, Value> enviroment = new HashMap<String, Value>();
	String variadicParam = "";
	boolean variadic = false;
	int variadicIndex;
	
	
	public Function(ArrayList<String> params,ArrayList<ParseTree> bodyNode,Map<String,Value> enviroment){
		this.params.addAll(params);
		this.body = bodyNode;
		this.enviroment = enviroment;
	}

	public Function(ArrayList<String> params,String variadicParameter,int varindex,ArrayList<ParseTree> bodyNode,Map<String,Value> enviroment){ //variadic constructor
		this.params.addAll(params);
		this.body = bodyNode;
		this.enviroment = enviroment;
		this.variadicParam = variadicParameter;
		this.variadic = true;
		this.variadicIndex = varindex;
	}
	
	public Value invoke(ArrayList<Value> args){
		
		if(variadic == false){//if the function is not variadic (ie its of fixed arity), then we must check if the user a correct number of values for the invocation
			if(args.size() != this.params.size()){
				System.out.println("Error: You supplied an incorrect number of arguments"); //this should be more specific : where? to which function?
				return new Value(); //return a null value. should i handle this differently?
			}
		}
		
		Map<String, Value> newEnv = new HashMap<String,Value>();
		
		
		newEnv.putAll(enviroment); //include all the previous bindings!
		
	
		

		if(this.variadic == false){
			for(int i = 0; i < this.params.size() ; i++){
				newEnv.put(this.params.get(i), args.get(i));
			}
		}
		else{
			ArrayList<Value> accum = new ArrayList<Value>(); // accum is ArrayList instead of my own List because the List constructor adds a null value by default! So instead we make this an ArrayList and wrap it up later
			for(int i = 0; i < this.variadicIndex; i++){ //assign the regular args first
				newEnv.put(this.params.get(i), args.get(i));
			}
			for(int i = this.variadicIndex; i < args.size(); i++){ //assign the varArgs next
				accum.add(args.get(i));
			}
			List wrapper = new List(accum); //wrap em all up in a list. 
			newEnv.put(this.variadicParam,new Value(wrapper)); 
		}

		
		MyVisitor evaluate =  new MyVisitor();
		
		evaluate.setEnviroment(newEnv);
		
		Value val = new Value();
		
		for(ParseTree child : body){
			val = evaluate.visit(child);
		}
		
		return val;
		
		
	}
	
	
	
}
