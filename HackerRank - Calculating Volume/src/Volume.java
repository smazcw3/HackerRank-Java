class Volume {
	public static double get_volume(int a){
		return a * a * a;
	}
	
	public static double get_volume(int l, int b, int h){
		return l * b * h;
	}
	
	public static double get_volume(double r){
		return (2 * Math.PI * r * r * r) / 3;	
	}
	
	public static double get_volume(double r, double h){
		return Math.PI * r * r * h;	
	}
}
