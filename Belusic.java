

import java.util.Scanner;

public class Belusic {
	//displays console menu
	public static void displayMenu(){
		System.out.println("*****Belusic MotorCycle Electrical Control System*****");
		System.out.println("Created by The Noble bricks Team");
		System.out.println("b) Brake (Toggle Brake lights)");
		System.out.println("l) Indicate Left");
		System.out.println("r) Indicate Right");
		System.out.println("t) Engine Temperature");
		System.out.println("h) Headlights (Toggle high/low beams)");
		System.out.println("f) Fuel level");
		System.out.println("q) Exit program");
		System.out.println("Please enter selection :");
		
	}
	//displays the states of the various components of the system
	//Brake,Temperature, headLight and Fuel parameters need to be added when created
	public static void displayStates(Indicator Li,Indicator Ri){
		System.out.println("Brake light: ");
		/*if(brake.isOn()){System.out.println("on");} else {System.out.println("off");}
		System.out.print("Right indicator: ");*/
		

		
		System.out.print("Left indicator: ");
		if(Li.isOn()){System.out.println("Flashing");} else {System.out.println("off");}
		System.out.print("Right indicator: ");
		if(Ri.isOn()){System.out.println("Flashing");} else {System.out.println("off");}
		
		System.out.println("Head lights: ");
		/*if(HighBeam.isOn()){System.out.println("High Beam");} else {System.out.println("Low Beam");}
		*/
		
		System.out.println("Temperature level: ");
		//System.out.println(temp.getlevel());
		/*if(temp.isHigh()){System.out.println("warning light on");} else {System.out.println("warning light off");}
		
		*etc.
		*/
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String input;
		//initialise indicators both off to start with
		Indicator indRight=new RIndicator();
		Indicator indLeft=new LIndicator();
		/* declarations for Temperature, Headlight(Hi/low beams), BrakeLights, Fuel level/warning go here 
		 * For example:
		 * Brakes brake=new Brakes();
		 * TempGuage temp=new Temperature();
		 * Light highBeam= new Light();
		 * Fuel fuel= new Fuel();
		 */
		//initialise scanner to accept input
		Scanner sc = new Scanner(System.in);
		//loop to read input from scanner and display system state
		do
		{
			displayMenu();
			
		     input=sc.next();
		     input=input.toLowerCase();
		     
			
			switch(input)
			{
				//
				case "b": /*replace this with code to toggle brakes*/System.out.print("Braking ");
				break;
				//indicate left. Set right indicator off. toggle left indicator(also displays flashing indicator)
				case "l": indRight.setOn(false);indLeft.toggle();
				break;
				//indicate Right. Set right indicator off. toggle Right indicator(also displays flashing indicator)
				case "r": indLeft.setOn(false);indRight.toggle();
				break;
				//code 
				case "t":/*replace this with code to  input and display temp*/System.out.print("Checking Temperature") ;
				break;
				case "h": /*replace this with code to toggle headlights*/System.out.print("Toggling headlights");
				break;
				case "f": /*replace this with code to input and display fuel level*/System.out.print("Checking fuel level ");
				break;
				case "q": System.out.print("Quitting now ");
				break;
				default: System.out.println("invalid input");
				break;
			}
		   //display current system state
			displayStates(indLeft,indRight);
			
		} while(!input.equals("q"));
		sc.close();
	}

}

