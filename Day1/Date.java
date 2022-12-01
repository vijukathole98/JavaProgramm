package abc;

public class Date {
	private int day,month,year;
	
	public void initDate()
	{
		day=12;
		month=12;
		year=2012;
	}
	
	public void printDate()
	{
		
		System.out.println(day+"/"+month+"/"+year);
	}
	public static void main(String args[])
	{
		//syntax
		//class name reference name=new class name();
		
		Date d1=new Date();
		d1.initDate();
		d1.printDate();
		
		
		Date d2;
		d2=new Date();
		//d1.initDate();
		d2.printDate();
		
	}

}
