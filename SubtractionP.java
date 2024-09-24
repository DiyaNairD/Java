package pack;
public class SubtractionP
{
    public double d1,d2;
    public SubtractionP(double a, double b)
    {
        d1=a;
        d2=b;
    }
    public void Diff()
    {
        System.out.println("diff="+(d1-d2));
    }
}