/* Sean Snyder - IT 145 - Return three inputed numbers in non-descending order
 * May 26, 2015
 *
 * Program prompts the user to enter three numbers to be sorted. Each string response is
 * parsed into an integer and stored in an integer array.  The array is sorted and the user
 * is shown the sorted data. Added exception handling if someone escapes during entering
 * numbers or decline to continue in the beginning. 
 *
 * */


import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ReturnThreeNonDescending {
  public ReturnThreeNonDescending() {
    String prompt;
    int confirm, firstNum, secondNum, thirdNum;

    confirm = JOptionPane.showConfirmDialog(null,
                     "This program takes three numbers and sorts them in non-descending order.\nDo you want to continue?",
                     "Sort Three Numbers - Sean Snyder - IT 145", JOptionPane.YES_NO_OPTION);
    if(confirm == 1) {
      System.exit(0);
    }

    try {
    prompt = JOptionPane.showInputDialog("Please enter the first number:");
    firstNum = parseUserInput(prompt);

    prompt = JOptionPane.showInputDialog("Enter the second number:");
    secondNum = parseUserInput(prompt);

    prompt = JOptionPane.showInputDialog("Enter the third number:");
    thirdNum = parseUserInput(prompt);

    int[] inputArray = { firstNum, secondNum, thirdNum };

    Arrays.sort(inputArray);

    JOptionPane.showConfirmDialog(null,getList(inputArray),
        "Sorted Results", JOptionPane.DEFAULT_OPTION);

    System.exit(0);
    }catch(Exception e) {
      System.out.println("An error occured");
      System.exit(0);
    }
  }

  protected String getList(int[] list) {
    StringBuilder sb = new StringBuilder();
    for(int element : list) {
      sb.append(element + "\n");
    }
    return sb.toString();
  }

  protected int parseUserInput(String input) {
    int userInput = Integer.parseInt(input);
    return userInput;
  }

  public static void main(String[] args) {
    new ReturnThreeNonDescending();
  }
}
