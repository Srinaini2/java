package week1.day2;

public class Float {
	public float add(float a,float b)
	{
		float c=a+b;
		System.out.print(c);
		return c;
	}
	public void sub(float a,float b)
	{
		float c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float obj=new Float();
		float a=obj.add(10,10);
		System.out.println(a);
		obj.sub(a, 5);

	}

}
