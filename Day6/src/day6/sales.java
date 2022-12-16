package day6;

public class sales extends emp {

	private int sal_amt;
	private double comm;
	
	public sales()
	{
		sal_amt=3454;
		comm=3.2;
	}
	
	public sales(int id,String nm,double sal,int s,double c)
	{
		super(id,nm,sal);
		sal_amt=s;
		comm=c;
	}
	
	public String toString()
	{
		return super.toString() +" sales "+sal_amt+" commission " +comm;
	           //denote the super class toString
	
	}
	
	public double calcomm()
	{
		return sal_amt*comm;
	}
	
	
	
}
