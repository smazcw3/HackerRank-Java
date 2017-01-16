import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	ArrayList<String>string_list = new ArrayList<String>();
    	s = s.replaceAll("\\s+","");
    	int k  = sc.nextInt();
    	for(int i = 0; i < s.length() - k + 1; i++){
    		string_list.add(s.substring(i, i + k));
    	}   	
    	Collections.sort(string_list);
    	System.out.println(string_list.get(0));
    	System.out.println(string_list.get(string_list.size() - 1));
    }
}
