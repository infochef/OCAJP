package demo;

public class V13q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr= {{},{"D","E"}};
		//System.out.println(arr [0] [2]);
		System.out.println(arr.length);
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +"");
				if(arr[i][j].equals("B")) {
					break;
			}
		}
	//continue;
	}

}
}
