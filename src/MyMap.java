import java.util.HashMap;


public class MyMap {
	HashMap<String,Value> map = new HashMap<String,Value>();
	
	
	public MyMap(HashMap<String,Value> map){
		this.map = map;
	}
	
	
	public HashMap<String,Value> add(String key,Value value){
		this.map.put(key, value);
		return map;
	}
	
	public HashMap<String,Value> remove(String key){
		this.map.remove(key);
		return map;
	}
	
	public Value get(String key){
		return map.get(key);
	}
}
