/*
Aim: Exception handling in java, introduction to throwable class, throw, throws, finally.

Program: 
Write a Java program to read two integers a and b.Compute a/b and print, when b is not zero.
Raise an exception when b is equal to zero.

Theory:
*Exception Handling:

 The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of
 the application can be maintained.

 Exception is an event that disrupts the normal flow of the program.It is an object which is thrown at runtime.

 The java.lang.Throwable class is the root class of Java Exception Which is inherited by two subclasses: Exception and Error

*Types of Java Exceptions:
 There are mainly two types of exceptions: 
 1.checked 
 2.unchecked

 Checked exceptions are checked at compile-time. Such as IOException, SQLException etc.

 Unchecked exceptions are not checked at compile-time, but they are checked at runtime. 
 Such as ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
 
*Exception Keywords
 Java provides five keywords that are used to handle the exception

 1.try    - place an exception code
 2.catch  - handle the exception
 3.finally - execute the necessary code
 4.throw - throw an exception
 5.throws - declare exceptions
*/

import java.util.*;
public class javalab10
{
    int c;
    void div(int a,int b)
    {
        try
        {
        c=a/b;
        System.out.println("Result="+c);
        }
        catch(ArithmeticException e)
        {
        System.out.println("Cannot divide by zero");
        }
    }
    public static void main(String args[])
    {
        javalab10 obj=new javalab10();
        try (Scanner in = new Scanner(System.in))
        {
            System.out.println("Enter the values of a and b");
            int m=in.nextInt();
            int n=in.nextInt();
            obj.div(m,n);
        }
    }
}