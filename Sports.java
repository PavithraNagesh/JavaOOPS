package week5.day1;

public class Sports {
	public void acheiver(String  name,int medalCount) {
		System.out.println(name+" "+medalCount);
		
	}
	public void acheiver(String country ,String sportName, int rank) {
		System.out.println(country+" "+sportName+" "+rank);
	}
	public void acheiver(float weight, int height, long contactNo) {
		System.out.println(weight+" "+height+" "+contactNo);
	}
	public void acheiver(String tournamentName, long prizeMoney) {
		System.out.println(tournamentName+" "+prizeMoney);
	}

	public static void main(String[] args) {
		Sports obj = new Sports();
		obj.acheiver("Kiran", 11);
		obj.acheiver("India", "Hockey", 3);
		obj.acheiver(50, 180, 99943764);
		obj.acheiver("Olympics", 10000000);
		

	}

}
