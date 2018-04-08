import java.io.*;
class Demofile{
public static void main(String []args)throws IOException{
File f= new File("/home/Documents");
String s[]=f.list();
for (String s1:s)
{
File file=new File(s1);
if(file.isDirectory())
System.out.println(s1);
}
}
}
