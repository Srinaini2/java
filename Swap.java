package week1.day3;

public class Swap {
	public void swapTwoNo(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap object=new Swap();
		object.swapTwoNo(10,20);

	}

}
