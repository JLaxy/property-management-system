import Booking.*;
import Customer.*;
import Employee.*;
import Property.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MAddBooking {

  // Declaring storage
  ArrayList<Employee> employees;
  ArrayList<Customer> customers;
  ArrayList<Property> properties;
  ArrayList<Booking> bookings;

  public MAddBooking(
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
  }

  //Create the new booking and add it to storage
  public boolean addBooking(Customer name, Property address) {
    Customer customer = name;
    Property property = address;
    Boolean copyFlag = false;
    if (customer == null && property == null) {
      JOptionPane.showMessageDialog(
        null,
        "No customer or property to create booking"
      );
    } else {
      JOptionPane.showMessageDialog(null, "Booking successfully added");
      copyFlag = true;
      //return the user to main menu
      new CMainView(
        this.employees,
        this.customers,
        this.properties,
        this.bookings
      );
    }

    return copyFlag;
  }
}
