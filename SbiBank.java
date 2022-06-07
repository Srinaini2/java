package week4.day1;

public class SbiBank extends SBI {
	public void bankBalance() {
		System.out.println("200000");
	}
	public void maximumLoanAmount() {
		System.out.println("150000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI obj=new SbiBank();
		obj.BankBalance();
		obj.ITLoan();
		obj.maxLoanAmount();

	}
	@Override
	public void maxLoanAmount() {
		// TODO Auto-generated method stub
		
	}

}
