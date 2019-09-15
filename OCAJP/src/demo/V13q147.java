package demo;
class Tport{
	int x;
	Tport(){
		this(10);
	}
	Tport(int x){
		this.x=x;
	}
}
class Bus extends Tport{
	int y;
	Bus(){
		super(10);
	}
	Bus(int y){
		super(y);
		this.y=y;
	}
	public String toString() {
		return super.x + ":" + this.y;
	}
}

public class V13q147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tport y=new Bus(20);
		System.out.println(y);
	}

}
