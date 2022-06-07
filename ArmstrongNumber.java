package week1.day4;

public class ArmstrongNumber {
	public void numberArm(int n)
	{
		int original=n;
		int cal=0,rem;
		while(n>0)
		{
			rem=n%10;
			cal=cal+(rem*rem*rem);
			n=n/10;
		}
		if(original==cal)
		{
			System.out.println("Given num is armstong");
		}
		else
		{
			System.out.println("given num is nit armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber object=new ArmstrongNumber();
		object.numberArm(153);

	}

}
