package week1.day4;

public class AccessModifiers {
	public void send()
	{
		System.out.println("hiii");
	}
	private void recieve()
	{
		System.out.println("hello");
	}
	protected void call()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers object=new AccessModifiers();
		object.send();
		object.call();
		object.recieve();
		

	}

}
