package week1.day1;

public class Computer {
	String computerName="dell";
	char firstLetter='d';
	short ramSize=8;
	int memory=256;
	boolean isDamaged=true;
	double price=223.22;
	float frequencyRange=2.54f;
	long ipAddress=65435231;
	public static void main(String[]args)
	{
		Computer obj=new Computer();
		System.out.println(obj.computerName);
		System.out.println(obj.firstLetter);
		System.out.println(obj.ramSize);
		System.out.println(obj.memory);
		System.out.println(obj.isDamaged);
		System.out.println(obj.price);
		System.out.println(obj.frequencyRange);
		System.out.println(obj.ipAddress);
	}
	}
