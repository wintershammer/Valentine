import java.util.HashMap;
import java.util.Map;

//is this even used? 

public abstract class Enviroment {
	Map<String, Value> map = new HashMap<String, Value>();

	public Enviroment() {
		this.map = new HashMap<String, Value>();
	}

	public void addEntry(String s, Value val) {
		map.put(s, val);
	}

	public abstract Value lookupSymbol(String s);

	public Value get(String s) {
		return lookupSymbol(s);
	}

	public boolean contains(Object key) {
		return map.containsKey(key);
	}

	public String toString() {
		return map.toString();
	}
}
