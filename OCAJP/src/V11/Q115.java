package V11;

public class Q115 {
	String myStr="7007";
	
	public void doStuff(String str) {
		int myNum=0;
		try {
			String myStr=str;
			myNum=Integer.parseInt(myStr);
		}catch(NumberFormatException ne) {
			System.err.println("Error");
		}
		System.out.println("myStr:" + myStr + ", myNum" + myNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q115 obj=new Q115();
		obj.doStuff("9009");

	}

}
