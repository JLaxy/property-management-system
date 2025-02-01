package Property;

public class Property {

  // Property attributes
  private String city;
  private String province;
  private String lot;
  private String block;
  private String area;
  private String houseType;

  // Constructor; assigns passed values
  public Property(
    String city,
    String province,
    String lot,
    String block,
    String area,
    String houseType
  ) {
    this.city = city;
    this.province = province;
    this.lot = lot;
    this.block = block;
    this.area = area;
    this.houseType = houseType;
  }

  // City methods
  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  // Province methods
  public String getProvince() {
    return this.province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  // Lot methods
  public String getLot() {
    return this.lot;
  }

  public void setLot(String lot) {
    this.lot = lot;
  }

  // Block methods
  public String getBlock() {
    return this.block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  // Area methods
  public String getArea() {
    return this.area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  // House Type methods
  public String getHouseType() {
    return this.houseType;
  }

  public void setHouseType(String houseType) {
    this.houseType = houseType;
  }

  // default method when trying to print the property object
  public String toString() {
    return lot + "" + block + "" + area + "" + city + "" + houseType;
  }
}
