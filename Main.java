import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   // Ask for integers
   System.out.println("Please enter in two integers, on seperate lines, to divide.:");
   // declaring numerator and denominator variables
    int numerator = input.nextInt();
    int denominator = input.nextInt();
    // declaring quotient and remainder variables
    int quotient = numerator/denominator;
    int remainder = numerator%denominator;
    // stating the answer
    System.out.println(quotient + " with a of remainder " + remainder);
  }
}
