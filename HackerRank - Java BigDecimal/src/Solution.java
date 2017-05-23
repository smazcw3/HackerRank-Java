import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Solution{

    public static void main(String []args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        //Implemented code below
      	Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				BigDecimal a1 = new BigDecimal(o1);
				BigDecimal a2 = new BigDecimal(o2);
				return a1.compareTo(a2);
			}    		
      	}));
      	      	
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}