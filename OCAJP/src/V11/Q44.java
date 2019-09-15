package V11;

public class Q44 {
	int x;
	int y;
	public void doStuff(int x,int y) {
		this.x=x;
		y=this.y;
	}
	public void display() {
		System.out.println(x + " "+y + ":");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q44 m1=new Q44();
		m1.x=100;
		m1.y=200;
		
		Q44 m2=new Q44();
		m2.doStuff(m1.x, m1.y);
		
		m1.display();
		
		m2.display();
	}

}
