package V11;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var= "Hello World!";
		String res = var.toLowerCase();
		System.out.println(res);
		String var1="hello world!";
		String res1=var1.toLowerCase();
		System.out.println(res1);
		if(res.equalsIgnoreCase(res1)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}
