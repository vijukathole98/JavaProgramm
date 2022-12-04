package day4;

public class Cont {

		private  int empid;
			private  String Name;
			private double salary;
			private Date doj;
		public Cont()
			{
				empid=1;
				Name="rahul";
				salary=222;
				doj=new Date();
				
			}

			public Cont(int id,String b,double c)
			{
					
					empid=id;
					Name=b;
					salary=c;
					doj=new Date();

			}
			public String toString()
			{
				return "your id :"+empid+" name: "+Name+" balance "+salary+" date of join "+doj;
			}
		
		public static void main(String args[])
		{
			
			Cont a2=new Cont();
			System.out.println(a2);	
		}
	}



