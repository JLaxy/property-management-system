package Booking;

import Customer.*;
import Property.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JButton;

public class Vshowbooking extends JFrame {

  ArrayList<Booking> Booking;

  JFrame frame = new JFrame("Customer List");

  JPanel mainPane;
  JPanel topPane;
  JPanel tablePane;

  JLabel selectAccountLabel;
  JButton cancelButton;
  JTable table;

  JScrollPane scroll;

  public Vshowbooking(ArrayList<Booking> Booking) {
    this.Booking = Booking;

    tablePane = new JPanel();
    topPane = new JPanel();
    mainPane = new JPanel();
    //table
    String[][] data = new String[30][2];
    String[] columnNames = { "Customer", "Property" };

    int i = 0;
    for (Booking c : Booking) {
      Customer curcust = c.getCustomer();
      Property curprop = c.getProperty();

      String Cust =
      curcust.getfName() +
      " " +
      curcust.getmName() +
      " " +
      curcust.getlName();
      String prop =
        curprop.getHouseType() +
        ";" +
        curprop.getCity() +
        ", " +
        curprop.getBlock() +
        ", " +
        curprop.getLot();

      String[] row = { Cust, prop };
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

  public void setReturnListener(ActionListener listener) {
    cancelButton.addActionListener(listener);
  }
}
