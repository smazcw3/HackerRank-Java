import java.util.HashMap;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); 
		for(int i = 0; i < n; i++){
			String name = sc.nextLine();
			int number = sc.nextInt();
			hashmap.put(name, number);
			sc.nextLine();
		}
		
		while(sc.hasNext()){
			String q = sc.nextLine();
			try {
				int result = hashmap.get(q);
				System.out.println(q + "=" + result);
			} catch (NullPointerException e) {
				System.out.println("Not found");
			}				
		}
		sc.nextLine();	
	}
}

