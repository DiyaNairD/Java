import java.util.*;
class New
{
	final int p=30;
}
class News extends New
{
	public void display()
	{	
		p= 400;
		System.out.println(p);
	}
}
class Mains
{
	public static void main(String args[])
	{
		News n= new News();
		n.display();
	}
}
