import Booking.*;
import Customer.*;
import Employee.*;
import Property.*;
import java.util.ArrayList;

public class Maddcustomer {

  ArrayList<Employee> employees;
  ArrayList<Customer> customers;
  ArrayList<Property> properties;
  ArrayList<Booking> bookings;

  Maddcustomer(
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

  public void addCustomer(
    String fName,
    String mName,
    String lName,
    String age,
    String number
  ) {
    // customers.add(new Customer(fName, mName, lName, age, number));
    new CMainView(
      this.employees,
      this.customers,
      this.properties,
      this.bookings
    );
  }

  public void cancel() {
    new CMainView(
      this.employees,
      this.customers,
      this.properties,
      this.bookings
    );
  }
}
