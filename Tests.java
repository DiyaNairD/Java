import java.util.*;
class Tests
{
	public static void main(String args[])
	{
		String s= "hello";
		String p= new String ("hi");
		char arr[]= {'a','b','c'};
		String g= new String(arr);
		System.out.println(s);
		System.out.println(p);
		System.out.println(g);
		String s1=" welcome ".trim(); 
	          String s2= s1.concat(s);
		System.out.println("concated after trim:"+s2);
		int l= s.length();
		System.out.println("length of the string hello is :"+l);
		System.out.println("the joined string is :"+p.concat(g));
		String m= s.substring(0,2);
		System.out.println("substring "+m);
		System.out.println("Upper case: "+s.toUpperCase());
		System.out.println("Lower Case: "+s.toLowerCase());
	}
}