public class Value {

	static enum ValType {
		DOUBLE, BOOLEAN,INTEGER,FUNCTION, LIST,STRING, NULL,MAP
	};

	Double d;
	Function f;
	Boolean b;
	Integer i;
	List l;
	String s;
	ValType curType;
	MyMap m;

	public Value() {
		this.curType = ValType.NULL;
	}

	
	public Value(String s){
		this.s = s;
		this.curType = ValType.STRING;
	}
	
	public Value(Double d) {
		this.d = d;
		this.curType = ValType.DOUBLE;
	}
	
	public Value(Function f){
		this.f = f;
		this.curType = ValType.FUNCTION;
	}
	
	public Value(List l){
		this.l = l;
		this.curType = ValType.LIST;
	}
	
	public Value(Integer i){
		this.i = i;
		this.curType = ValType.INTEGER;
	}
	
	public Value(MyMap m) {
		this.m = m;
		this.curType = ValType.MAP;
	}

	public Value(Boolean b) {
		this.b = b;
		this.curType = ValType.BOOLEAN;
	}
	
	public Double getDouble(){
		if(this.curType != ValType.DOUBLE){
			System.out.println("NOT A DOUBLE");
		}
		return this.d;
	}
	
	public Boolean getBoolean(){
		if(this.curType != ValType.BOOLEAN){
			System.out.println("NOT A BOOLEAN");
		}
		return this.b;
	}
	
	public Function getFunction(){
		if (this.curType != ValType.FUNCTION){
			System.out.println("NOT A FUNCTION ");
		}
		
		return this.f;
	}
	
	public Integer getInteger() {
		if(this.curType != ValType.INTEGER){
			System.out.println("NOT AN INTEGER");
		}
		return this.i;
	}
	
	public List getList() {
		if(this.curType != ValType.LIST){
			System.out.println("NOT A LIST");
		}
		return this.l;
	}
	
	public MyMap getMap(){
		if(this.curType != ValType.MAP){
			System.out.println("NOT A MAP");
		}
		return this.m;
	}
	
	
	public String getType(){
		return this.curType.toString();
	}

	public String printSelf() {
		if(this.curType == ValType.DOUBLE){
			return this.getDouble().toString();
		}
		else if(this.curType == ValType.INTEGER){
			return this.getInteger().toString();
		}
		else if(this.curType == ValType.BOOLEAN){
			return this.getBoolean().toString();
		}
		else if(this.curType == ValType.FUNCTION){
			return this.getFunction().toString();
		}
		else if(this.curType == ValType.LIST){
			StringBuilder builder = new StringBuilder();
			if(l.elements.size() > 0){
				builder.append('(');
				for(Value element : l.elements){
					builder.append(element.printSelf());
					builder.append(",");
				}
				builder.replace(builder.length()-1, builder.length(), ")"); //replace the last coma with a closing paren
			}
			else{
				builder.append("null");
			}
			return builder.toString();
		}
		else if(this.curType == ValType.STRING){
			return this.s;
		}
		else if(this.curType == ValType.NULL){
			return null;
		}
		else if(this.curType == ValType.MAP){
			StringBuilder builder = new StringBuilder();
			builder.append('{');
			for(String key : m.map.keySet()){
				builder.append(key);
				builder.append(":");
				builder.append(m.map.get(key).printSelf());
				builder.append(",");
				}
			builder.replace(builder.length()-1, builder.length(), "}"); //replace the last coma with a closing paren
			return builder.toString();
		}
		
		return "NOT APPLICABLE";
	}

}