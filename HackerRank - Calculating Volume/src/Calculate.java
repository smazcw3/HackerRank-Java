import java.io.IOException;
import java.util.Scanner;

class Calculate {
	
	private Scanner sc = new Scanner(System.in);
	Output output = new Output();

	public int get_int_val() throws IOException {
		int readInt = sc.nextInt();
		if(readInt <= 0){
			throw new NumberFormatException("All the values must be positive");
		}
		return readInt;
	}
	
	public double get_double_val() throws IOException{
		double readDouble = sc.nextDouble();
		if(readDouble <= 0){
			throw new NumberFormatException("All the values must be positive");
		}
		return readDouble;
	}

	public static Volume do_calc() {
		return new Volume();
	}
	
	public void display(double volume) {
		System.out.println(volume);	
	}
}
