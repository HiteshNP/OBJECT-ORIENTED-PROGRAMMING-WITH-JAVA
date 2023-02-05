/*
  Aim: Demonstrate the core object-oriented concept of Inheritance, polymorphism

  Design a super class called Staff with details as StaffId, Name, Phone, Salary. Extend this class
  by writing three subclasses namely Teaching (domain, publications), Technical (skills), and
  Contract (period). Write a Java program to read and display at least 3 staff objects of all three
  categories.
*/

import java.util.Scanner;
class Staff
{
	String staffId;
	String name;
	long phone;
	float salary;
	public void accept()
  {
	try (Scanner scanner = new Scanner(System.in)) 
	{
		System.out.print("Enter Staff Id: ");
		staffId = scanner.next();
		System.out.print("Enter Name: ");
		name = scanner.next();
		name+=scanner.nextLine();
		System.out.print("Enter Phone: ");
		phone = scanner.nextLong();
		System.out.print("Enter Salary: ");
		salary = scanner.nextFloat();
	}
   }
	public void display()
	{
		System.out.println("Staff Id: " + staffId);
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
		System.out.println("Salary: " + salary);
	}
}
class Teaching extends Staff
{
	String domain;
	int n;
	public void accept()
	{
	super.accept();
	try (Scanner scanner = new Scanner(System.in)) 
	{
		System.out.print("Enter Domain: ");
		domain = scanner.next();
		domain+=scanner.nextLine();
		System.out.print("Enter Number of Publications: ");
		n = scanner.nextInt();
	}
	 System.out.println("\n");
	}
	public void display()
   {
		super.display();
		System.out.println("Domain: " + domain);
		System.out.println("Publications:"+n);
		System.out.println("\n");
   }
}
class Technical extends Staff
{
	String skill;
	public void accept()
	{
	super.accept();
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Enter technical Skills: ");
		skill = scanner.nextLine();
	}
	System.out.println("\n");
	}
	public void display()
	{
		super.display();
		System.out.println("Technical Skills: " + skill);
		System.out.println("\n");
	}
}
class Contract extends Staff
{
	int period;
	public void accept()
	{
	super.accept();
	try (Scanner scanner = new Scanner(System.in)) 
	{
		System.out.print("Enter Period: ");
		period = scanner.nextInt();
	}
	System.out.println("\n");
	}
	public void display()
	{
		super.display();
		System.out.println("Contract Period: " + period);
		System.out.println("\n");
	}
}
class javalab4
{
	public static void main(String[] args)
	{
		
	
	try (Scanner input = new Scanner(System.in)) {
		System.out.println("Enter the number of Staff");
		int n=input.nextInt();
		Teaching steach[]=new Teaching[n];
		Technical stech[]=new Technical[n];
		Contract scon[]=new Contract[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of Teaching Staff");
			steach[i]=new Teaching();
			steach[i].accept();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of Technical Staff");
			stech[i]=new Technical();
			stech[i].accept();	
		}
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the details of Contract Staff");
			scon[i]=new Contract();
			scon[i].accept();
		}
		System.out.println("The details of Teaching Staff");
		for(int i=0;i<n;i++)
			steach[i].display();
		System.out.println("The details of Technical Staff");
		for(int i=0;i<n;i++)
			stech[i].display();
		System.out.println("The details of Contract Staff");
		for(int i=0;i<n;i++)
			scon[i].display();
	}
  }
}

