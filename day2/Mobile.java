package day2;

public class Mobile {
	private String Name;
	private double Price;
	
	public void initMobile()
	{
		Name="realme";
		Price=15121.31;
	}
	public void printMobile()
	{
		System.out.println("Name ->"+Name+" and price-> "+Price);
	}
	public void setName(String r)
	{
		Name=r;
	}
	public String getName()
	{
		return Name;
	}
//	constructor
	public Mobile()
	{
		Name="realme";
		Price=15121.31;
	}
	public Mobile(String r,double t)
	{
		Name=r;
		Price=t;
	}
	
	
	
	public static void main(String args[])
	{
		Mobile d1=new Mobile();
		d1.initMobile();
		d1.printMobile();
		
		Mobile d2=new Mobile();
		
		d2.setName("oppo");
		d2.getName();
		
		System.out.println("all about device \n"+d2.getName());
		
//		cons
		
		Mobile d3=new Mobile("moto",12321.65);
		d3.printMobile();
		
	}
}
