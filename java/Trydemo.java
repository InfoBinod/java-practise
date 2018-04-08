class Trydemo{
public static void main(String args[])
{
	method1();
}
public static void method1()
{
try{
//System.out.println("answer =" +20/0);
throw new ArrayIndexOutOfBoundsException ("divisible by zero");
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("array index out of bound exception = "+e.getMessage());
}

catch(ArithmeticException e)
{
	System.out.println("airthemic exception");

}
catch (Exception e)
{
System.out.println("generic exception ");
}



System.out.println("after try catch");

}

}


