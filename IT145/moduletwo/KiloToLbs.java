/*  Program by Sean Snyder, SNHU IT-145, May 23rd 2015
 *
 *  A Program that opens a dialog box and asks for a mass in kilograms.
 *  It returns the persons weight in pounds.
 *
 */

import javax.swing.*;

public class KiloToLbs {

  public KiloToLbs() {
    String userResponse, conversion;
    double kilograms, inPounds;
    /* tries to parse information from the input box and will catch any non numeric values,
     * inform the user and exit.  String is formatted to two decimals.
    */
    try {
      userResponse = JOptionPane.showInputDialog("Please enter a persons mass in kilograms:");
      kilograms = Double.parseDouble(userResponse);
      inPounds = kilograms * 2.2;
      conversion = "The persons weight is " + String.format("%.2f",inPounds) + " pounds.";
      JOptionPane.showMessageDialog(null, conversion, "Kilograms converted to Pounds", JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
    }catch(Exception e) {
      JOptionPane.showMessageDialog(null,"You entered something other than a number value!", "Invalid input", JOptionPane.ERROR_MESSAGE);
      System.exit(1);
    }
  }
  public static void main(String[] args) {
    new KiloToLbs();
  }
}
