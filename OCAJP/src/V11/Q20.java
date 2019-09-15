package V11;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] arr= {{"A", "B","C"},{"D","E"},{"G","J"}};
for(int i=0; i<arr.length;i++) {
	System.out.println(arr[i].length);
	for(int j=0;j<arr[i].length;j++) {
		
	     //System.out.println(arr[i].length);
		//System.out.println(arr[i][j]+" ");
		if(arr[i][j].equals("B")) {
			break;
		}
	}
	continue;
}
	}

}
