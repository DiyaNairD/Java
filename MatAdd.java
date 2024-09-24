import java.util.*;

class Matrix
{
	int  r2,c2,c1,r1,i,j;
	
	Scanner sc= new Scanner(System.in);
	public Matrix(int r1,int c1,int r2,int c2)
	{
		this.r1=r1;
		this.r2=r2;
		this.c1=c1;
		this.c2=c2;

	}
	public void input(int a[][],int b[][])
	{
		
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	System.out.println(" enter the elements of first matrix");
				 a[i][j]= sc.nextInt();
			}
		}
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{	System.out.println(" enter the elements of first matrix");
				 b[i][j]= sc.nextInt();
			}
		}
	}

	public void Sum(int a[][],int b[][])
	{

		int c[][]=new int[10][10];
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
					c[i][j]=a[i][j]+b[i][j];
                              	}
		}
		System.out.println(" ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
					System.out.print(c[i][j]);
					System.out.print(" ");
                              	}
			System.out.println(" ");
		}
}
	public void Mul(int a[][],int b[][])
	{
		int c[][]= new int[10][10];
		for(i=0;i<r1;i++)
		{	
			for(j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<c1;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                             		 }
			}
		}
		
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
					System.out.print(c[i][j]);
					System.out.print(" ");
                             		 }
			System.out.println(" ");
		}
	}

}

class MatAdd
{
	
   public static void main(String args[])
  {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter R and C");

	int c1= sc.nextInt();
	int r1= sc.nextInt();
	System.out.println("enter the number of columns and rows of second matrix");
	int c2= sc.nextInt();
	int r2= sc.nextInt();

	int a[][]= new int[10][10];
	int b[][]=new int[10][10];
	
	
	Matrix obj = new Matrix(r1,c1,r2,c2);
		while(true)
		{
			System.out.println("\n 0 to exit \n 1 to input \n 2 to get output \n 3 to find sum");
			int k=sc.nextInt();
			switch(k)
			{
				case 0: System.exit(0);
					   
				case 1:
					
						 obj.input(a,b);
					
					   break;
				
				case 2:
					if(r2==c1)
					{
					 obj.Mul(a,b);
					}
					else
					{
				System.out.println("nottttttttttttttttt");
					}
					break;
				case 3:
					obj.Sum(a,b);
					  break;
			}
		}
  }
}

