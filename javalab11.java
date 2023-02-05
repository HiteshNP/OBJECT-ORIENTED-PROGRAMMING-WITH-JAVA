/*
Aim: Introduce File operations in java.

Program:
Write a java program that reads a file name from the user, displays information about
whether the file exists, whether the file is readable, or writable, the type of file 
and the length of the file in byte.

Theory:
File
A named location used to store related information is known as a File

There are several File Operations like 
*creating a new File, 
*getting information about File, 
*writing into a File, 
*reading from a File and 
*deleting a File.

Java File Class Methods
*createNewFile() - used to create a new empty file.
*canRead() - used to check whether we can read the data of the file or not.
*canWrite() - used to check whether we can write the data into the file or not.
*exists() - used to check whether the specified file is present or not.
*delete() - used to delete a file.
*getName()  - used to find the file name.
*length() - used to get the size of the file in bytes.

String Methods
*toString() - returns the String representation of the object.
*lastIndexOf() - returns the position of the last occurrence of specified character(s) in a string,
                If it is not found, it returns -1.
*substring() - returns a part of the string, We pass beginIndex and endIndex number position.
*/

import java.io.File;
import java.util.Scanner;
class javalab11
{
    public static void main(String args[ ])
    {
        try (Scanner obj = new Scanner(System.in))
         {
            System.out.println("Enter the file name");
            String fname=obj.next();
            File f1 = new File(fname);//the information given by the user is fetched here
            System.out.println("File Name: " + f1.getName());
            System.out.println(f1.exists() ? "File exists" : "File does not exist");
            System.out.println(f1.canWrite() ? "File is writeable" : "File is not writeable");
            System.out.println(f1.canRead() ? "File is readable" : "File is not readable");
            String fileName = f1.toString();//we need to fine type of the file so we convert the file onject into string
            int index = fileName.lastIndexOf('.');
            if(index > 0)
            {
            String type = fileName.substring(index + 1);//substring function extracts the remaining part of the string
            System.out.println("File type is " + type);
            }
            else
            {
            System.out.println("File doesn't have type");
            }
            System.out.println("File size: " + f1.length() + " Bytes");
        }
    }
}    