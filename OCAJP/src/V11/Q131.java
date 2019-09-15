package V11;

public class Q131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strs=new String[2];
int idx=0;
System.out.println(strs[0]);
System.out.println(strs[1]);
//System.out.println(strs[2]);
int i=0;
String h="Hi";
String j=null;
String y="hello";
System.out.println(y.concat(h));
for(String s:strs) {
	System.out.println(strs[0]);
	System.out.println(strs[1]);
	System.out.println(null + " " + idx);
	
	idx++;
}
for(idx=0;idx<strs.length;idx++) {
	System.out.println(strs[idx]);
}
	}

}
