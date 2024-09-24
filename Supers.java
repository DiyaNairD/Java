import java.util.* ;
class Animal
{
	String colour= "white";
}
class Dog extends Animal
{
	String colour="black";
	void printcolour()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
class Supers
{
	public static void main(String args[])
	{
		Dog d= new Dog();
		d.printcolour();
	}
}