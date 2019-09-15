package V11;
class MyException extends RuntimeException{}

public class Q125 {
	public static void method1() {
		try {
			throw Math.random() > 0.5 ? new RuntimeException():new MyException();
		}
		catch(RuntimeException re) {
			System.out.println("B");
			System.out.println(re);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(MyException ne) {
			System.out.println("A");
			System.out.println(ne);
		}

	}

}
