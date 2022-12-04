package day4;

public class Var {

public static void add(String a,int... z)
{
	int sum=0;
	float avg;
	for(int x:z)
	{
	sum=sum+x;
	}
	avg=(float)sum/z.length;
	System.out.println("add ="+avg);
}
public static void main(String args[])
{
	add("vk");
	add("vijay",20,23);
	
}
}


