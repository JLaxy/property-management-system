import Booking.*;
import Customer.*;
import Employee.*;
import Property.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Caddproperties {

  Vaddproperties Pview;
  //storage
  ArrayList<Employee> employees;
  ArrayList<Customer> customers;
  ArrayList<Property> properties;
  ArrayList<Booking> bookings;

  // for sync
  Caddproperties(
    ArrayList<Employee> employees,
    ArrayList<Customer> customers,
    ArrayList<Property> properties,
    ArrayList<Booking> bookings
  ) {
    this.employees = employees;
    this.customers = customers;
    this.properties = properties;
    this.bookings = bookings;
    Pview = new Vaddproperties();
    // declare addbtn and cancelbtn and locate at Vproperties
    Pview.setAddButtonListener(new addbtnActionListener());
    Pview.setCancelButtonListener(new cancelbtnActionListener());
  }

  // add Button Listener that performed an action
  public class addbtnActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(
        null,
        "Properties Added Sucessfully!",
        "Already Added",
        JOptionPane.PLAIN_MESSAGE
      );
      Pview.dispose();
      new CMainView();
    }
  }

  // Cancel Button Listener that will return to main view
  public class cancelbtnActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      Pview.dispose();
      new CMainView();
    }
  }
}
