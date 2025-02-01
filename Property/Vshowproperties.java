package Property;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Vshowproperties extends JFrame {

  ArrayList<Property> propertylist;
  ArrayList<Property> dummyproperty = new ArrayList<>();

  JButton closeBtn;
  JPanel mainPane;
  JPanel topPane;
  JPanel tablePane;

  JLabel selectAccountLabel;
  JButton closeButton;
  JTable table;

  JScrollPane scroll;

  public Vshowproperties(ArrayList<Property> propertylist) {
    //adding dummy properties
    this.propertylist = propertylist;

    dummyproperty.add(
      new Property("Taytay", "Rizal", "1", "14", "", "Bungalow")
    );
    dummyproperty.add(
      new Property("Marikina", "Manila", "4", "23", "", "Villa")
    );
    dummyproperty.add(
      new Property("Antipolo", "Rizal", "3", "19", "", "Contemporary")
    );
    dummyproperty.add(
      new Property("Metro Manila", "Manila", "2", "14", "", "Hut")
    );
    tablePane = new JPanel();
    topPane = new JPanel();
    mainPane = new JPanel();
    //table
    String[][] data = new String[30][6];
    String[] columnNames = {
      "City",
      "Province",
      "Lot",
      "Block",
      "Area",
      "House Type",
    };

    int i = 0;
    for (Property c : dummyproperty) {
      String l1 = c.getCity();
      String l2 = c.getProvince();
      String l3 = c.getLot();
      String l4 = c.getBlock();
      String l5 = c.getArea();
      String l6 = c.getHouseType();
      String[] row = { l1, l2, l3, l4, l5, l6 };
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

    selectAccountLabel = new JLabel("Select Property");

    //action listener
    closeButton = new JButton("Return");

    topPane.setLayout(new BorderLayout());
    topPane.add(closeButton, BorderLayout.EAST);
    topPane.add(selectAccountLabel, BorderLayout.WEST);

    tablePane.add(scroll);

    mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));
    this.setTitle("Build Dev Software - Registered Properties");
    this.add(topPane, BorderLayout.NORTH);
    this.add(tablePane, BorderLayout.CENTER);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void setReturnListener(ActionListener listener) {
    closeButton.addActionListener(listener);
  }
}
