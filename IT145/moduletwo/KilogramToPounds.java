/* Sean Snyder - SNHU IT-145 - Problem 2.3 - 5/19/2015
 
   Write a program that prompts the user to enter the mass of a person in
   kilograms and outputs the equivalent weight in pounds.  Output both the
   mass and the weight rounded to two decimal places. (Note that for
   standard Earth gravity, 1 kilogram = 2.2 pounds.) Format your output
   with two decimal places.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KilogramToPounds {
  KilogramToPounds() {
  
    /*
       Instantiate labels, buttons, textfield and jframe from swing library.
       Set defaults and make sure to set program to close correctly.
    */
    JFrame frame = new JFrame("IT-145 Sean Snyder - Problem 2-3");
    JLabel label = new JLabel("Mass in pounds(Lbs):");
    JLabel question = new JLabel("Enter the kilograms (mass) of a person to convert to pounds:");
    JLabel answer = new JLabel("");
    JTextField textField = new JTextField(0);
    JButton button = new JButton("Convert KG to LBS");


    frame.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    frame.setSize(700,250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    /* 
       This function reacts to events on the button.
       Checks to see if there are letters or no input in the textfield. 
       Exception handling for getting a double from a string input.
       Calculates conversion by multiplying kilograms by 2.2.
       Clears content the textfield when button is clicked.
    */
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
      double kilogram;
        if( textField.getText().length() == 0 ) { 
          answer.setText("Enter a number...");
        }else {
           try {
             kilogram = Double.parseDouble(textField.getText()) * 2.2; 
             answer.setText(String.valueOf(kilogram));
           }
           catch ( Exception number_format ) {
             answer.setText("No letters please!");
           }
         }
          textField.setText("");
        }
     });

    /* 
      LAYOUT Section
      
      Use constraints to define grid sections for each object.
      Add each to JFrame.
    */
    c.insets = new Insets(0,50,0,50); 
    
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 0;
    frame.add(question, c);
    
    c.weightx = 0.5;
    c.gridx = 1;
    c.gridy = 0;

    frame.add(textField, c);

    c.weightx = 1.5;
    c.gridwidth = 2;
    c.gridx = 0;
    c.gridy = 1;

    frame.add(button, c);

    c.weightx = 0.0;
    c.gridwidth = 3;
    c.gridx = 0;
    c.gridy = 2;

    frame.add(label, c);

    c.weightx = 0.0;
    c.gridwidth = 3;
    c.gridx = 1;
    c.gridy = 2;

    frame.add(answer, c);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new KilogramToPounds();
      }
    });
  }
}
