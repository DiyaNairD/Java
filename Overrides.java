import java.util.*;
class Vehicle
{
	void display()
	{
		System.out.println("this is a vehicle");
	}
}
class Bike extends Vehicle
{
	void display()
	{
		System.out.println("this is a bike");
	}
}
class Overrides
{
	public static void main(String args[])
	{
		Bike obj= new Bike();
		obj.display();
	}
}