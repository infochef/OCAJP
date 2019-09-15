package V11;

public class Q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]= {2010,2013,2014,2015,2014};
		int key=2014;
		int count=0;
		for(int e=0; e<data.length;e++) {
			if(data[e] != key) {
				count++;
				continue;
			}
		}
	System.out.println(count+"Found");
	}

}
