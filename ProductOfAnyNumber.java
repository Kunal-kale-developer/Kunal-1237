import java.util.Scanner;
 public class ProductOfAnyNumber
  {
   public static void main(String [] args)
    {
    int num, product = 1;
     
     System.out.println("Enter a number:");
     Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
     
     while (num > 0)
     {
      product = product * num ;
      num --;
      
      }
      System.out.println("The product of a number is : " + product);
      }
      }
