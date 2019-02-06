public class Player {
  
  private String name;
  private int health;
  //NEXT, CREATE AN ARRAY OF CARS FOR PLAYERS!!!
  Player(String playerName) {
    this.health = 100;
    this.name = playerName;
  }

  public void setName(String playerName) { 
    if (playerName.length() < 1) {// verifies the length of playerName is valid
      System.out.println("Error: setName");
      return;
    }
    this.name = playerName;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setHealth(int playerHealth) { 
    if (playerHealth < 0) {
      this.health = 0;
      return;
    }
    
    this.health = playerHealth;
  }
  
  public int getHealth() {
    return this.health;
  }
}