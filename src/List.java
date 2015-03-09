import java.util.ArrayList;


public class List {
	
	ArrayList<Value> elements = new ArrayList<Value>();
	
	public List(ArrayList<Value> values){
		this.elements = values;
	}
	
	public List(){
		this.elements.add(new Value());
	}
	
	public Value first(){
		if(elements.isEmpty() == true){
			return new Value() ; //add a null element
		}
		return elements.get(0);
	}
	
	public ArrayList<Value> rest(){
		ArrayList<Value> toReturn = new ArrayList<Value>();
		for(int i = 1;  i< elements.size(); i++){ //first handles index 0, rest returns 1 -> length (like cdr)
			toReturn.add(elements.get(i));
		}
		return toReturn;
	}
	
	public List append (List appendTo,Value element){
		
		this.elements.add(element);
		return appendTo;
		
	}
	
}
