import java.io.*;
class File
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis= new DataInputStream(System.in);
        FileOutputStream fout= new FileOutputStream("myFile.txt",true);
        BufferedOutputStream bout= new BufferedOutputStream(fout, 1034);
        System.out.println("enter the text @ at the end");
        char ch;
        while((ch=(char)dis.read())!='@')
        bout.write(ch);
        bout.close();

        FileInputStream fin= new FileInputStream("myFile.txt");
        System.out.println("File contents: ");
        int h;
        while((h=fin.read())!=-1)
            System.out.print((char)h);
            fin.close();
    }
}
