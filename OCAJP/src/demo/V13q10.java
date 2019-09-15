package demo;

public class V13q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(2);
		String s="Hi";
		if (sb.equals(s))
		{
			System.out.println("M1");
		}
		else if(sb.toString().equals(s.toString()))
		{
			System.out.println("M2");
		}
		else {
			System.out.println("Not");
		}
		System.out.println(sb.toString());
		System.out.println(s.toString());

	}

}
