public class Bike {
	private String Company;
	private String model;
	private double mileage;
	private int Fuelcapacity;
	private static int fuel = 5;
	public Bike(String Company, String model, double mileage, int Fuelcapacity )
	{
		this.Company=Company;
		this.model=model;
		this.mileage=mileage;
		this.Fuelcapacity=Fuelcapacity;
		//	System.out.println("company:"+Company+" model:"+model+" mileage:"+mileage+" Fuelcapacity:"+Fuelcapacity);
	}
	public void fuelTank(int fuel) {
		if(this.Fuelcapacity<fuel) {
			System.out.println("Warning : Fuel has Capacity only as : "+Fuelcapacity);
		}
		else{
			System.out.println("Tank Filled with : "+fuel);
		}
	}
	public void Distance(int fuel) {
		double distance = this.mileage*this.Fuelcapacity;
		System.out.println("distance :"+distance);
	}
	public void Display() {
		System.out.println("company : "+Company);
		System.out.println("Model : "+model);
		System.out.println("Mileage : "+mileage);	 
		System.out.println("Fuelcapacity : "+Fuelcapacity);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike("TVS","Jupiter",48,5);
		bike.fuelTank(fuel);
		bike.Distance(fuel);
		bike.Display();
	}
}
