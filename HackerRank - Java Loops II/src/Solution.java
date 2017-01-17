import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j = 0; j < n; j++){
            	int d = j;
            	int s = 0;
            	s = s + a;
            	while(d >= 0){
                    s = s + (int) Math.pow(2, d) * b;
                    d--;
            	}
            	System.out.print(s + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}

