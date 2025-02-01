import Employee.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CAddEmployee extends JFrame {

  JFrame mainframe;
  JButton addBtn, cancelBtn;
  VAddEmployee view;
  MAddEmployee modelEmp;
  ArrayList<Employee> datas;

  CAddEmployee(ArrayList<Employee> datas) {
    //synchronize the arraylist
    this.datas = datas;
    //instantiate the model for add employee
    modelEmp = new MAddEmployee(datas);
    //set the layout of the frame
    this.setLayout(new BorderLayout());
    //create the panel for the add employee view
    view = new VAddEmployee();
    //create the buttons for adding employees and exiting the program
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
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setSize(650, 240); //edit this if the frame is too small
    // this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setTitle("Build Dev Software - Adding Employee");

    mainframe = this;
  }

  //action listener for the add button
  public class addListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      //instantiate values to pass to the employee object
      //trim is added to take out whitespaces on the input
      String fName = view.getFirstName().getText().trim();
      String mName = view.getMiddleName().getText().trim();
      String lName = view.getLastName().getText().trim();
      String age = view.getAge().getText().trim();
      //call the add method from the method to validate the input
      if (modelEmp.add(fName, mName, lName, age) == true) {
        JOptionPane.showMessageDialog(null, "Employee added succesfully");
        //set of command to make the field empty again
        view.setFirstInput("");
        view.setMiddleInput("");
        view.setLastInput("");
        view.setAgeInput("");
        //for loop to check if the employee was added successfully
        //comment out the for loop if the check is no longer needed
        for (Employee data : datas) {
          System.out.println(data.getFirstName());
        }
        mainframe.dispose();
        new CMainView();
      }
      //end for if statement
    } //end for actionperformed block
  } //end of the addListener class

  //method that will close the window if the cancel button is pressed
  private void cancelBtnActionPerformed(ActionEvent evt) {
    this.setVisible(false);
  }

  //Action listener for the cancel button
  public class cancelListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      cancelBtnActionPerformed(e);
      new CMainView();
    } //end for actionperformed block
  } //end of cancelListner class
}
