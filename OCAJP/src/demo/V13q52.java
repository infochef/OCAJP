package demo;

public class V13q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[] strs=new String[2];
  strs[1]="s";
  strs[0]="s";
 int idx= 0;
 for(String s:strs) {
	 strs[idx].concat("element"+idx);
	 idx++;
 }
 for(idx=0; idx<strs.length; idx++) {
	 System.out.println(strs[idx]);
 }
	}

}
