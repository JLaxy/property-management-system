import Booking.*;
import Customer.*;
import Employee.*;
import Property.*;
import java.util.ArrayList;

public class MMainView {

  // Declaring storage
  ArrayList<Employee> employees;
  ArrayList<Customer> customers;
  ArrayList<Property> properties;
  ArrayList<Booking> bookings;

  MMainView(
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

  // Instantiate Add Employee Controller
  public void addEmployee() {
    System.out.println("adding employee...");
    new CAddEmployee(this.employees);
  }

  // Instantiate Add Customer Controller
  public void addCustomer() {
    new Caddcustomer(
      this.employees,
      this.customers,
      this.properties,
      this.bookings
    );
  }

  // Instantiate Add Property Controller
  public void addProperty() {
    System.out.println("adding property...");
    new Caddproperties(
      this.employees,
      this.customers,
      this.properties,
      this.bookings
    );
  }

  // Instantiate Add Booking Controller
  public void addBooking() {
    System.out.println("adding new booking...");

    ArrayList<Customer> dummycustomerlist = new ArrayList<>();
    ArrayList<Property> dummyproperty = new ArrayList<>();

    dummycustomerlist.add(
      new Customer("Aladdin", "Nibwa", "Doquar", "42193i12", 23)
    );
    dummycustomerlist.add(
      new Customer("Mohammad", "Alli", "Juspan", "567411", 20)
    );
    dummycustomerlist.add(
      new Customer("Daniel", "Ugat", "Tigas", "08241612", 18)
    );
    dummycustomerlist.add(
      new Customer("Maliketh", "Trix", "Trinidad", "09512512", 28)
    );

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

    new CAddBooking(
      this.employees,
      dummycustomerlist,
      dummyproperty,
      this.bookings
    );
  }

  // Instantiate Show Bookings Controller
  public void showBookings() {
    System.out.println("showing bookings...");
    new Cshowbooking(this.bookings);
  }

  // Instantiate Show Customers Controller
  public void showCustomers() {
    System.out.println("showing customers...");
    new CshowCustomers(
      this.customers,
      this.employees,
      this.properties,
      this.bookings
    );
  }

  // Instantiate Show Properties Controller
  public void showProperties() {
    System.out.println("showing properties...");
    new Cshowproperties(this.properties);
  }
}
