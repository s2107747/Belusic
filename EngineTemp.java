// Team: NobleBrick
// Name: Edwin Chow
// Student ID: s3590079
// Course: CPT111
// Date: SP2 2017
// Filename: EngineTemp.java
// Description: For Belusic project - MVP4 - Temperature and Warnings

import java.util.Scanner;
// i've removed abstract from class. not neccessary
public class EngineTemp {
	private int choice;
	//i've added this variable do the state can be passed back to main class
	private boolean tempHigh;
	//initialise engine temp as low
	public EngineTemp() {
		tempHigh=false;
	}
	//get state of engine temp
	public boolean isHigh(){return tempHigh;}
	//Dan's comment:
	//code below is from edwins engine temp class. I've made it a method of the class 
	//engineTemp.setTemp(Scanner in)
	//neccessary to pass Scanner as parameter from main. otherwise it produced error on return to main
	//not sure why..
	
	public void setTemp(Scanner in){
    	//this code provided by edwin has not been changed, exept for removal of scanner
            do{ 
                    //Simulating Temperature input
                    System.out.println("Simulating temperature input");
                    System.out.println("Enter temperature in degree Celsius range: [1] to [100]");
		    System.out.println("[1-20]-COLD");
		    System.out.println("[21-80]-NORMAL");
		    System.out.println("[81-100]-HOT");
                    System.out.println("[0] Exit");
                    // Display output
                    choice = in.nextInt();
		    System.out.println("Temperature checking...");
                    if (choice >=1 && choice <=20){
                            System.out.println("Temperature is \033[34mCOLD!" + "\033[0m");
                    		tempHigh=false;}
		    else if (choice >=21 && choice <=80){
			    System.out.println("Temperature is \033[32mNORMAL!" + "\033[0m");
			     	tempHigh=false;}
                    else if (choice >=81 && choice <=100){
                            System.out.println("Temperature is \033[31mHOT!" + "\033[0m");
                    		tempHigh=true;}
		    //dummy line
		    System.out.println("");
            } while (choice !=0);
    }
}
