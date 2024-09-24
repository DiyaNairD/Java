import java.util.*;
class Animals
{
	void display()
	{
		 System.out.println("this is parent class");
	}
}
class Dog extends Animals
{
	void display()
	{
		System.out.println("this is child class");
	}
	void trial()
	{
		super.display();
	}
	
}
class Supersm
{
	public static void main(String args[])
	{
		Dog d= new Dog();
		d.display();
		d.trial();
	}
}
