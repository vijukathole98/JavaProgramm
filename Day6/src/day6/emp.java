package day6;


public class emp {
	private int id;
	private String name;
	protected double salary;// SCops-- within pkg and out side the pkg within there subclass.
	private double hr,pa,dba;
	
	public emp()
	{
		id=1;
		name="vk";
		salary=123235.43;
		
	}
	public emp(int i,String n,double s)
	{
		id=i;
		name=n;
		salary=s;
		hr=salary*0.3;
		pa=salary*0.2;
		dba=salary*0.4;
		
	}
	public String toString()
	{
		return " id "+id+" name "+name+" sal "+salary;
	}
	
	public double calsal()
	{
		return salary+hr+pa+dba;
	}
}
