package projectc;

public class classB extends classA 
{
	public void med()
	{
		
		System.out.println("child default method");
	}
    public void med1(int a)
    {
    super.me3(1, 2, 3);
    super.me();
    super.me1(1);
    super.me2(1, 6);
    super.me4(1, 2, 5, 4);
    
    
		System.out.println("child class1 method");
		
	}
	public void med2(int a,int b)
	{
	
		System.out.println("child class2 method");
	}
	public void med3(int a,int b,int c)
	{
		System.out.println("child class3 method");
	}
	
	public void med4(int a,int b,int c,int d)
	{
		
		System.out.println("child class4 method");
	}
	public static void main(String[] args) 
	{
		classB obj=new classB();
		obj.med1(1);
	}
}
	

		
	
	


