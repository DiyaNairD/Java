import java.util.*;
interface Area
{
	void draw();
}
class Rectangle implements Area
{
	public void draw()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length and breadth of rectangle");
		int l= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("area of rectangle= "+(l*b));
	} 
}
class Circle implements Area
{
	public void draw()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int r= sc.nextInt();
		System.out.println("area of circle= "+(3.14*r*r));
	} 
}
class Square implements Area
{
	public void draw()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length of side of square");
		int s= sc.nextInt();
		System.out.println("area of square= "+(s*s));
	} 
}
class interfaces
{
	public static void main(String args[])
	{
		Area ar1= new Rectangle();
		ar1.draw();
		Area ar2= new Square();
		ar2.draw();
		Area ar3= new Circle();
		ar3.draw();
	}
}



