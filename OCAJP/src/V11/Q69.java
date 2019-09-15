package V11;
class Vehicle{
	String type="4w";
	int maxSpeed=100;
	
	Vehicle(String type,int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
}
class Car extends Vehicle{
	String trans;
	
	Car(String trans){
		super("hello",8);
		this.trans=trans;
	}
	
	/*
	 * Car(String type,int maxSpeed, String trans){ super(type,maxSpeed);
	 * this(trans); }
	 */
}

public class Q69 {

}
