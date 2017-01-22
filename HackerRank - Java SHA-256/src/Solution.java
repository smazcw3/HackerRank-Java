import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc;
	try {
		sc = new Scanner(System.in);
		String s = sc.next();
		MessageDigest msd = MessageDigest.getInstance("SHA-256");
		msd.update(s.getBytes(), 0, s.length());
		for(byte b : msd.digest()){
			System.out.printf("%02x", b);
		}
	} catch (Exception e) {
		throw new RuntimeException(e);
	}
    sc.close();
    }
}