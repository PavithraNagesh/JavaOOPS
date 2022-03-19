package week5.day1;

public class PC extends Laptop {
	public void getSystemInfo() {
		super.getSystemInfo();//to get the parent class value
		System.out.println("MAC");
	}
public static void main(String[] args) {
	PC obj = new PC();
	obj.getSystemInfo();
}
}
