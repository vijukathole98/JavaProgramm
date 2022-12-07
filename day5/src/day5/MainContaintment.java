package day5;

public class MainContaintment {
	public static void main(String args[])
	{

		Para a2=new Para();
		System.out.println(a2);
		
		
		
		//parameterized constructor
		Para a3=new Para(10,"Ambika",120000.78,new Date(19,4,3421));
                                                //new Date(19,4,3421) using parameter
		                              //constructor to take object reference by (Date d).
		System.out.println(a3);

	}
}



