
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player("Mr. Bartucz");
    
    Player player2 = new Player("Mr. Eggs");
    
    System.out.println("Player1 name is: " + player1.getName());
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
    System.out.println("\nPlayer2 name is: " + player2.getName());
    System.out.println(player2.getName() + "'s health is: " + player2.getHealth());
  }  
  
}