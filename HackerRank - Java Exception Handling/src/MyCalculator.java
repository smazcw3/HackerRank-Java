class MyCalculator {
	public int power(int n, int p) throws Exception {
		int result = 0;
			if(n < 0 || p < 0){
				throw new Exception("n and p should be non-negative");
			}
			else{
				result = (int) Math.pow(n, p);
			}
		return result;			
	}
}
