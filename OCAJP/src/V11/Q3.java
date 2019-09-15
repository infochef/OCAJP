package V11;
class A{
	public void test() {
		System.out.println("A");
	}
}
class B extends A{
	public void test() {
		System.out.println("B");
	}
}
public class Q3 extends A {
	public void test() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A b1=new A();
		A b2=new Q3();
		b1=(A)b2;
		A b3=(Q3)b2;
		A b4=(Q3)b2;
		b1.test();
		b3.test();
	}

}
