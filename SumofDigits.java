package week1.day4;

public class SumofDigits {
	public void Sum(int n)
	{
		int rem,sum=0;
		while(n>0)
		{
			//33>0
			rem=n%10;
			//33%10=3,3
			sum=sum+rem;
			//sum=0+3=3+3=6
			n=n/10;
			//n=3
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofDigits obj=new SumofDigits();
		obj.Sum(33);

	}

}
