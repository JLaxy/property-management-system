package Booking;

import Customer.*;
import Property.*;

public class Booking {

  // Attributes
  private Customer customer;
  private Property property;

  // Constructor; assigns passed values
  public Booking(Customer customer, Property property) {
    this.customer = customer;
    this.property = property;
  }

  // Customer methods
  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  // Property methods
  public Property getProperty() {
    return this.property;
  }

  public void setProperty(Property property) {
    this.property = property;
  }
}
