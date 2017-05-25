class Prime {
	public void checkPrime(int... numbers){
		String res_prime_numbers = "";
		for(int num: numbers){
			if(primeTest(num)){
				res_prime_numbers += num + " ";				
			}						
		}
		if(res_prime_numbers != ""){
			System.out.println(res_prime_numbers.substring(0, res_prime_numbers.length() - 1));
		}
		else{
			System.out.println();
		}
	}
	
	public boolean primeTest(int num){
		if(num < 2){
			return false;
		}
		 for (int i = 2; i < (num/2) + 1; i++){
	            if (num %i == 0){
	                return false;
	            }
        }
		return true;
	}
}

