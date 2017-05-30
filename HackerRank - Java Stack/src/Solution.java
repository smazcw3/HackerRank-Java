import java.util.*;

class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         // Implemented code below
         while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
        	 
         if(input.isEmpty() == true){
        	 System.out.println("true");
         }
         else{
        	 System.out.println("false");
         }
      }
      sc.close();
      
   }
}
