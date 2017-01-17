import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++){
			int val = sc.nextInt();
			a.add(i, val);
		}
	
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			String q1 = sc.next();
			if(q1.equals("Insert")){
				int x = sc.nextInt();
				int y = sc.nextInt();
				a.add(x, y);
			}
			if(q1.equals("Delete")){
				int x = sc.nextInt();
				a.remove(x);
			}
		}
		sc.close();
		
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) +  " ");
        }
	}
}
