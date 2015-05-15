// import the Scanner class from util library
import java.util.Scanner;

// Only one public class is allowed per java file
public class RoundToNearestInteger {
    // create a class method convert
  public void convert() {
    // initialize a Scanner object from Scanner class
    Scanner getUserInput = new Scanner(System.in);
    // Access the system standard output and print to console
    System.out.println("~~~~~ Decimal to Rounded Integer Converter ~~~~~\n\nEnter a decimal number to round to the nearest integer:");
    // define and initialize two variables, one to handle decimals(float) and regular integers(int)
    float userDecimalNumber = getUserInput.nextFloat();
    int roundedNumber = Math.round(userDecimalNumber);  // Use the Math library and access round via method access operator (.)
    // print to console a string concatenated with both variables, also using escaped return characters
    System.out.println("\n\nYou entered: " + userDecimalNumber + "\nThe rounded number is: " + roundedNumber);
  }

  // the main method which runs automatically when the program is executed
  public static void main(String []args) {
    // instantiate RoundToNearestInteger object
    RoundToNearestInteger decimalizer = new RoundToNearestInteger();
    // call convert method on new object
    decimalizer.convert();
  }
}
