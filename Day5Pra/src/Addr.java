

public class Addr {
	private String city;
	private int pin;
	public Addr()
	{
		city="pune";
		pin=1232;
		
	}
	public Addr(String c,int p)
	{
		city=c;
		pin=p;
	}
	public String toString()
	{
		return city+"pincode "+pin;
	}
//public static void main(String args[])
//{
//	Addr s=new Addr();
//	System.out.println(s);
//
//}
}


