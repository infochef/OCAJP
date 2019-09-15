package V11;
class AB{
	public AB() {
		System.out.println("A");
	}
}
class BB extends A{
	public BB() {
		System.out.println("B");
	}
}
public class Q42 extends B {
	
	public Q42() {
		System.out.println("C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q42 c=new Q42();

	}

}
