import java.util.*;
class ArrayL
{
    public static void main(String args[])
    {
        ArrayList<String> ar1= new ArrayList<String>();

        ar1.add("apple");
        ar1.add("mango");
        ar1.add("orange");
        ar1.add("guava");

        System.out.println("contents :"+ar1);

        ar1.remove(3);
        ar1.remove("apple");

        System.out.println("contents after removing :"+ar1);

        System.out.println("size of the list :"+ar1.size());

        System.out.println("extracting using iterator");

        Iterator it= ar1.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}