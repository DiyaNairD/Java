import java.util.*;
import java.text.*;
class dates
{
    public static void main(String args[])
    {
        Date d= new Date();
        DateFormat fmt= new DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.US);
        String str= fmt.format(d);
        System.out.println(str);
    }
}