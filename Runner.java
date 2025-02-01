import Customer.*;
import Employee.*;
import java.util.ArrayList;

public class Runner {

  public static void main(String[] args) {
    ArrayList<Employee> datas = new ArrayList<Employee>();

    ArrayList<Customer> dummycustomerlist = new ArrayList<Customer>();
    dummycustomerlist.add(
      new Customer("Aladdin", "Nibwa", "Doquar", "42193i12", 23)
    );
    dummycustomerlist.add(
      new Customer("Mohammad", "Alli", "Juspan", "567411", 20)
    );
    dummycustomerlist.add(
      new Customer("Daniel", "Ugat", "Tigas", "08241612", 18)
    );
    dummycustomerlist.add(
      new Customer("Maliketh", "Trix", "Trinidad", "09512512", 28)
    );
    datas.add(new Employee("name", "YEs", "sds", 2));
    new CMainView();
  }
}
