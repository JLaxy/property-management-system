import Booking.*;
import Customer.*;
import Property.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Cshowbooking {

  ArrayList<Booking> Booking;
  ArrayList<Booking> dummyBooking;
  Vshowbooking mainFrame;

  Cshowbooking(ArrayList<Booking> Booking) {
    Customer dumcust = new Customer(
      "Customer ",
      "1",
      "A.",
      "+639123456789",
      20
    );
    Property dumpro = new Property(
      "Taytay",
      "Rizal",
      "1",
      "14",
      "",
      "Bungalow"
    );
    dummyBooking = new ArrayList<>();
    dummyBooking.add(new Booking(dumcust, dumpro));
    dummyBooking.add(new Booking(dumcust, dumpro));
    dummyBooking.add(new Booking(dumcust, dumpro));
    dummyBooking.add(new Booking(dumcust, dumpro));
    dummyBooking.add(new Booking(dumcust, dumpro));
    dummyBooking.add(new Booking(dumcust, dumpro));

    this.Booking = Booking;
    mainFrame = new Vshowbooking(dummyBooking);

    //adding button listener
    mainFrame.setReturnListener(new returnListener());
  }

  public class returnListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      mainFrame.dispose();
      new CMainView();
    }
  }
}
