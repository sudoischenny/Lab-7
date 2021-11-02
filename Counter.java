import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;
  Counter() {
      JFrame frame = new JFrame("Let's Count");
      frame.setLayout(new FlowLayout());
      frame.setSize(200,110);

      JButton left = new JButton("Left");
      JButton right = new JButton("Right");

      leftCount = 0;
      rightCount = 0;

      left.addActionListener(this);
      right.addActionListener(this);

  
  }
}