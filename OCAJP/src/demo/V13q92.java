package demo;

public class V13q92 {
	public static void main(String[] args) {
		String names[]= {"Thomas","Peter","Joseph"};
		//System.out.println(names.length);
		String pwd[]=new String [3];
		//System.out.println(pwd.length);
		int idx=0;
		try {
			for(int i=0; i<names.length;i++) {
				pwd[idx]=names[i].substring(2,6);
				idx++;
}
}
catch(Exception e) {
System.out.println("Invalid Name");
System.out.println(e);
		}
for(int i=0;i<pwd.length;i++) 
		{
System.out.println(pwd[i]);
		}
	}

}
