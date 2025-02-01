package Employee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MAddEmployee {

  //initialize the arraylist
  ArrayList<Employee> datas;

  //synchronize the array list
  public MAddEmployee(ArrayList<Employee> datas) {
    //synchronize the arraylist
    this.datas = datas;
  }

  //validation check for the inputs
  public boolean add(String fname, String mname, String lname, String age) {
    //store the inputs in our variables
    String first = fname;
    String middle = mname;
    String last = lname;
    String ageNum = age;
    //create boolean flags to check if all inputs are correct
    boolean nameCheck = false;
    boolean ageFlag = false;
    //check if the names are alphabets instead of numbers
    if (
      !(first.matches("[a-zA-Z ]+")) ||
      !(middle.matches("[a-zA-Z ]+")) ||
      !(last.matches("[a-zA-Z ]+"))
    ) {
      JOptionPane.showMessageDialog(
        null,
        "Please input only letters in the name"
      );
      return false;
    } else {
      nameCheck = true;
    }
    //check if the value inside the age field is a number
    try {
      // if the parse int results in an error then it means that the value is not a number
      int checkAge = Integer.parseInt(ageNum);
      System.out.println(checkAge);
      ageFlag = true;
    } catch (NumberFormatException e) { // catch statement for the error and let the user know the correct input for the field
      JOptionPane.showMessageDialog(null, "You must enter a number in age.");
      return false;
    }
    //if both boolean flags are true then the method will return true
    if (nameCheck == true && ageFlag == true) {
      return true;
    }
    //default return value is false
    return false;
  }
}
