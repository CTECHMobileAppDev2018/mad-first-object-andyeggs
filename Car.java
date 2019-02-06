
// This is an example class for a player in a game
public class Car {
  
  // we don't want other objects changing these directly, so they are private
  private String color;
  private String make;
  private String model;
  private int year;
  private int gallonsGas;
  private int gasCapacity;
  private int topSpeed;
  
  // this is called a "constructor". It is automatically called when someone creates a new Player object
  Car(String carInfo, int carGasCapacity, int carTopSpeed) { //Ex. "Red 2001 Dodge Dakota", 18, 140
    try {
      String[] info = carInfo.split(" "); //splits the info into sections based on whitespace
      this.color = info[0];
      this.year = Integer.parseInt(info[1]);
      this.make = info[2];
      this.model = info[3];
    } catch(ArrayIndexOutOfBoundsException e) { //catches an error with the split
      System.out.println("Car Constructor Error");
      return;
    }
    this.gallonsGas = 0;
    this.gasCapacity = carGasCapacity;
    this.topSpeed = carTopSpeed;
  }
 
  public void setColor(String carColor) { color = carColor; }
  public void setGas(int setGallons) {
    if (setGallons < 0 || setGallons > gasCapacity) {
      System.out.println("setGas() Error");
      return;
    }
    gallonsGas = setGallons;
  }
  
  public void addGas(int addGallons) {
    if (addGallons < 0 || addGallons > (gallonsGas + addGallons)) {
      System.out.println("addGas() Error");
      return;
    }
    gallonsGas = (gallonsGas + addGallons);
  }
  
  public String getColor() { return color; }
  public String getMake() { return make; }
  public String getModel() { return model; }
  public int getYear() { return year; }
  public int getGallonsGas() { return gallonsGas; }
  public int getGasCapacity() { return gasCapacity; }
  public int getTopSpeed() { return topSpeed; }
  public String getCarInfo() { 
    String carInfo = color + " " + year + " " + make + " " + model;
    return carInfo;
  }
}