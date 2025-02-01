import Booking.*;
import Customer.*;
import Employee.*;
import Property.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Caddcustomer {

  // Declaring Storage
  ArrayList<Employee> employees;
  ArrayList<Customer> customers;
  ArrayList<Property> properties;
  ArrayList<Booking> bookings;
  // Declaring Model and View
  Vaddcustomer addCusView;
  Maddcustomer addCusModel;

  Caddcustomer(
    ArrayList<Employee> employees,
    ArrayList<Customer> customers,
    ArrayList<Property> properties,
    ArrayList<Booking> bookings
  ) {
    // Syncing storage
    this.employees = employees;
    this.customers = customers;
    this.properties = properties;
    this.bookings = bookings;

    // Intializing Model and View
    addCusModel =
      new Maddcustomer(
        this.employees,
        this.customers,
        this.properties,
        this.bookings
      );
    addCusView = new Vaddcustomer();
    // Setting action listeners
    addCusView.setAddButtonListener(new addActionListener());
    addCusView.setCancelButtonListener(new cancelActionListener());
  }

  // Add Button Listener
  public class addActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      // Retrieving field values
      String fName = addCusView.getFNameFieldText();
      String mName = addCusView.getMNameFieldText();
      String lName = addCusView.getLNameFieldText();
      String age = addCusView.getAgeFieldText();
      String number = addCusView.getNumberFieldText();
      boolean isAgeValid = true, isNumberValid = true;

      // Checks if String in Age Field is a number
      try {
        Integer.parseInt(age);
      } catch (NumberFormatException ex) {
        isAgeValid = false;
      }

      // Checks if String in Number Field is a number
      try {
        Integer.parseInt(number);
      } catch (NumberFormatException ex) {
        isNumberValid = false;
      }

      // Checks if Fields are not empty
      if (fName.equals("")) {
        JOptionPane.showMessageDialog(
          null,
          "Please enter the customer's first name!",
          "Error",
          JOptionPane.WARNING_MESSAGE
        );
      } else if (mName.equals("")) {
        JOptionPane.showMessageDialog(
          null,
          "Please enter the customer's middle name!",
          "Error",
          JOptionPane.WARNING_MESSAGE
        );
      } else if (lName.equals("")) {
        JOptionPane.showMessageDialog(
          null,
          "Please enter the customer's last name!",
          "Error",
          JOptionPane.WARNING_MESSAGE
        );
      } else if (age.equals("")) {
        JOptionPane.showMessageDialog(
          null,
          "Please enter the customer's age",
          "Error",
          JOptionPane.WARNING_MESSAGE
        );
      } else if (!isAgeValid) {
        JOptionPane.showMessageDialog(
          null,
          "Please enter a valid age!",
          "Error",
          JOptionPane.WARNING_MESSAGE
        );
      } else if (number.equals("")) {
        JOptionPane.showMessageDialog(
          null,
          "Please enter the customer's number!",
          "Error",
          JOptionPane.WARNING_MESSAGE
        );
      } else if (!isNumberValid) {
        JOptionPane.showMessageDialog(
          null,
          "Please enter a valid contact number!",
          "Error",
          JOptionPane.WARNING_MESSAGE
        );
      } else {
        // All Fields are Valid
        JOptionPane.showMessageDialog(
          null,
          "Customer added successfully!",
          "Success",
          JOptionPane.PLAIN_MESSAGE
        );
        addCusView.dispose();
        addCusModel.addCustomer(fName, mName, lName, age, number);
      }
    }
  }

  // Cancel Button Listener
  public class cancelActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      addCusModel.cancel();
      addCusView.dispose();
    }
  }
}
