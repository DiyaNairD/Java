import java.io.*;

class Trials
{
	public static void main(String args[]) throws IOException
	{
		StringBuffer sb= new StringBuffer();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter surname");
		String sur= br.readLine();
		System.out.println("enter middle name");
		String mid= br.readLine();
		System.out.println("enter last name");
		String last= br.readLine();
		sb.append(sur);
		sb.append(last);
		System.out.println("name="+sb);
		int n= sur.length();
		sb.insert(n,mid);
		System.out.println("full name "+sb);
		System.out.println("in reverse ="+sb.reverse());
	}
}