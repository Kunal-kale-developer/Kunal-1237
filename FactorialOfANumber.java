import java.util.Scanner;

public class FactorialOfANumber{
  public static void main (String args [])
   {
     int fact =1 ;
     
     System.out.println("Enter a number:" );
     Scanner input = new Scanner (System.in);
     
     
     int num = input.nextInt();
     
     while (num > 0)
     {
      fact = fact * num ;
      num--;
      }
      
      System.out.println("Factorial of a number is : " +fact);
      }
      }
     
