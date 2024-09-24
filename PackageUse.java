import pack.AdditionP;
import pack.SubtractionP;
import pack.MultiplicationP;


class PackageUse
{
    public static void main(String args[])
    {
        AdditionP obj1= new AdditionP(10.4,5.6);
        obj1.Sum();

       MultiplicationP obj2= new MultiplicationP(10.4,5.6);
        obj2.Pro();

        SubtractionP obj3= new SubtractionP(10.4,5.6);
        obj3.Diff();
    
    }
}