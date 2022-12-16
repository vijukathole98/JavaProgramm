package day6;

public class dev extends emp {
	private int pro;
	private double amt;
	
	public dev()
	{
		// emp() super class default constructor call 
		super();//optional 
		pro=1;
		amt=234.7;
		
	}
	public dev(int id,String nm,double sal,int p,double a)
	{
		super (id,nm,sal);//call the public emp(int i,String n,double s) super class constructor
		pro=p;
		amt=a;
		
	}
	public String toString()
	{
		return super.toString() +" no of project "+pro+" amount " +amt;
	           //denote the super class toString
	
	}

}