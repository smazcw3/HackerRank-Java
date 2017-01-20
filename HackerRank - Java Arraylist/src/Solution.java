import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> alist = new ArrayList<>();
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			ArrayList<Integer>arr = new ArrayList<Integer>(value);
			for(int j = 0; j < value; j++){
				int data = sc.nextInt();
				arr.add(data);
			}
			alist.add(arr);
		}
		int q = sc.nextInt();
		for(int j = 0; j < q; j++){
			int x_line = sc.nextInt();
			int y_position = sc.nextInt();
			try {
				System.out.println(alist.get(x_line - 1).get(y_position - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}	
		sc.close();
	}
}
