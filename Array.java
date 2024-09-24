import java.io.*;

class New
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int n;
    int i,j;
    public New(int n)
    {
		this.n=n;
    }
    public void input(int a[]) throws IOException
    {
        System.out.print("\n Enter the elements of the array: ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
    }   
    public void output(int a[]) 
    {
        System.out.print("\n Elements in array : ");
        for(i=0;i<n;i++)
        {
            System.out.print("\n"+a[i]);
        }
    }
    public void binary_search(int a[]) throws IOException
	{
		System.out.println("enter the number to be found");
		int p=Integer.parseInt(in.readLine());
		int beg=0,last=n-1,mid,flag=0;
		while(last>=beg)
		{
			mid=(last+beg)/2;
			if(a[mid]<p)
				beg=mid+1;
			else if(a[mid]>p)
				last=mid-1;
			else if(a[mid]==p)
				{
					System.out.println("element found at position"+(mid+1));
					flag=1;
					break;
				}
		}
	      if(flag==0)
			System.out.println("the number doesnt exist");
	}
	public void bubble_sort(int a[]) throws IOException
	{
		int t,i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<(n-1)-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	public void selection_sort(int a[]) throws IOException
	{
		int i,j,s,p,temp;
		for(i=0;i<n;i++)
		{
			s=a[i];
			p=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<s)
				{
					s=a[j];
					p=j;
				}
			}
		temp=a[i];
		a[i]=a[p];
		a[p]=temp;
		}
	}
}

class Array {


    public static void main(String[] args)throws IOException
   {
           
       InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[] = new int[100];
        int k;
        int n=10;
       New obj = new New(n);
       
        while(true)
        {
            System.out.print("\n Menu : ");
            System.out.print("\n 0.Exit");
            System.out.print("\n 1.Input");
            System.out.print("\n 2.Output");
		System.out.print("\n 3.Binary search");
		System.out.print("\n 4.Bubble sort");
		System.out.print("\n 5.Selection Sort");
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
			     obj.binary_search(a);
				break;
		    case 4 :
			     obj.bubble_sort(a);
				break;
		    case 5:
				obj.selection_sort(a);
				break;
            }
        }
       
   }
    
}