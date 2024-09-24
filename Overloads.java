import java.util.*;
class Trial
{
	void area(int l,int b)
	{
		System.out.println("area of rectangle = "+(l*b));
	}
	void area(int s)
	{
		System.out.println("area of square= "+(s*s));
	}
}
class Overloads
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the length and breadth of rectangle");
		int l= sc.nextInt();
		int b= sc.nextInt();
		System.out.println(" enter the side of square");
		int s= sc.nextInt();
		Trial obj= new Trial();
		obj.area(l,b);
		obj.area(s);
	}
}