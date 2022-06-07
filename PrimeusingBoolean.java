package week1.day4;

public class PrimeusingBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		boolean flag=true;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
				flag=false;
			}
		if(flag)
			System.out.println("prime");
		else
			System.out.println("not prime");

	}

}
