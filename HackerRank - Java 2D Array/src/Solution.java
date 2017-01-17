import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
       ArrayList<Integer> list = new ArrayList<Integer>();
       int sum = 0;
       for(int i = 0; i < arr.length - 2; i++){
           for(int j = 0; j < arr[0].length - 2; j++){
        	   sum = sum + arr[i][j] + arr[i][j+1] + 
        			   arr[i][j+2] + arr[i+1][j+1] +arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        	   list.add(sum);
        	   sum = 0;
           }
       }
       Collections.sort(list);
       System.out.println(list.get(list.size() - 1));
    }
}
