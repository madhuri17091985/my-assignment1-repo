package projectc;

import java.util.Scanner;

public class pelindrome 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter the value of a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=a;int rev=0;int rem;
		while(a!=0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(a==rev)
		    System.out.println("print pelindrome");
		    else
		    	System.out.println("print not pelindrome");
		
		}
		
	}
	


