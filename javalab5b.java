//B. Program: Write a java program demonstrating Constructor overloading.

public class javalab5b 
{
	int id;
	String name;
	javalab5b()
	{
		System.out.println("This is Default Constuctor");
		System.out.println("Student Id : "+id + "\nStudent Name : "+name);
	}
	javalab5b(int i, String n)
	{
		System.out.println("This is Parameterized Constructor:");
		id = i;
		name = n;
		System.out.println("Student Id : "+id + "\nStudent Name : "+name);
	}
	public static void main(String[] args)
	{
		new javalab5b();
		new javalab5b(10, "Virat");
	}
}
