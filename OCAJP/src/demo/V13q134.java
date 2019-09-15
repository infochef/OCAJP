package demo;

class Student{
	String name;
	public Student(String name) {
		this.name=name;
	}
	}
public class V13q134{
	public static void main(String[] args) {
		String[] st=new String[3];
		st[1]=new String("R");
		st[2]=new String("D");
		for(String su:st) {
			System.out.println(su);
		}
	}
}
