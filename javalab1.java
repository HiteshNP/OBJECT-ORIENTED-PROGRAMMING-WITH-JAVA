/*
  Aim: Introduce the java fundamentals, data types, operators in java

  Program: Write a java program that prints all real solutions to the quadratic equation
  ax2+bx+c=0. Read in a, b, c and use the quadratic formula.
*/

import java.util.Scanner;
public class javalab1 
{
   public static void main (String[] args)
  {
	int a, b, c;	
	double root1, root2,real,imaginary; 
	System.out.println("Enter the coefficients");
	try (Scanner in = new Scanner(System.in))
	 {
		a = in.nextInt(); 
		b = in.nextInt();
		c = in.nextInt();
     }
	double d = b * b - 4 * a * c;
	System.out.println("Determinant="+d);
	if (d > 0)	
    {
		root1 = (-b + Math.sqrt(d)) / (2 * a); 
		root2 = (-b - Math.sqrt(d)) / (2 * a);
		System.out.println("The roots are real and distinct");
		System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
	}
	else if (d == 0)	
	{
		root1 = root2 = -b / (2 * a);
		System.out.println("The roots are real and equal"); 
		System.out.printf("root1 = root2 = %.2f", root1);
	}
	else	
	{
		real = ((double)-b) / (2 * a);
		imaginary = Math.sqrt((-d))/ (2 * a); 
		System.out.println("The roots are imaginary"); 
		System.out.printf("root1 = %.2f+%.2fi", real, imaginary); 
		System.out.printf("\nroot2 = %.2f-%.2fi", real, imaginary);
	}
  }
}


