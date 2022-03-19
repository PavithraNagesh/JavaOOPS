package week5.day1;

public class BuyVehicle extends Audi {

	public static void main(String[] args) {
		BuyVehicle audi = new BuyVehicle();
		audi.engine();
		audi.automaticGearsystem();
		audi.allowWheel();
		audi.applyBrake();
		audi.openSunroof();
		Bike bike = new Bike();
		bike.engine();
		bike.soundHorn();
		bike.applyBrake();
		bike.discBreak();
		bike.electricBike();

	}

}
