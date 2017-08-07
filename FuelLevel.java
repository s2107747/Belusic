import java.util.Scanner;

public class FuelLevel {
	private boolean levelLow;
	public FuelLevel() {
		levelLow=false;
	}
	private int choice;
	//i've added this variable do the state can be passed back to main class

	public boolean isLow(){return levelLow;}
	
	
	public void setFuel(Scanner in){
    //this code provided by edwin has not been changed, exept for removal of scanner
            do{ 
                    //Simulating Temperature input
                    System.out.println("Simulating fuel sensor input");
                    System.out.println("Enter Fuel level: [1] to [20]");
                    System.out.println("[0] Exit");
                    // Display output
                    choice = in.nextInt();
                    if (choice >=5  && choice <=20){
                            System.out.println("Fuel Level is \033[32mnormal" + "\033[0m");
                    		levelLow=false;}
                    else if (choice <=5 && choice <=20){
                            System.out.println("Fuel level is \033[31mLow!" + "\033[0m");
                    levelLow=true;}
            } while (choice !=0);
            
    }

}
