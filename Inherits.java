import java.util.*;
class inherit
{
    public int input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the variable a ");
        int a= sc.nextInt();
        return a;
    }
}
class multiple extends inherit
{
	public int inputs()
	{
		Scanner sc= new Scanner(System.in);
        		System.out.println("enter the variable b ");
       		 int b= sc.nextInt();
		 return b;
	}
}
class Inherits extends multiple
{
    public static void main(String args[])
    { 
	Inherits obj=new Inherits();
	int a= obj.input();
	int b= obj.inputs();
	Scanner sc= new Scanner(System.in);
        	System.out.println("enter the variable c ");
       	int c= sc.nextInt();
            int d= a+b+c;
            System.out.println("sum = "+d);
    }
}