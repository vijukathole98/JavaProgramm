package day6;

public class mgr extends emp {
	private String name;
	private double sal ;
	
	public mgr()
	{
		// emp() super class default constructor call 
		super();//optional 
		name="sagar";
		sal=2345434.7;
		
	}
	public mgr(int id,String nm,double sal,String nm1,double sall)
	{
		// emp() super class default constructor call 
		super(id,nm,sal);//optional 
		name=nm1;
		sal=sall;
		
	}
	public String toString()
	{
		return super.toString() +" name of mgr "+name+" salary " +sal;
	           //denote the super class toString
	
	}
	

}
