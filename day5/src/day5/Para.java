
//using parameter pass the values from other class object 

package day5;

public class Para {

			private  int empid;
				private  String Name;
				private double salary;
				private Date doj;
			public Para()
				{
					empid=1;
					Name="rahul";
					salary=222;
					doj=new Date();
					
				}

				public Para(int id,String b,double c,Date d)//(Date d) reference date class object
				{
						
						empid=id;
						Name=b;
						salary=c;
						doj=d;//reference Date class using parameter value

				}
				public String toString()
				{
					return "your id :"+empid+" name: "+Name+" balance "+salary+" date of join "+doj;
				}
			
//			public static void main(String args[])
//			{
//				
//				Para a2=new Para();
//				System.out.println(a2);
//				
//				
//				
//				//parameterized constructor
//				Para a3=new Para(10,"Ambika",120000.78,new Date(19,4,3421));
//                                                        //new Date(19,4,3421) using parameter
//				                              //constructor to take object reference by (Date d).
//				System.out.println(a3);
//				
//			}
		}




