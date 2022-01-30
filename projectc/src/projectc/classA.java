package projectc;

public class classA 
{
	public void me()
	{
		this.me3(1, 2, 3);
		System.out.println("parent default method");
	}
	public void me1(int a)
	{
		this.me();
		System.out.println("parent class method");
	}
	public void me2(int a,int b)
	{
		this.me1(1);
		System.out.println("parent class2 method");
	}
	public void me3(int a,int b,int c)
	{
		
		System.out.println("parent class3 method");
	}
	public void me4(int a,int b,int c,int d)
	{
		System.out.println("parent class 4 method");
		
	}

}

