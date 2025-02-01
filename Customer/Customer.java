package Customer;

import Employee.*;

public class Customer extends Employee {

  // attributes
  private String fName;
  private String mName;
  private String lName;
  private String number;
  private int age;

  // Constructor
  public Customer(
    String fName,
    String mName,
    String lName,
    String number,
    int age
  ) {
    this.fName = fName;
    this.mName = mName;
    this.lName = lName;
    this.number = number;
    this.age = age;
  }

  // fName methods
  public String getfName() {
    return this.fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  // mName methods
  public String getmName() {
    return this.mName;
  }

  public void setmName(String mName) {
    this.mName = mName;
  }

  // lName methods
  public String getlName() {
    return this.lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  // number methods
  public String getNumber() {
    return this.number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  // age methods
  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return this.fName + " " + this.mName + " " + this.lName;
  }
}
