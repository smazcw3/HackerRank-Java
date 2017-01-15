import java.util.Scanner;

class Solution {
    static Scanner sc = new Scanner(System.in);
    static boolean flag;
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static{
	if(B > 0 && H > 0){
	    flag = true;
	}
	else{
	    try{
		flag = false;
		    throw new Exception("Breadth and height must be positive");
		}catch(Exception e){
		    System.out.println(e);
		}
	     }
	sc.close();
	}
	
	public static void main(String[] args){
	    if(flag){
	       int area = B * H;
	       System.out.print(area);
	     }		
	}//end of main

}//end of class

