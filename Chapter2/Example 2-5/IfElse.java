/**
 * Example 2-5
 */
package ca.ucalgary.ensf409;
import java.time.LocalDateTime;
/**
 * Demonstrates if-else statement
 * @author mahdi
 *
 */
public class IfElse {
	public static void main(String[] args) {
	    int hour = LocalDateTime.now().getHour();
	    int minute = LocalDateTime.now().getMinute();
	    System.out.println("It is " + hour + ":" + minute);
	    if (hour < 10) {
	      System.out.println("Good morning.");
	    } else if (hour < 20) {
	      System.out.println("Good day.");
	    }  else {
	      System.out.println("Good evening.");
	    }
	  }
}
