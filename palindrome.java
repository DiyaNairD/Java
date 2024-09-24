import java.io.*;
class check
{
public void palindrome(int n)
{
 int r, sum=0, temp;
 temp=n;
 while(n>0)
{
 r=n%10;
 sum= (sum*10) + r;
 n=n/10;
 }
 if(temp==sum)
 {
  System.out.println("Palindrome Number");
 }
  else
 {
  System.out.println("Not a palindrome number");
 }  

}

}


class palindrome
{
 public static void main(String m[]) throws IOException
{
  int n;
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br= new BufferedReader(isr);
  System.out.print("Enter a number");
  n=Integer.parseInt(br.readLine());

  check obj = new check();

  obj.palindrome(n);


}
}