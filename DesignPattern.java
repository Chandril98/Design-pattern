import java.lang.*;
import java.util.Scanner;

class DesignPattern
{
	public static void main (String args[])
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Enter 1st num Real part");
		int a= user.nextInt();
		Triangle t1 = new Triangle(a);
		System.out.println( " Triangle Pattern ");
		t1.Tpattern();
		Square s1 = new Square();
		System.out.println( " Square Pattern ");
		s1.Spattern();
		Rectangle r1 = new Rectangle();
		System.out.println( " Rectangle Pattern ");
		r1.Rpattern();
		
	}  
	
}

class Triangle
{
	     int i,  j, k, l, a;
	
		 public void Tpattern()
	    {
	
		   for (i=1; i<=a; i++)
		 {
			 for (j=4; j>=i; j--)
			 {
			  System.out.print(" ");	
		     }
			
			 for (k=1;k<=i; k++)
			 {
				System.out.print("*");
			 }

             for (l=2;l<=i; l++) 
			 {
				System.out.print("*");
			 }
			 System.out.println();
		  }   
		
		}
}    

class Square
{
	     int i,  j ;
	
		 public void Spattern()
	    {
	
		   for (i=1; i<=4; i++)
		 {
			 for (j=1; j<=4; j++)
			 {
			  System.out.print("*");	
		     }
		      System.out.println();
		  }   
		
		}
}    

class Rectangle
{
	     int i,  j ;
	
		 public void Rpattern()
	    {
	
		   for (i=1; i<=4; i++)
		 {
			 for (j=1; j<=8; j++)
			 {
			  System.out.print("*");	
		     }
		      System.out.println();
		  }   
		
		}
}    