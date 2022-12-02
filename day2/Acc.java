package day2;

public class Acc {
	private int accNo;
	private  String ownerName;
	private double balance;

	public void initAccount()
	{
		accNo=12;
		ownerName="rahul";
		balance=2900.31;
	}
	public Acc(int a,String b,double c)
	{
		accNo=a;
		ownerName=b;
		balance=c;
	}
	
	public void printAccount()
	{
		System.out.println("your ac :"+accNo+" name: "+ownerName+" balance "+balance);
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
