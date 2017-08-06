import java.util.Scanner;

public class engineTemp {
	private int choice;
	private boolean tempHigh;
	public engineTemp() {
		tempHigh=false;
	}
	
	public boolean isHigh(){return tempHigh;}
    public void setTemp(Scanner in){
    
            do{ 
                    //Simulating Temperature input
                    System.out.println("Simulating temperature input");
                    System.out.println("Enter temperature range: [1] to [10]");
                    System.out.println("[0] Exit");
                    // Display output
                    choice = in.nextInt();
                    if (choice >=1  && choice <=7){
                            System.out.println("Temperature is \033[32mnormal" + "\033[0m");
                    		tempHigh=false;}
                    else if (choice >=8 && choice <=10){
                            System.out.println("Temperature is \033[31mhot!" + "\033[0m");
                    tempHigh=true;}
            } while (choice !=0);
            
    }
}
