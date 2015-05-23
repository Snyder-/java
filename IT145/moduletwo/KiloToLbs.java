import java.util.*;
import javax.swing.*;

public class KiloToLbs {

  public KiloToLbs() {
    String userResponse, conversion;
    double kilograms, inPounds;
    userResponse = JOptionPane.showInputDialog("Please enter the kilograms");
    kilograms = Double.parseDouble(userResponse);
    inPounds = kilograms * 2.2;
    conversion = "The person weighs: " + String.format("%.2f",inPounds);
    // conversion = String.format("The person weighs: %.2d", inPounds);
    JOptionPane.showMessageDialog(null, conversion, "Kilograms converted to Pounds", JOptionPane.INFORMATION_MESSAGE);
  }
  public static void main(String[] args) {
    new KiloToLbs();
  }
}
