//.. toString is overReader Method
// it is return the String format
//1.not need to explicit declaration, 
//2.and not naming confusion 
//3.no error.


package day3;

public class ToString {


	
	private  int empid;
		private  String Name;
		private double salary;
		static int id;
		
		

		public ToString()
		{
			id++;
			empid=id;
			Name="rahul";
			salary=222;
			
		}
		
		
		public ToString(String b,double c)
		{
				id++;
				this.empid=id;
				this.Name=b;
				this.salary=c;
				
			
			
		}
		
//		public void printDetails()
//		{
//			System.out.println("your id :"+empid+" name: "+Name+" balance "+salary);
//	
//		}
		
		public String toString()
		{
			return "your id :"+empid+" name: "+Name+" balance "+salary;
		}
	
	public static void main(String args[])
	{
//		ToString a1=new ToString();
//		a1.printDetails();
//		ToString a2=new ToString("ad",122);
//		a2.printDetails();
		
		ToString a2=new ToString();
		System.out.println(a2);
	
		
	}


}
