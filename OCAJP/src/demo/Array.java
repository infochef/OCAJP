package demo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[]=new int[3];
		int num2[]= {1,2,3,4,5};
		num1=num2;
		System.out.println(num1[4]);
		for(int i=0;i<num1.length;i++)
		{
			System.out.println(num1[i]);
		}

	}

}
