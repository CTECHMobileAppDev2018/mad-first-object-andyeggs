
// This is an example class for a player in a game
public class Car {
  
  // we don't want other objects changing these directly, so they are private
  private String color;
  private String make;
  private String model;
  private int year;
  
  // this is called a "constructor". It is automatically called when someone creates a new Player object
  Car(String carInfo) { //Ex. Red Dodge Dakota 2001
    try {
      String[] info = carInfo.split(" "); //splits the info into sections based on whitespace\
      this.color = info[0];
      this.make = info[1];
      this.model = info[2];
      this.year = Integer.parseInt(info[3]);
    } catch(ArrayIndexOutOfBoundsException e) {
      return;
    }
  }
 
  /* STOPPED AT MAKING AND SETTING METHODS
  public void setName(String playerName) { 
    
  }
  
  // this just gets the name 
  public String getName() {
    return this.name;
  }
  
  // here is where you should insert your setHealth and getHealth methods
  // what are some conditions that need to be checked?
  
  public void setHealth(int playerHealth) { 
    if (playerHealth < 0) {
      this.health = 0;
      return;
    }
    
    this.health = playerHealth;
  }
  
  public int getHealth() {
    return this.health;
  }*/
}