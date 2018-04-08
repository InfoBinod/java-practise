class UsingFinally
{
	public static void main(String []args)
	{
		try
		{
			procA();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught in Main");
		}
		procB();
		procC();
	}
	static void procA()
	{
		try
		{
			System.out.println("Inside procA");
			throw new RuntimeException("procA");
		}
		finally
		{
			System.out.println("procA's Finally");
		}
	}

	static void procB()
	{
		try
		{
			System.out.println("Inside procB");
			return;
		}
		finally
		{
			System.out.println("procB's Finally");
		}
	}
	static void procC()
	{
		try
		{
			System.out.println("Inside procC");
		}
		finally
		{
			System.out.println("procC's Finally");
		}
	}	
}