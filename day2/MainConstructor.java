package day2;

public class MainConstructor {
	public static void main(String args[])
	{
		//syntax
		//class name reference name=new class name();
		
		Constructor d1=new Constructor();//default no parameter
		d1.printDate();
		
		Constructor d2=new Constructor(15,10,2022);//using parameter
		d2.printDate();
		
	}

}
