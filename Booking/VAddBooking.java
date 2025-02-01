package Booking;

import Customer.*;
import Property.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class VAddBooking extends JPanel {

  JLabel customerName, propertyAddress;
  JComboBox<Customer> customerBox;
  JComboBox<Property> propertyBox;
  //instantiate the arraylist
  ArrayList<Customer> customers;
  ArrayList<Property> properties;

  public VAddBooking(
    ArrayList<Customer> customers,
    ArrayList<Property> properties
  ) {
    //synchronize the arraylists
    this.customers = customers;
    this.properties = properties;
    //set the layout of the panel
    this.setLayout(new GridLayout());

    //create the labels for the combo box
    customerName = new JLabel("Customer Name");
    propertyAddress = new JLabel("Property");

    //initialize hte combo box for customer name
    customerBox = new JComboBox<Customer>();
    customerBox.setModel(
      new DefaultComboBoxModel<Customer>(
        this.customers.toArray(new Customer[0])
      )
    ); //convert the arraylist to an array

    //initialize the combo box for property
    propertyBox = new JComboBox<Property>();
    propertyBox.setModel(
      new DefaultComboBoxModel<Property>(
        this.properties.toArray(new Property[0])
      )
    ); //convert the arraylist to an array
    // --------------- Sub panel for labels-------------------------------------------
    JPanel labelPanel = new JPanel();
    labelPanel.setLayout(new GridBagLayout());
    //gridbagconstraints is used to adjust the position of the components inside the grid bag layout
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH;
    c.insets = new Insets(10, 0, 10, 10);
    c.gridx = 0;
    c.gridy = 0;
    labelPanel.add(customerName, c);
    c.gridx = 0;
    c.gridy = 1;
    labelPanel.add(propertyAddress, c);
    //--------------sub panel for the combo boxes-----------------------------------------
    JPanel options = new JPanel();
    options.setLayout(new GridBagLayout());
    c.gridx = 0;
    c.gridy = 0;
    options.add(customerBox, c);
    c.gridx = 0;
    c.gridy = 1;
    options.add(propertyBox, c);
    //add the sub panels to the main panel
    add(labelPanel);
    add(options);
  }

  //getters for combo box value
  //return a null value in order for the validation to work
  public Customer getCustomerName() {
    if (customerBox.getSelectedItem() == null) {
      System.out.println("Yes");
      return null;
    }
    return (Customer) customerBox.getSelectedItem();
  }

  public Property getPropertyName() {
    if (propertyBox.getSelectedItem() == null) {
      System.out.println("Yes");
      return null;
    }
    return (Property) propertyBox.getSelectedItem();
  }
}
