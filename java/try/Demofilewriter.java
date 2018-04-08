import java.io.*;
class Demofilewriter{
public static void main(String []args)throws IOException{
FileWriter f= new FileWriter("/Documents/java/try/abc.txt");
f.write(100);
f.write("D");
f.flush();
f.close();
}
}


