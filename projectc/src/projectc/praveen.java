package projectc;

public class praveen extends madhu
{
	public praveen()
	{
		this(1,2);
		System.out.println("child default constructor");
	}
	public praveen(int a)
	{
		this(1,2,3);
		System.out.println("child one parametrized constructor");
	}
	public praveen(int a,int b)
	{
		super(1,2);
		System.out.println("child two parametrized constructor");
	}
	public praveen(int a,int b,int c)
	{
		this();
		System.out.println("child three parametrized constructor");
	}
	public static void main(String[] args)
	{
		praveen obj=new praveen(1);
		
	}
}
