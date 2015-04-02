package sports;


public class Tennis extends Sport{
 public String device;

public Tennis(String name, int pl, String dev){
 super(name, pl);
 this.device = dev;
 }
 public void displayMessage(){
 
 
 System.out.println("Tennis is played with a " + device);
 System.out.println("Number of players who play this sport " + noOfPlayers);
 System.out.println("--------------------------------------");
 }
 }
