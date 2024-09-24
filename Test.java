import java.io.*;
import java.util.*;

class array
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int n;
    int i,j,beg,last,f;
    public array(int n)
    {   
        this.n = n;
    }
    public void input(int a[]) throws IOException
    {
        System.out.print("\n Enter the elements of the array: ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
    }   
    public void output(int a[]) throws IOException
    {
        System.out.print("\n Elements in array : ");
        for(i=0;i<n;i++)
        {
            System.out.print("\n"+a[i]);
        }
    }
    public void linear(int a[]) throws IOException
    {
		int i;
		System.out.println("enter the number to be found");
		Scanner sc= new Scanner(System.in);
		int p= sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==p)
			{
				System.out.println("found at "+(i+1));
			}
		}
		
     }
public void binary(int a[]) throws IOException
{
	beg=0;last=n-1;
	System.out.println("enter the number to be found");
	Scanner sc= new Scanner(System.in);
	int k= sc.nextInt();
	while(beg<=last)
	{
		int mid = (beg+last) /2;

		if(a[mid] < k)
		{
			beg=mid+1;
		}
		else if(a[mid] > k)
		{
			last=mid-1;
		}
		else if(a[mid]==k)
		{
			f=1;
			System.out.println("Element found at position "+(mid+1));
			break;
		}

	}
	if(f==0)
	{
	 System.out.println("Data doesnot Exist");
	}
  }
	
}
public class Test {


    public static void main(String[] args)throws IOException
   {
           
       InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[] = new int[100];
        int k;
        int n=5;
       array obj = new array(n);
       
        while(true)
        {
            System.out.print("\n Menu : ");
            System.out.print("\n 0.Exit");
            System.out.print("\n 1.Input");
            System.out.print("\n 2.Output");
		System.out.print("\n 3.LinearSearch");
		System.out.print("\n 4.BinarySearch");
            k=Integer.parseInt(in.readLine());
            switch(k)
            {
                case 0:
                    System.exit(0);
                case 1:
                    obj.input(a);
                    break;
                case 2:
                    obj.output(a);
                    break;
		    case 3:
			   obj.linear(a);
			  break;
		    case 4:
			   obj.binary(a);
			  break;
            }
        }
       
   }
    
}