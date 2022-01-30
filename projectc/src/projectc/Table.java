package projectc;

import java.util.Scanner;

public class Table
{
	public static void main(String[] args) 
	{
		System.out.println("please enter the value of number:");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=1; i<=100; i++)
		{
			System.out.println(number+"%"+number+"="+number%i);	
		}	
	}
}
		
		
	




