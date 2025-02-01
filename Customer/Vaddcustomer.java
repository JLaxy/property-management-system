package Customer;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Vaddcustomer extends JFrame {

  JPanel mainPanel, btnPanel;
  JButton add, cancel;
  JLabel[] labels;
  JTextArea[] fields;

  public Vaddcustomer() {
    
    mainPanel = new JPanel(new GridBagLayout());

    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipadx = 10;
    c.ipady = 10;

    labels = new JLabel[5];
    fields = new JTextArea[5];

    for (int i = 0; i < labels.length; i++) {
      String[] text = {
        "First Name",
        "Middle Name",
        "Last Name",
        "Age",
        "Number",
      };
      labels[i] = new JLabel(text[i]);
      c.gridx = 0;
      mainPanel.add(labels[i], c);

      Border border = new LineBorder(Color.BLACK);
      fields[i] = new JTextArea(1, 30);
      fields[i].setBorder(border);
      fields[i].setLineWrap(true);
      fields[i].setWrapStyleWord(true);
      c.gridx = 1;
      mainPanel.add(new JScrollPane(fields[i]), c);
    }

    btnPanel = new JPanel(new GridLayout());
    add = new JButton("Add");
    add.setFocusable(false);
    cancel = new JButton("Cancel");
    cancel.setFocusable(false);
    btnPanel.add(add);
    btnPanel.add(cancel);

    this.setLayout(new BorderLayout());
    this.add(mainPanel, BorderLayout.NORTH);
    this.add(btnPanel, BorderLayout.SOUTH);
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Build Dev Software - Adding Customer");
    this.setLocationRelativeTo(null);
    this.pack();
    this.setVisible(true);
  }

  // Binding Add Button Listener
  public void setAddButtonListener(ActionListener listener) {
    add.addActionListener(listener);
  }

  // Binding Cancel Button Listener
  public void setCancelButtonListener(ActionListener listener) {
    cancel.addActionListener(listener);
  }

  // Returns First Name Field Text
  public String getFNameFieldText() {
    return fields[0].getText();
  }

  // Returns Middle Name Field Text
  public String getMNameFieldText() {
    return fields[1].getText();
  }

  // Returns Last Name Field Text
  public String getLNameFieldText() {
    return fields[2].getText();
  }

  // Returns Age Field Text
  public String getAgeFieldText() {
    return fields[3].getText();
  }

  // Returns Number Field Text
  public String getNumberFieldText() {
    return fields[4].getText();
  }
}
