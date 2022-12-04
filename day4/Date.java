package day4;


public class Date {
	private int day,month,year;
	public Date()
	{
		day=12;
		month=12;
		year=12;
		
	}
	public Date(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	public String toString()
	{
		return +day+"/"+month+"/"+year;
	}
//public static void main(String args[])
//{
//	Date s=new Date();
//	System.out.println(s);
//
//}
}