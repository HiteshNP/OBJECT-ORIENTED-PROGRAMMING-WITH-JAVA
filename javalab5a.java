/* 
  Aim: Introduce concepts of method overloading, constructor overloading, overriding.

  Program: A. Write a java program demonstrating Method overloading.
*/

public class javalab5a {
	int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	int add(int a, int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
	float add(float a, float b)
	{
		float sum=a+b;
		return sum;
	}
	public static void main(String args[])
	{
		javalab5a obj = new javalab5a();
		int s1=obj.add(30, 15);
		int s2=obj.add(15, 25, 30);
		float s3=obj.add(6.2f,5.7f);
		System.out.println("Method Overload Sum1="+s1);
		System.out.println("Method Overload Sum2="+s2);
		System.out.println("Method Overload Sum3="+s3);
	}
}
