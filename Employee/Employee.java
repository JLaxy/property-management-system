package Employee;
public class Employee {

  private String fName;
  private String mName;
  private String lName;
  private int age;

  //default constructor for customer
  public Employee() {}

  public Employee(String fname, String mname, String lname, int age) {
    fName = fname;
    mName = mname;
    lName = lname;
    this.age = age;
  }

  //getters for employee data
  public String getFirstName() {
    return fName;
  }

  public String getMiddleName() {
    return mName;
  }

  public String getLastName() {
    return lName;
  }

  public int getAge() {
    return age;
  }

  //setter methods for employee object
  public void setFisrtName(String txt) {
    fName = txt;
  }

  public void setMiddleName(String txt) {
    mName = txt;
  }

  public void setLastName(String txt) {
    lName = txt;
  }

  public void setAge(int num) {
    age = num;
  }
}
