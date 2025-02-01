import Booking.*;
import Customer.*;
import Employee.*;
import Property.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class CshowCustomers extends JFrame {

  VshowCustomers mainView;
  ArrayList<Employee> employees;
  ArrayList<Customer> customerlist;
  ArrayList<Property> properties;
  ArrayList<Booking> bookings;

  public CshowCustomers(
    ArrayList<Customer> customerlist,
    ArrayList<Employee> employees,
    ArrayList<Property> properties,
    ArrayList<Booking> bookings
  ) {
    //views and models
    this.employees = employees;
    this.properties = properties;
    this.bookings = bookings;

    ArrayList<Customer> dummycustomerlist = new ArrayList<Customer>();
    dummycustomerlist.add(
      new Customer("Customer ", "1", "A.", "+639123456789", 20)
    );
    dummycustomerlist.add(
      new Customer("Customer", "2", "B.", "+639123456789", 21)
    );
    dummycustomerlist.add(
      new Customer("Customer", "3", "C.", "+639123456789", 22)
    );
    dummycustomerlist.add(
      new Customer("Customer", "4", "D.", "+639123456789", 23)
    );

    mainView = new VshowCustomers(dummycustomerlist);

    //action listener
    mainView.setCancelListener(new cancelListener());
  }

  public class cancelListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainView.dispose();
      new CMainView();
    }
  }
}
