package demo;

public class V13q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class ElectricAccount{
	private double kWh;
	private double rate=0.07;
	private double bill;
	
	public void addKWH(double kWh) {
		this.kWh+=kWh;
		this.bill=this.kWh*this.rate;
	
		
	}
}
