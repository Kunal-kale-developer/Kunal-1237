public class ReverseANumber
 {
  public static void main (String args [])
  {
  
  int rev =0;
  int num = 321;
  
  while ( num > 0)
  {
   int last = num % 10;
   rev = rev * 10 + last ;
   num = num /10;
   }
   System.out.println("Reverse of a number is " +rev);
   }
   }
