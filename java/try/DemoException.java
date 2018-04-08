
class DemoException{
public static void main(String []args)
{
try{
int a;
a=10/0;
}
catch(ArithmeticException e) 
{
System.out.println(e);
}
}
}

