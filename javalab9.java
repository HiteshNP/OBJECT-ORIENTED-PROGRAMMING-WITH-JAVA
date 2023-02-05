/*
  Aim: Introduce java Collections.
  
  Program: Write a program to perform string operations using ArrayList. Write functions for
  the following a. Append - add at end b. Insert – add at particular index c. Search d. List all
  string starts with given letter.

  Theory:
  Collection in Java is a framework which contains set of classes and interfaces,
  that provides an architecture to store and manipulate the group of objects.
    
  *It is a single unit of objects.
  *You can perform operations on data such as searching, sorting, 
  insertion, manipulation, and deletion.

  *The ArrayList class implements the List interface

  ArayList class is resizable (Dynamic) array
  we dont need to mention the size of the array)

  ArrayList is found in java.util package

  ArrayList<data-type> obj = new ArrayList<data_type>();
    
  *ArrayList class has many useful method
  Add()-method used to add an element into the array list
        
  Get()-method used to get the elements from the array list, 
  we have to provide the index to get the element from that particular position
        
  Set()-method used to set an element at a particular position,
  we have to mention the index and the element that we want to set
        
  Remove()-method used to remove a particular element
        
  indexOf()-method used to search whether that particular element is there or not
        
  Size()-gives the size of the array list
        
  Startwith()-checks a string that starts with a particular character
*/

import java.util.*;
public class javalab9
{
    ArrayList<String> list=new ArrayList<String>(); //Creating arraylist
    public void arraydisplay()
    {
        list.add("CSE");//Adding object in arraylist
        list.add("ISE");
        list.add("ME");
        System.out.println("ArrayList element are");
        System.out.println(list);//gives the elements of the list
        System.out.println("");
    }
    public void appendatend()
    {
        System.out.println("Enter the element to append at end");
        try (Scanner scob1 = new Scanner(System.in))
         {
            String ele=scob1.next();//reading a string element that should be inserted
            list.add(ele);
        }
        System.out.println(list);//new elements is added at the end of the array list
        System.out.println("");
    }
    public void insertatpos()
    {
        System.out.println("Enter the position and element to insert");
        try (Scanner scob1 = new Scanner(System.in)) 
        {
            int posind=scob1.nextInt();//readig position of int data type
            String ele=scob1.next();//reading element that should be inserted at a particular index of string data type
            list.add(posind,ele);//here we can also make use of the set function
        }
        System.out.println(list);
        System.out.println("");
    }
    public void searchele()
    {
        System.out.println("Enter the Array element to search");
        try (Scanner scobj = new Scanner(System.in)) 
        {
            String arele=scobj.next();
            int in=list.indexOf(arele);/*here the element that user enters=arele is passed into indexof 
            method which searchs for the element and returns the position that is the index number*/
            if(in==-1)
            {
            System.out.println("Element not found");
            }
            else
            {
            System.out.println("Element found at "+in);
            }
        }
    }
    void print()//we have to print the array element starting with the particular character
    {
        try (Scanner nip = new Scanner(System.in))
        {
            System.out.println("Enter the starting charecter to print strings");
            char inputc=nip.next().charAt(0);
            String strc=Character.toString(inputc);//we have converted that character into string(typecasting)
            System.out.println("String starting with character "+strc);
            for(int i=0;i<list.size();i++)
            {
            if(list.get(i).startsWith(strc))
            {
            System.out.println(list.get(i));
            }
            }
        }
    }
    public static void main(String args[])
    {
        javalab9 obj=new javalab9();
        obj.arraydisplay();
        obj.appendatend();
        obj.insertatpos();
        obj.searchele();
        obj.print();
    }
}