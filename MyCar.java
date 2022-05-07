package week3.day1;

public class MyCar {

	public static void main(String[] args)
	{
		BMW bmwcar = new BMW();
		Car car = new Car();
		Vehicle vehicle = new Vehicle();
		bmwcar.autoPark();
		car.handBrake();
		car.turnAC();
		vehicle.applyBrake();
		vehicle.soundHorn();
	}
}