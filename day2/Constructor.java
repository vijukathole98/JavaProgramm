package day2;

public class Constructor {
	private int day,month,year;
	
	
	public Constructor()
	{
		day=12;
		month=12;
		year=2012;
	}
	public Constructor(int d, int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	
	public void printDate()
	{
		
		System.out.println(day+"/"+month+"/"+year);
	}
	/*public static void main(String args[])
	{
		//syntax
		//class name reference name=new class name();
		
		Constructor d1=new Constructor();//default no parameter
		d1.printDate();
		
		Constructor d2=new Constructor(15,10,2022);//with parameter
		d2.printDate();
		
	}*/

}
