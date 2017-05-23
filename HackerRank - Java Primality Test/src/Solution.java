import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      // Implemented code below
      int certainty = 5;
      if(n.isProbablePrime(certainty)){
    	  System.out.println("prime");
      }
      else{
    	  System.out.println("not prime"); 
      }
   }
}

