import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VMainView extends JFrame {

  // Declaring components
  JLabel compName;
  JPanel mainPanel, titlePanel;
  JButton[] buttons;

  VMainView() {
    // Initializing Panels
    titlePanel = new JPanel();
    mainPanel = new JPanel(new GridBagLayout());
    // Initializing JButtons
    buttons = new JButton[7];

    // Configuring app header
    compName = new JLabel("Build Dev");
    compName.setFont(new Font("Arial", Font.BOLD, 30));
    titlePanel.add(compName);

    // Configuring JButtons
    for (int i = 0; i < buttons.length; i++) {
      GridBagConstraints c = new GridBagConstraints();
      // JButton Labels
      String[] labels = {
        "Add Employee",
        "Add Customer",
        "Add Property",
        "Add Booking",
        "Show Bookings",
        "Show Customers",
        "Show Properties",
      };
      // Initializing JButtons
      buttons[i] = new JButton(labels[i]);
      buttons[i].setFocusable(false);

      if (i == 1 || i == 3 || i == 5) c.gridx = 1; else c.gridx = 0;

      c.ipadx = 50;
      c.ipady = 50;

      if (i == 6) c.gridwidth = 2;

      c.fill = GridBagConstraints.HORIZONTAL;
      // Adding button mainPanel with constraints
      mainPanel.add(buttons[i], c);
    }

    // Configuring Jframe
    this.setLayout(new BorderLayout());
    // Adding Panels
    this.add(titlePanel, BorderLayout.NORTH);
    this.add(mainPanel, BorderLayout.CENTER);
    this.setSize(500, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Build Dev Software");
    this.setLocationRelativeTo(null);
    this.pack();
    this.setVisible(true);
  }

  // Binding Listener to Add Employee Button
  public void setAddEmployeeListener(ActionListener listener) {
    buttons[0].addActionListener(listener);
  }

  // Binding Listener to Add Customer Button
  public void setAddCustomerListener(ActionListener listener) {
    buttons[1].addActionListener(listener);
  }

  // Binding Listener to Add Property Button
  public void setAddPropertyListener(ActionListener listener) {
    buttons[2].addActionListener(listener);
  }

  // Binding Listener to Add Booking Button
  public void setAddBookingListener(ActionListener listener) {
    buttons[3].addActionListener(listener);
  }

  // Binding Listener to Show Bookings Button
  public void setShowBookingsListener(ActionListener listener) {
    buttons[4].addActionListener(listener);
  }

  // Binding Listener to Show Customers Button
  public void setShowCustomersListener(ActionListener listener) {
    buttons[5].addActionListener(listener);
  }

  // Binding Listener to Show Properties Button
  public void setShowPropertiesListener(ActionListener listener) {
    buttons[6].addActionListener(listener);
  }
}
