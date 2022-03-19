package week5.day1;

public class Calculator {
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public void add(float x, float y) {
		System.out.println(x+y);
	}
	public void add(long a, long b) {
		System.out.println(a+b);
	}
	public void add(short c, int d) {
		System.out.println(c+d);
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(3, 5);
		cal.add(33342.4633f, 444567.3344f);
		cal.add(538716734526l, 363982546454l);
		cal.add(43, 83);
	}

}
