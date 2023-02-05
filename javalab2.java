/*
  Aim: Demonstrating creation of java classes, objects, constructors, declaration and
  initialization of variables.  

  Program: 
  Create a Java class called Student with the following details as variables within it.
  USN
  Name
  Branch
  Phone
  Write a Java program to create n Student objects and print the USN, Name, Branch, and Phone
  of these objects with suitable headings.
*/

import java.util.Scanner; 
public class javalab2
{
    String usn,name,branch;
    long phone=0;
    void insertStudent(String reg,String nm, String br,long ph)
   {
    usn=reg;
    name=nm;
    branch=br;
    phone=ph;
   }
    void displayStudent()
   {
    System.out.println("************************");
    System.out.println("USN = "+usn);
    System.out.println("NAME = "+name);
    System.out.println("BRANCH = "+branch);
    System.out.println("PHONE NUMBER = "+phone);
    System.out.println("************************");
   }
  public static void main(String args[])
  {
    javalab2 st[]=new javalab2[100];
    try (Scanner ip = new Scanner(System.in))
   {
    {
     System.out.println("Enter the number of students");
     int n=ip.nextInt();
    
     for(int i=0;i<n;i++)
     {
        st[i]=new javalab2();
     }  
     for(int j=0;j<n;j++)
     {
        System.out.format("Enter the Usn, Name, Branch2, Phone Number of student %d :\n",j+1);
        ip.nextLine();
        String usn=ip.nextLine();
        String name=ip.nextLine();
        String branch=ip.nextLine();
        long phone=0;
        phone = ip.nextLong();
        st[j].insertStudent(usn,name,branch,phone);
     }
     System.out.println("************************");
     for( int m=0;m<n;m++)
     {		
        System.out.format("Student %d details are\n",m+1);
        st[m].displayStudent();
     }
    }
   }
  }
}