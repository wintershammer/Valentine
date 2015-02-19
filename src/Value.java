public class Value {

	static enum ValType {
		DOUBLE, BOOLEAN,INTEGER,FUNCTION
	};

	Double d;
	Function f;
	Boolean b;
	Integer i;
	ValType curType;

	public Value() {
		this(0.0);
	}

	public Value(Double d) {
		this.d = d;
		this.curType = ValType.DOUBLE;
	}
	
	public Value(Function f){
		this.f = f;
		this.curType = ValType.FUNCTION;
	}
	
	public Value(Integer i){
		this.i = i;
		this.curType = ValType.INTEGER;
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
	
	public Function getFunction(){
		if (this.curType != ValType.FUNCTION){
			System.out.println("NOT A FUNCTION ");
		}
		
		return this.f;
	}
	
	public Integer getInteger() {
		if(this.curType != ValType.INTEGER){
			System.out.println("NOT A INTEGER");
		}
		return this.i;
	}

}