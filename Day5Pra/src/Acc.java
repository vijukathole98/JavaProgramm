
public class Acc  {
	private int accNo;
	private  String ownerName;
	private double balance;
	private Addr add;
	private Date doj;

	public Acc()
	{
		accNo=12;
		ownerName="rahul";
		balance=2900.31;
		add=new Addr();
		doj=new Date();
	}
	public Acc(int a,String b,double c,Addr A,Date d)
	{
		accNo=a;
		ownerName=b;
		balance=c;
		add=A;
		doj=d;
	}
	
	public String toString()
	{
		return "your ac : "+accNo+ " name: "+ownerName+" balance " +balance+ " Adreess " +add+" Date of =  "+doj;
	}
	public int getaccNo()
	{
		return accNo;
	}
	public void setaccNo(int r)
	{
		accNo=r;
	}
}
