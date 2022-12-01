package abc;

public class Demo {
	public static void main(String args[])
	{
		int n=10,m=5,sum;
		sum=n+m;
		System.out.println("Sum="+sum);
		
		if (n>m)
		{
			System.out.println(n+" is max");
			
			
		}
		else
		{
			System.out.println(m+" is max");
		}
		
		int l=3,fact=1,i;
		
		for (i=1;i<=l;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+l+" is "+fact);
	
	}
}
