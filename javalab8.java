/*Aim: Demonstrate creation of threads using Thread class and Runnable interface, multithreaded programming.

  Program: Write a Java program that implements a multi-thread application that has three
  threads. First thread generates a random integer for every 1 second; second thread computes
  the square of the number and prints; third thread will print the value of cube of the number

  Theory:
  * A thread is a lightweight sub-process, the smallest unit of processing.
  * Multithreading in Java is a process of executing multiple threads simultaneously
  * Multithreading is used to achieve multitasking.
  * Threads use a shared memory area. They don't allocate separate memory area so saves memory, 
    and context-switching between the threads takes less time than process.
  *Java provides Thread class to achieve thread programming
  *Thread class provides constructors and methods to create and perform operations on a thread.
  *Thread class extends Object class and implements Runnable interface.
  *start() - used to start the execution of the thread
   run() - used to do an action for a thread.
   sleep() - sleeps a thread for the specified amount of time.
   getName() - returns the name of the thread
   setName() - Changes the name of the thread
   getId() - returns the id of the thread.
  *Thread. sleep() method can be used to pause the execution of current thread for specified time in milliseconds
   The argument value for milliseconds can't be negative, else it throws IllegalArgumentException if a Thread is sleeping, 
   the thread may be interrupted If any other thread interrupts when the thread is sleeping, 
   then InterruptedException will be thrown(catch (InterruptedException ex))
*/

import java.util.Random;
class Square extends Thread
{
  int x;
  Square(int n)
  {
    x = n;
  }
  public void run()
  {
    int sqr = x * x;
    System.out.println("Square of " + x + " = " + sqr );
  }
}
class Cube extends Thread
{
  int x;
  Cube(int n)
  {
    x = n;
  }
  public void run()
  {
    int cub = x * x * x;
    System.out.println("Cube of " + x + " = " + cub );
  }
}
class Rnumber extends Thread
  {
  public void run()
  {
    Random random = new Random();
    for(int i =0; i<5; i++)
    {
      int randomInteger = random.nextInt(10);
      System.out.println("Random Integer generated : " + randomInteger);
      Square s = new Square(randomInteger);
      s.start();
      Cube c = new Cube(randomInteger);
      c.start();
      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException ex)
      {
        System.out.println(ex);
      }
    }
  }
}
public class javalab8
{
  public static void main(String[] args)
  {
    Rnumber n = new Rnumber();
    n.start();
  }
}