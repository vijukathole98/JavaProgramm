package day6;
public class MainEmp {
	
	public static void main(String args[])
	{
		dev d1=new dev();
		System.out.println(d1);
		
		dev dd=new dev(11,"dfd",345,4,234);//dev(int id,String nm,double sal,int p,double a)
		System.out.println(dd);
	
	
		// sales file .. sales subclass
		sales d2=new sales();
		System.out.println(d2);

	    System.out.println("total salary = "+d2.calsal());
		
		sales d3=new sales();
		System.out.println(d3);
		
		System.out.println(" commission = "+d3.calcomm());
		System.out.println("total salary = "+d3.calsal());
	
	// manager file .. mgr subclass
		mgr d4=new mgr();
		System.out.println(d4);
		
		
		System.out.println("total salary = "+d3.calsal());
		System.out.println(" "+d4.salary);
		
		//Scope of Protected= within the pkg and out side the package who have SuperClass as Same.
		// using protected keyword we can access superclass datamember within the block 
		//or out side of the package who's have superclass as same.
		
	}

}