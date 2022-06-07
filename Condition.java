package week1.day3;

public class Condition {
	public void great()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Condition object=new Condition();
		object.great();

	}

}
