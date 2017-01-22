import java.io.IOException;

public class Solution {

	 public static void main(String[] args) throws IOException {
	   DoNotTerminate.forbidExit();
	   try {
	    Calculate cal = new Calculate();
	    int T = cal.get_int_val();
	    while (T--> 0) {
	     double volume = 0.0;
	     int ch = cal.get_int_val();
	     if (ch == 1) {
	      int a = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(a);
	     } else if (ch == 2) {
	      int l = cal.get_int_val();
	      int b = cal.get_int_val();
	      int h = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(l, b, h);

	     } else if (ch == 3) {
	      double r = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r);

	     } else if (ch == 4) {
	      double r = cal.get_double_val();
	      double h = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r, h);

	     }
	     cal.output.display(volume);
	    }

	   } catch (NumberFormatException e) {
	    System.out.print(e);
	   } catch (DoNotTerminate.ExitTrappedException e) {
	    System.out.println("Unsuccessful Termination!!");
	   }


	  } //end of main
	} //end of Solution

