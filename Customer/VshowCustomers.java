package Customer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class VshowCustomers extends JFrame {

  JFrame frame = new JFrame("Customer List");

  JPanel mainPane;
  JPanel topPane;
  JPanel tablePane;

  JLabel selectAccountLabel;
  JButton cancelButton;
  JTable table;

  JScrollPane scroll;

 public VshowCustomers(ArrayList<Customer> customerlist) {
    tablePane = new JPanel();
    topPane = new JPanel();
    mainPane = new JPanel();
    //table
    String[][] data = new String[30][5];
    String[] columnNames = {
      "First Name",
      "Middle Name",
      "Last Name",
      "Age",
      "Contact Number",
    };

    int i = 0;
    for (Customer c : customerlist) {
      String name1 = c.getfName();
      String name2 = c.getmName();
      String name3 = c.getlName();
      String name4 = c.getNumber();
      String age = Integer.toString(c.getAge());
      String[] row = { name1, name2, name3, age, name4 };
      data[i] = row;
      i++;
    }

    table = new JTable(data, columnNames);
    scroll =
      new JScrollPane(
        table,
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
      );

    table.setPreferredScrollableViewportSize(new Dimension(420, 250));
    table.setFillsViewportHeight(true);

    selectAccountLabel = new JLabel("Select Customer");

    //action listener
    cancelButton = new JButton("Return");

    topPane.setLayout(new BorderLayout());
    topPane.add(cancelButton, BorderLayout.EAST);
    topPane.add(selectAccountLabel, BorderLayout.WEST);

    tablePane.add(scroll);

    mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));

    this.add(topPane, BorderLayout.NORTH);
    this.add(tablePane, BorderLayout.CENTER);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Build Dev Software - Registered Customers");
  }

  public void setCancelListener(ActionListener listener) {
    cancelButton.addActionListener(listener);
  }
}
