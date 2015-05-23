import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaExample extends JFrame {
  private JButton button;
  
  public JavaExample() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600,600);
    this.setTitle("Sean Snyder Rocks");
    JPanel panel = new JPanel();
    JLabel title = new JLabel("Title");
    button = new JButton("Don't click!");
    JMenuBar menu = new JMenuBar();
    JMenuItem fileMenu = new JMenuItem("File");
    menu.add(fileMenu);
    panel.setSize(400,400);

    button.addActionListener(new ButtonListener());
    panel.add(title);
    panel.add(button);
    this.setJMenuBar(menu);
    this.add(panel);
    this.setVisible(true);
  }
  public static void main(String[] args) {
    new JavaExample();
  }

  class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      button.setText("TOLD YOU TO NOT CLICK!!!!");
    }
  }


}
