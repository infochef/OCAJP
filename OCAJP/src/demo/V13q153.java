package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class V13q153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] arr= {"Hi","How","Are","You"};
       List<String> arrList=new ArrayList<>(Arrays.asList(arr));
       if(arrList.removeIf((String s)->{return s.length()<=2;})) {
    	   System.out.println("removed");
       }
       }
	}
