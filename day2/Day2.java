package day2;

public class Day2 {
	private int Roll;
	private  String Name;
	private float Per;
	public void initStudent()
	{
		Roll=12;
		Name="rahul";
		Per=29.31f;
	}

	public void printDetails()
	{
		
		System.out.println(" RollNo="+Roll+" Name="+Name+ " Percentage="+Per);
	}
	
	public int getRoll()
	{
		return Roll;
	}
	public void setRoll(int r)
	{
		Roll=r;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String r)
	{
		Name=r;
	}
	public float getPer()
	{
		return Per;
	}
	public void setper(float r)
	{
		Per=r;
	}

}
