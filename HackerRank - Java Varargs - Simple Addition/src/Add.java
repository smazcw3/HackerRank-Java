class Add {
	public void add(int... numbers) {
		int sum = 0;
		String rep = "";
		for(int n: numbers){
			rep = rep + n + "+";
			sum = sum + n;		
		}
		System.out.println(rep.substring(0, rep.length() - 1) + "=" + sum);
	}
}
