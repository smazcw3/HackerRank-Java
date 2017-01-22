import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		BitSet bs1 = new BitSet(N);
		BitSet bs2 = new BitSet(N);
		
		for(int i = 0; i < M; i++){
			String s = sc.next();
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			
			if(s.equals("AND")){
				if(a1 == 1){
					bs1.and(bs2);	
				}
				else{
					bs2.and(bs1);
				}

				System.out.print(bs1.cardinality() + " " + bs2.cardinality());			
				System.out.println();
			}
			else if(s.equals("OR")){
				if(a1 == 1){
					bs1.or(bs2);	
				}
				else{
					bs2.or(bs1);
				}
				
				System.out.print(bs1.cardinality() + " " + bs2.cardinality());	
				System.out.println();
			}
			else if(s.equals("XOR")){
				if(a1 == 1){
					bs1.xor(bs2);	
				}
				else{
					bs2.xor(bs1);
				}

				System.out.print(bs1.cardinality() + " " + bs2.cardinality());		
				System.out.println();
			}
			else if(s.equals("FLIP")){
				if(a1 == 1){
					bs1.flip(a2);
				}
				else{
					bs2.flip(a2);
				}
				System.out.print(bs1.cardinality() + " " + bs2.cardinality());
				System.out.println();
			}

			else{
				if(a1 == 1){
					bs1.set(a2);
				}
				else{
					bs2.set(a2);
				}
				System.out.print(bs1.cardinality() + " " + bs2.cardinality());
				System.out.println();
			}
		}
		sc.close();
	}
}
