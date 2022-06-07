package week1.day2;

public class Calculator {

	public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	
}
public void sub(int a,int b)
{
	int c=a-b;
	System.out.println(c);
}
public static void main(String[]args)
{
	Calculator cal=new Calculator();
	cal.add(20,23);
	cal.sub(12,8);
}

	}


