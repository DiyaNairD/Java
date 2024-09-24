import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int i,j,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the limits");
		int a= sc.nextInt();
		int b= sc.nextInt();
		for(j=a;j<=b;j++)
		{
			for(i=2;i<=j/2;i++)
			{
				if(j%i==0)
				count++;
			}
			if(count==0)
			System.out.println(j);
			count=0;
		}
		
		
	}
}
