package week5.day1;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Windows 10");
	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();

	}

}
