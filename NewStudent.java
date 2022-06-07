package week4.day3;

public class NewStudent {
	//override same methods with different
	public void getStudentInfo(int StudentId)//id
	{
		System.out.println("StudentId"+" "+StudentId);
	}
	public void getStudentInfo(int StudentId,String name)//id,name
	{
		System.out.println("StudentId"+" "+StudentId+" "+"name"+" "+name);
	}
	public void getStudentInfo(String email,long phoneNumber)//email,phone number
	{
		System.out.println("email"+ " "+email+" "+"phoneNumber"+" "+phoneNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 NewStudent obj=new NewStudent();
		    obj.getStudentInfo(211345);
		    obj.getStudentInfo(211545,"Sree");
		    obj.getStudentInfo("kamatamsrinaini@123",8615);
			}

		}
