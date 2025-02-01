import Booking.*;
import Customer.*;
import Employee.*;
import Property.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CMainView {

  // Declaring View and Model
  VMainView mainView;
  MMainView mainModel;
  // Declaring storage
  ArrayList<Employee> employees = new ArrayList<Employee>();
  ArrayList<Customer> customers = new ArrayList<Customer>();
  ArrayList<Property> properties = new ArrayList<Property>();
  ArrayList<Booking> bookings = new ArrayList<Booking>();

  // Program Start Constructor
  CMainView() {
    // Initializing View and Model
    mainView = new VMainView();
    mainModel = new MMainView(employees, customers, properties, bookings);
    // Adding action listeners
    mainView.setAddEmployeeListener(new addEmployeeListener());
    mainView.setAddCustomerListener(new addCustomerListener());
    mainView.setAddBookingListener(new addBookingListener());
    mainView.setAddPropertyListener(new addPropertyListener());
    mainView.setShowBookingsListener(new showBookingsListener());
    mainView.setShowCustomersListener(new showCustomersListener());
    mainView.setShowPropertiesListener(new showPropertiesListener());
  }

  // Cancel Buttons Constructor
  CMainView(
    ArrayList<Employee> employees,
    ArrayList<Customer> customers,
    ArrayList<Property> properties,
    ArrayList<Booking> bookings
  ) {
    // Syncing Storage
    // Sync first before creating the model
    this.employees = employees;
    this.customers = customers;
    this.properties = properties;
    this.bookings = bookings;
    // Initializing View and Model
    mainView = new VMainView();
    mainModel =
      new MMainView(
        this.employees,
        this.customers,
        this.properties,
        this.bookings
      );

    // Adding action listeners
    mainView.setAddEmployeeListener(new addEmployeeListener());
    mainView.setAddCustomerListener(new addCustomerListener());
    mainView.setAddBookingListener(new addBookingListener());
    mainView.setAddPropertyListener(new addPropertyListener());
    mainView.setShowBookingsListener(new showBookingsListener());
    mainView.setShowCustomersListener(new showCustomersListener());
    mainView.setShowPropertiesListener(new showPropertiesListener());
  }

  // Add employee listener
  public class addEmployeeListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainModel.addEmployee();
      mainView.dispose();
    }
  }

  // Add customer listener
  public class addCustomerListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainModel.addCustomer();
      mainView.dispose();
    }
  }

  // Add booking listener
  public class addBookingListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainModel.addBooking();
      mainView.dispose();
    }
  }

  // Add property listener
  public class addPropertyListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainModel.addProperty();
      mainView.dispose();
    }
  }

  // Show bookings listener
  public class showBookingsListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainModel.showBookings();
      mainView.dispose();
    }
  }

  // Show customers listener
  public class showCustomersListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainModel.showCustomers();
      mainView.dispose();
    }
  }

  // Show properties listener
  public class showPropertiesListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainModel.showProperties();
      mainView.dispose();
    }
  }
}
