public class MyMath {
	
	public static boolean checker(PerformOperation p, int num) {
		  return p.check(num);
		 }
	//Implemented code below
	public static PerformOperation is_odd() {
		return n -> (n % 2 != 0);
	}

	public static PerformOperation is_prime() {		
		return n -> {
			if(n < 2){
				return false;
			}
			else{
				int sqrt = (int) Math.sqrt(n);
				for (int i = 2; i <= sqrt; i++) {
					if (n % i == 0) {
						return false;
					}
				}
				return true;
			}
		};		
	}

	public static PerformOperation is_palindrome() {
		return n -> {
			String original = Integer.toString(n);
			String reversed = new StringBuilder(Integer.toString(n)).reverse().toString();
			return original.equals(reversed);
		};
	}
}
