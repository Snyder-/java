/* Sean Snyder - IT 145 - Return three inputed numbers in non-descending order
 *
 * Program prompts the user to enter three numbers to be sorted. Each string response is
 * parsed into an integer and stored in an integer array.  The array is sorted and the user
 * is shown the sorted data.
 *
 * */


import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ReturnThreeNonDescending {
  public ReturnThreeNonDescending() {
    String prompt;
    int firstNum, secondNum, thirdNum;

    JOptionPane.showConfirmDialog(null,
                     "This program takes three numbers and sorts them in non-descending order.\nDo you want to continue?",
                     "Sort Three Numbers - Sean Snyder - IT 145", JOptionPane.YES_NO_OPTION);

    prompt = JOptionPane.showInputDialog("Please enter the first number:");
    firstNum = parseUserInput(prompt);

    prompt = JOptionPane.showInputDialog("Enter the second number:");
    secondNum = parseUserInput(prompt);

    prompt = JOptionPane.showInputDialog("Enter the third number:");
    thirdNum = parseUserInput(prompt);

   int[] inputArray = { firstNum, secondNum, thirdNum };

    Arrays.sort(inputArray);

    JOptionPane.showConfirmDialog(null,inputArray[0] + "\n" + inputArray[1] + "\n" + inputArray[2],
        "Sorted Results", JOptionPane.DEFAULT_OPTION);
  }

  public static int parseUserInput(String input) {
    int userInput = Integer.parseInt(input);
    return userInput;
  }

  public static void main(String[] args) {
    new ReturnThreeNonDescending();
  }
}
