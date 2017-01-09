import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNext()){
			String s = sc.nextLine();
			count++;
			System.out.println(count + " " + s);
		}
		sc.close();
	}
}
