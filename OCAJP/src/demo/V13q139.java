package demo;

public class V13q139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]arr=new int[2][4];
		System.out.println("Array length" + arr.length);
		
		arr[0]=new int[]{1, 2, 3, 5,7};
		arr[1]=new int[] {1, 3};
		for(int[]a:arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.println("Array length" + arr.length);
				System.out.println(a[i] + "");
			}
			System.out.println();
		}
	}

}
