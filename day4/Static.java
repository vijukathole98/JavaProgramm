package day4;

public class Static {


	
		private int accNo;
		private  String ownerName;
		private double balance;
		static float rate;
		static int count;
		
		static
		{
			rate=7.2f;
		}
		

		public Static()
		{
			accNo=12;
			ownerName="rahul";
			balance=2900.31;
			count++;
		}
		public Static(int a,String b,double c)
		{
			count++;
			accNo=a;
			ownerName=b;
			balance=c;
			
			accNo=count;
			ownerName=b;

		}
		
		public void printStatic()
		{
			System.out.println("your ac :"+accNo+" name: "+ownerName+" balance "+balance+" rate"+rate+" count of "+count);
		}
		public static void showrate()
		{
			System.out.println("rate"+rate);
		}
		
	
	public static void main(String args[])
	{
		//syntax
		//class name reference name=new class name();
		
		Static d1=new Static();
		System.out.println("your account details:");
		d1.printStatic();
		
		Static d2=new Static(13,"ad",2345.6);
		System.out.println("your account details:");
		d2.printStatic();

		showrate();
		
		
	
	}
}



