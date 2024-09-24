import java.io.*;
class File2
{
    public static void main(String args[]) throws IOException
    {
        String str= "This is a book on Java "+"\n I am a learner of java.";
        FileWriter fw= new FileWriter("text.txt");
        int i;
        for(i=0;i<str.length();i++)
            fw.write(str.charAt(i));
        fw.close();
        int ch ;
        FileReader fr= null;
        try
        {
            fr= new FileReader("text.txt");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("file not found");
            return;
        }
        while((ch=fr.read()) != -1)
                System.out.print((char)ch);
            fr.close();
    }
}