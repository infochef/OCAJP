package demo;

public class V13q102 {
static int count=0;
	int i=0;
	public void changeCount() {
		while (i<5) {
			i++;
			count++;
			
		}
	}
public static void main(String [] args) {
	V13q102 check1=new V13q102();
	V13q102 check2=new V13q102();
check1.changeCount();
System.out.println(check1.count +":"+ check2.count);
check2.changeCount();
	System.out.println(check1.count +":"+ check2.count);
}
}
