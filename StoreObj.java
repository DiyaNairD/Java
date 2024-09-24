import java.io.*;
import java.util.*;

class Employee implements Serializable
{
	private int id;
	private String name;
	private float sal;
	private Date doj;

	public Employee(int i,String n,float s,Date d)
	{
		id= i;
		name= n;
		sal= s;
		doj=d;	
	}
	void display()
	{
		System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
	}
	static Employee getData() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter emp id");
		int id= Integer.parseInt(br.readLine());
		
		System.out.println("enter name");
		String name= br.readLine();

		System.out.println("enter salary");
		float sal= Float.parseFloat(br.readLine());
		
		Date d= new Date();
		
		Employee e= new Employee(id,name,sal,d);
		
		return e;
	}
}

class StoreObj
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		FileOutputStream fos= new FileOutputStream("objfile7");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		System.out.print("How many objects ?");
		int n= Integer.parseInt(br.readLine());

		for(int i=0;i<n;i++)
		{
			Employee el= Employee.getData();
			oos.writeObject(el);
		}
		oos.close();
	
		FileInputStream fis= new FileInputStream("objfile7");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try
		{
			Employee e;
			while((e=(Employee) ois.readObject())!=null)
			{
				e.display();
			}
		}
		catch(ClassNotFoundException ce )
		{
				System.out.println("end of file reached ");
		}
		catch(EOFException x)
		{
		}

		finally
		{
			ois.close();
		}
	}
	
}