package Employee;

import java.awt.*;
import javax.swing.*;

public class VAddEmployee extends JPanel {

  JLabel firstName, middleName, lastName, age;
  JTextField fNameInput, mNameInput, lNameInput, ageInput;

  public VAddEmployee() {
    //set the layout of this view gui
    this.setLayout(new GridLayout());
    
    //initialize label components

    firstName = new JLabel("First Name");
    middleName = new JLabel("Middle Name");
    lastName = new JLabel("Last Name");
    age = new JLabel("Age");

    //initialize textfield components to get user inputs
    // 10 is the size of the field

    fNameInput = new JTextField(10);
    mNameInput = new JTextField(10);
    lNameInput = new JTextField(10);
    ageInput = new JTextField(10);

    //initialize a panel to add the label components
    // insets is the padding between the components

    JPanel labelPanel = new JPanel();
    labelPanel.setLayout(new GridBagLayout());

    //gridbagconstraints is used to adjust the position of the components inside the grid bag layout

    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH;

    c.insets = new Insets(10, 0, 10, 10);
    c.gridx = 0;
    c.gridy = 0;
    labelPanel.add(firstName, c);

    c.gridx = 0;
    c.gridy = 1;
    labelPanel.add(middleName, c);

    c.gridx = 0;
    c.gridy = 2;
    labelPanel.add(lastName, c);

    c.gridx = 0;
    c.gridy = 3;
    labelPanel.add(age, c);

    JPanel inputPanel = new JPanel();
    inputPanel.setLayout(new GridBagLayout());

    c.gridx = 0;
    c.gridy = 0;
    inputPanel.add(fNameInput, c);

    c.gridx = 0;
    c.gridy = 1;
    inputPanel.add(mNameInput, c);

    c.gridx = 0;
    c.gridy = 2;
    inputPanel.add(lNameInput, c);

    c.gridx = 0;
    c.gridy = 3;
    inputPanel.add(ageInput, c);
    add(labelPanel);
    add(inputPanel);
  }

  //getters for the value inside the text fields
  public JTextField getFirstName() {
    return fNameInput;
  }

  public JTextField getMiddleName() {
    return mNameInput;
  }

  public JTextField getLastName() {
    return lNameInput;
  }

  public JTextField getAge() {
    return ageInput;
  }

  public void setFirstInput(String s) {
    fNameInput.setText(s);
  }

  public void setMiddleInput(String s) {
    mNameInput.setText(s);
  }

  public void setLastInput(String s) {
    lNameInput.setText(s);
  }

  public void setAgeInput(String s) {
    ageInput.setText(s);
  }
}
