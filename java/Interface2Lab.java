class BaseballCoach
{
	Fortune fortune;
	BaseballCoach(Fortune f)
	{
		fortune=f;
	}	

	public void getFortune()
	{
		fortune.getMyFortune();
	}
}

interface Fortune
{
	public void getMyFortune();
}

class SadFortune implements Fortune
{
	public void getMyFortune()
	{
		System.out.println("Very Sad");
	}
}

class HappyFortune implements Fortune
{
	public void getMyFortune()
	{
		System.out.println("Very Happy");
	}
}


class Interface2Lab
{
	public static void main(String [] args)
	{
		Fortune f=new SadFortune();
		BaseballCoach b=new BaseballCoach(f);
		b.getFortune();
	}
}