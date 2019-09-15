package demo;

class CC{
	public void test() {
		System.out.println("A");
	}
}
class B extends CC{
	public void test() {
		System.out.println("B");
	}
}
class C extends CC{
	public void test() {
		System.out.println("C");
	}
}

public class V19q95{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  CC b1=new CC();
  CC b2=new C();
  
  b1=(CC)b2;
  //CC b3=(B)b2;
  b1.test();
  b2.test();
	}

}
