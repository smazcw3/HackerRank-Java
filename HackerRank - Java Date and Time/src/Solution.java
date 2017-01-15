import java.time.LocalDate;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.print(date.getDayOfWeek());
        in.close();
	}
}
