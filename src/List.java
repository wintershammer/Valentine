import java.util.ArrayList;


public class List {
	
	ArrayList<Value> elements = new ArrayList<Value>();
	
	public List(ArrayList<Value> values){
		this.elements = values;
	}
	
	public List(){
		this.elements.add(new Value()); //null
	}
	
	public Value first(){
		if(elements.isEmpty() == true){
			return new Value() ; //return a null element
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
	
	public void append (Value element){
		this.elements.add(element);
		
	}
	
	public void prepend(Value element){
		this.elements.add(0, element);
	}
	
}
