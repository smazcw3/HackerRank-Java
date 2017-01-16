import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat local_us = NumberFormat.getCurrencyInstance(Locale.US);
        String us = local_us.format(payment);
        
        NumberFormat local_india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = local_india.format(payment);
        
        NumberFormat local_china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = local_china.format(payment);
        
        NumberFormat local_france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = local_france.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}