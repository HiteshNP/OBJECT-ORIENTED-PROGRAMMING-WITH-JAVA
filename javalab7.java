/*Aim: Introduction to abstract classes, abstract methods, and Interface in java
  
  Program: Write a program to generate the resume. Create 2 Java classes Teacher (data:
  personal information, qualification, experience, achievements) and Student (data: personal
  information, result, discipline) which implements the java interface Resume with the method
  biodata().

  Theory:
    *Data abstraction is the process of hiding certain details and showing only essential information to the user. 
    
    *Abstraction can be achieved with either abstract classes or interfaces.
    
    *The abstract keyword is used for classes and methods:
    *Abstract class: is a restricted class that cannot be used to create objects 
                    (to access it, it must be inherited from another class).
    *Abstract method: can only be used in an abstract class, and it does not have a body.
                    The body is provided by the subclass (inherited from).
    *In java we cannot directly call methods we need to create an object and through objects we can call method                    
*/

interface Resume
{
void biodata();//interface method(does not have a body)
}
class Teacher implements Resume //subclass here in interfaces we use implements instead of extends to access interface methods
{
  String name,qualification,achievements;
  float experience;
  public void biodata()
  {
    name="Anil B C";
    qualification="B.E, M.Tech, PHD";
    achievements="Q1 publication";
    experience=14.8f;
    System.out.println("Teacher Resume");
    System.out.println("Name : " +name);
    System.out.println("Qualification : "+qualification);
    System.out.println("Achievements : "+achievements);
    System.out.println("Experience : "+experience);
  }
}
  class Student implements Resume
{
  String name,discipline;
  float result;
  public void biodata()
  {
    name="Vaibhav C";
    result=9.8f;
    discipline="Computer Science and Engineering(AIML)";
    System.out.println("");
    System.out.println("Student Resume");
    System.out.println("Name : " +name);
    System.out.println("Result : "+result+" cgpa");
    System.out.println("Discipline : "+discipline);
  }
}
public class javalab7
{
  public static void main(String[] args)
  {
    Teacher obj1=new Teacher();
    obj1.biodata();
    Student obj2=new Student();
    obj2.biodata();
  }
}