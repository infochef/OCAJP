package demo;

public class V13q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Vehicle{
	String type="4W";
	int maxspeed=100;
	
	Vehicle(String type, int maxspeed)
	{
		this.type=type;
		this.maxspeed=maxspeed;
	}
}
class Car extends Vehicle{
	String trans;
	Car(String trans)
	{
		super("Hello", 10);
		this.trans=trans;
	}
	Car(String type, int maxspeed, String trans)
	{
		super(type,maxspeed);
		//this.(trans);
	}
}
