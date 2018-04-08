public interface MyIF{
	int getNumber();
	default String getString(){
	return "Default String";
     }
 }
class MyIFImp implements MyIF
{
	public int getNumber(){
		return 100;
	}
	public String getString()
	{
	return "This is a different String.";
	}
}
class DefaultMethodDemo{
	public static void main(String []args)
	{
		MyIFImp obj=new MyIFImp();
		System.out.println(obj.getNumber());
		System.out.println(obj.getString());
		
	}
}

