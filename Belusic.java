

import java.util.Scanner;

public class Belusic {
	//displays console menu. 
	public static void displayMenu(){
		System.out.println("*****Belusic Control System Menu*****");
		System.out.println("b) Brake (Toggle Brake lights)");
		System.out.println("l) Indicate Left (Toggle left indicator on/off)");
		System.out.println("r) Indicate Right (Toggle Right indicator on/off)");
		System.out.println("t) Engine Temperature");
		System.out.println("h) Headlights (Toggle high/low beams)");
		System.out.println("f) Fuel level");
		System.out.println("q) Exit program");
		System.out.println("Please enter selection :");
		
	}
	//displays the states of the various components of the system
	//Brake,Temperature, headLight and Fuel parameters need to be added when created
	public static void displayStates
	(Indicator Li,Indicator Ri,EngineTemp temp, Light highBeam,fuelIndicator fuel, String brklight)
	{
		System.out.println("*****Belusic MotorCycle Electrical Control System*****");
		System.out.println("Created by The Noble bricks Team");
		
		System.out.println("*****System State:*****");
		
		System.out.print("Brake light: ");
		if(brklight.equals("ON")){System.out.println("on");} else {System.out.println("off");}
		
		System.out.print("Left indicator: ");
		if(Li.isOn()){System.out.println("Flashing");} else {System.out.println("off");}
		
		System.out.print("Right indicator: ");
		if(Ri.isOn()){System.out.println("Flashing");} else {System.out.println("off");}
		
		System.out.print("Head lights: ");
		if(highBeam.isHigh()){System.out.println("High Beam");} else {System.out.println("Low Beam");}
		
		
		System.out.print("Temperature level: ");
		if(temp.isHigh()){System.out.println("warning light on");} else {System.out.println("warning light off");}
		
		//System.out.print("Fuellevel: ");
		//if(fuel.){System.out.println("warning light on");} else {System.out.println("warning light off");}
		fuel.display();
		System.out.println("");
		/*
		*etc.
		*/

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		// declarations for Temperature, Headlight(Hi/low beams), BrakeLights, Fuel level/warning go here 
		//initialise indicators both off to start with
		
		Indicator indRight=new RIndicator();
		Indicator indLeft=new LIndicator();
		//intitialise engine temp object
		EngineTemp temp=new EngineTemp();
		//initialise lights
		Light highBeam=new Light();
		//initialics fuel
		fuelIndicator fuelCheck=new fuelIndicator();
		//initialise brakelight variable
		String brklight="off";
		//initialise scanner to accept input
		String input;
		
		Scanner sc = new Scanner(System.in);
		
		

	
		
		//loop to read input from scanner and display system state
		do
		{
			 //display current system state
			displayStates(indLeft,indRight,temp,highBeam,fuelCheck,brklight);
			displayMenu();
			
			input=sc.next();
			input=input.toLowerCase();	 
			 
		     
		     
		     
			
			switch(input)
			{
				//
				case "b":    
					
					// **************Thongs code below******************
                    int b1 = 0;
                    int b2 = 5;
                    
                   // Scanner scan = new Scanner(System.in);
                    System.out.print("Enter  5 = ON  and  Enter 0 = OFF   GPIO = :");
                    int x = sc.nextInt();
                    int xx = x;
                    if (xx >= b2) {
                        brklight = "ON";
                       // System.out.println(" Now it is Braking and The brake lights is ON ");
                        System.out.println("At this Moment Brake lights is: "+brklight);
                    }
                    else if (xx == b1) {
                        brklight = "OFF";
                       // System.out.println(" Now Bracking System is free and The brake lights is OFF ");
                        System.out.println("At this Moment Brake lights is : "+brklight);
                    } else {
                        System.out.println("Please check Something may be wrong");
                    }

                    break;
				//********* end of Thongs Code*****//
                    
                    
				//indicate left. Set right indicator off. 
				case "l": 
				
				if(indRight.isOn()){indRight.setOn(false);}
				indLeft.toggle();
				break;
				//indicate Right. Set left indicator off. 
				case "r":
				if(indLeft.isOn()){indLeft.setOn(false);}
				indRight.toggle();
				
				break;
				//code to set engine temp when t is selected
				//neccessary to pass scanner as a parameter, as opening a new one in enginetemp class caused problems for some reason
				case "t":temp.setTemp(sc);
				break;
				case "h": highBeam.setBeam(sc);
				break;
				case "f": fuelCheck.showMenu();
				break;
				case "q": System.out.print("Quitting now ");
				break;
				default: System.out.println("invalid input");
				break;
			}
			
		  
			
		} while(!input.equals("q"));
		sc.close();
	}

}

