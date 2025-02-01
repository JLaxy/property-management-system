import Booking.*;
import Customer.*;
import Employee.*;
import Property.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CAddBooking extends JFrame {

  VAddBooking view;
  JButton addBtn, cancelBtn;
  MAddBooking bookingItem;
  //declare storage
  ArrayList<Employee> employees;
  ArrayList<Customer> customers;
  ArrayList<Property> properties;
  ArrayList<Booking> bookings;

  public CAddBooking(
    ArrayList<Employee> employees,
    ArrayList<Customer> customers,
    ArrayList<Property> properties,
    ArrayList<Booking> bookings
  ) {
    //synchronize the arraylist
    this.employees = employees;
    this.customers = customers;
    this.properties = properties;
    this.bookings = bookings;

    //set the layout of the JFrame
    this.setLayout(new BorderLayout());
    //initialize the view and model
    view = new VAddBooking(this.customers, this.properties);
    bookingItem =
      new MAddBooking(
        this.employees,
        this.customers,
        this.properties,
        this.bookings
      );
    //create the button components
    addBtn = new JButton("ADD");
    addBtn.addActionListener(new addListener()); //add listener to the button
    cancelBtn = new JButton("CANCEL");
    cancelBtn.addActionListener(new cancelListener());

    //create the panel for the buttons
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout());
    buttonPanel.add(addBtn);
    buttonPanel.add(cancelBtn);

    //add the view and button panel to the jframe
    this.add(view, BorderLayout.CENTER);
    this.add(buttonPanel, BorderLayout.SOUTH);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setSize(650, 240); //edit this if the frame is too small
    // this.pack();
    this.setVisible(true);
    this.setTitle("Build Dev Software - Adding Booking");
    //			    this.setResizable(false);
  }

  //action listener for the add button
  public class addListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      Customer name = view.getCustomerName();
      Property address = view.getPropertyName();
      if (bookingItem.addBooking(name, address) == true) {
        exitActionPerformed(e);
      }
    } //end for actionperformed block
  } //end of the addListener class

  //closes the window when add is pressed
  private void exitActionPerformed(ActionEvent evt) {
    this.dispose();
  }

  //method that will close the window if the cancel button is pressed and return the user to the main menu
  private void cancelActionPerformed(ActionEvent evt) {
    this.dispose();
    new CMainView(
      this.employees,
      this.customers,
      this.properties,
      this.bookings
    );
  }

  //Action listener for the cancel button
  public class cancelListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      cancelActionPerformed(e);
    } //end for actionperformed block
  } //end of cancelListner class
}
