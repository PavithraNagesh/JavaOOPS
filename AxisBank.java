package week5.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		super.deposit();
		System.out.println("Bank Deposits");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
		

		

	}

}
