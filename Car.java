package week5.day1;

public class Car extends Vehicle {
	public void automaticGearsystem() {
		System.out.println("no manual gear needed");
	}
    public void allowWheel() {
    	System.out.println("wheel moves");
    }

	public static void main(String[] args) {
		Car car = new Car();
		car.engine();
		car.automaticGearsystem();
		car.allowWheel();

	}

}
