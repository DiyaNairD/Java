import java.util.*;
import java.io.*;

class Matrix
{
	int r,c,i,j;
	Scanner sc= new Scanner(System.in);
	

	public Matrix(int p,int q)
	{
		r=p;
		c=q;

	}

	public void Input(int a[][]) throws IOException
	{
		System.out.println("enter the elements");
		{
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j]= sc.nextInt();
				}
			}
		}
	}
	public void Output(int a[][]) throws IOException
	{
		System.out.println("enter the elements");
		{
			int k,i,j;
			for(i=0;i<r;i++)
			{
				System.out.println(" ");
				for(j=0;j<c;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
			}
		
		}
	}
	public void diagonal1(int a[][]) throws IOException
	{
		System.out.println("diagonal elements are :");
		for(i=0;i<r;i++)
		{
		 	for(j=0;j<c;j++)
			{
				if(i==j)
				System.out.println(a[i][j]);
			}
		}
	}
	public void diagonal2(int a[][]) throws IOException
	{
		System.out.println("diagonal elements are :");
		for(i=0;i<r;i++)
		{
		 	for(j=0;j<c;j++)
			{
				if((i+j)==(r-1))
				System.out.println(a[i][j]);
			}
		}
	}
	public void triangle(int a[][]) throws IOException
	{
		System.out.println("left to diagonal triangle :");
		for(i=0;i<r;i++)
		{
		 	for(j=0;j<c;j++)
			{
				if((i+j)<=(r-1))
				System.out.print(a[i][j]);
				System.out.print("  ");
			}
			System.out.println(" ");
		}
		System.out.println("diagonal to right triangle :");
		System.out.println(" ");
		for(i=0;i<r;i++)
		{
		 	for(j=0;j<c;j++)
			{
				if((i+j)>=(r-1))
					System.out.print( " "+a[i][j]);
				else
					System.out.print("  ");
				System.out.print("  ");
			}
			System.out.println("  ");
		}
	}
	
}

class TwoDA
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		int [][]a= new int[100][100];
		System.out.println("enter the number of rows");
		int r= sc.nextInt();
		System.out.println("enter the number of columns");
		int c= sc.nextInt();
		Matrix obj = new Matrix(r,c);
		while(true)
		{
			System.out.println("\n 0 to exit \n 1 to input \n 2 to get output \n 3 to display left to right diagonal \n 4 to display right to left diagonal \n 5 to display triangle ");
			int k=sc.nextInt();
			switch(k)
			{
				case 0: System.exit(0);
					   
				case 1: obj.Input(a);
					   break;
				
				case 2: obj.Output(a);
					   break;

				case 3: obj.diagonal1(a);
					   break;

				case 4: obj.diagonal2(a);
					   break;
				
				case 5: obj.triangle(a);
					   break;
			}
		}
		
	}
}