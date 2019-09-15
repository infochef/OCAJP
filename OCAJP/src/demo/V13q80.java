package demo;

public class V13q80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num=10;
			int div=0;
			int ans=num/div;
		}
		catch(ArithmeticException ae) {
			int ans=0;
		}catch(Exception e) {
			System.out.println("Invalid Calculation");
		}
		System.out.println("Ans=");

	}

}
