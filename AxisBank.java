package week4.day3;

public class AxisBank extends RBI{
	public void saving()
	{
		System.out.println("Implementing overriding");
	}
	public static void main(String[]args) {
		AxisBank bank=new AxisBank();
		bank.saving();
		bank.deposit();
	}

	

}
