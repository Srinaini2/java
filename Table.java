package week1.day3;

public class Table{
	public void mul(int i,int b)
	{
		for(int a=i;a<=10;i++)
		{
			int n=a*b;
			System.out.println(a+"*"+b+"="+n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table object=new Table();
		object.mul(1,2);

	}

}
