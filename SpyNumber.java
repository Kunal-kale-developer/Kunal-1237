public class SpyNumber
{
 public static void main(String args [])
  {
  int num = 1124, sum =0, product=1;
  
  while(num > 0)
   {
    int last = num % 10;
     num = num /10 ;
     sum = sum + last;

    product = product * last;

    }
     if ( sum == product)
      {
       System.out.println("It is a spy number");
       
       }
       else
        {
        System.out.println("It is not a spy number");
        
        }
        }
        }
