package demo;

import java.io.IOException;

public class V13q19 {
	void readCard(int cardNO) throws RuntimeException {
		System.out.println("RC");
	}
	void checkCard(int cardNO) throws RuntimeException
	{
		System.out.println("CC");
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		V13q19 ex=new V13q19();
		int cardNO=12345;
		ex.checkCard(cardNO);
	
			ex.readCard(cardNO);
	}

}
