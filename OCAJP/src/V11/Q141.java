package V11;

public class Q141 {
	String name;
	boolean contract;
	double salary;
	Q141(){
		this.name=new String("Hello");
		this.contract=true;
		salary=100;
		
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q141 e=new Q141();
		e.name="Jeo";
		e.contract=true;
		e.salary=100.0f;
		System.out.println(e);

	}

}
