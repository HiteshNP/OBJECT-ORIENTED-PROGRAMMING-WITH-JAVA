//Program: B. Write a program for Arithmetic calculator using switch case menu

import java.util.*;
class javalab3b
{
public static void main(String[] args)
{
 try (Scanner inp = new Scanner(System.in))
  {
    System.out.println("Enter the Operator (+,-,*,/) : ");
    char operator = inp.next().charAt(0);
    System.out.println("Enter the First Operand : ");
    double first = inp.nextDouble();
    System.out.println("Enter the Second Operand : ");
    double second = inp.nextDouble();
    double result = 0;
    switch(operator)
    {
        case '+':
        result = first + second;
        break;
        case '-':
        result = first - second;
        break;
        case '*':
        result = first * second;
        break;
        case '/':if (second ==0)
        {
            System.out.println("Invalid Denominator");
            return;
        }
        result = first / second;
        break;
        default :
        System.out.println("Invalid Operator");
        break;
    }
    System.out.println("The Result is : "+first+" "+operator+" "+second+" = "+result);
  }
 }
}
