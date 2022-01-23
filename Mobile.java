package week_day1;

public class Mobile {

	public void sendMsg()
	{
		System.out.println("Happy Weekend");
	}
	public int makeCall()
	{
		int number=1234;
		return number;
	}
	public void saveContact(String name,long conNo)
	{
		System.out.println(name);
		System.out.println(conNo);
}
	public static void main(String[] args)
	{
		Mobile mobInfo= new Mobile();
		mobInfo.sendMsg();
		int number=mobInfo.makeCall();
		System.out.println("My Pin number is :"+number);
		mobInfo.saveContact("Aravind", 8148797918l);
	}
}