import java.util.Scanner;

public class fuelIndicator{

	private int level; 
	private boolean status;
	private int option;
	
	Scanner sInput = new Scanner(System.in);
	
	public fuelIndicator() {
		this.level = 100;
	}
	
	/*
	 * This function takes an integer as a parameter and then sets the level of the class to it.
	 * USAGE - setLevel(10) - Will set the level to 10.
	 */
	public void setLevel(int i) {
		level = i;
	}
	
	/*
	 * This function displays the fuel indicator menu
	 * It includes all the functions avaliable
	 * USAGE - menu() - Displays menu.
	 */
	public void menu() {
		System.out.println("");	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Fuel Indicator Menu:");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1) Turn Fuel Indicator On/Off");
		System.out.println("2) Set the Fuel Level");
		System.out.println("3) Check the Fuel Level");
		System.out.println("4) Check the Indicator Status");
		System.out.println("5) Return to main menu");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Please select your option: ");
	}
	
	public void showMenu() {
		do {
				menu();
		option = sInput.nextInt();
		System.out.println("");
		doOption(option);
		} while (option != 5);
	}
	
	public void doOption(int i) {
		int leveli;
		switch(i) {
		case 1: // Turn Fuel Indicator On/Off
			toggle();
			break;
		case 2:
			System.out.print("Enter the level you want to change it too: ");
			leveli = sInput.nextInt();
			setLevel(leveli);
			break;
		case 3:
			display();
			break;
		case 4:
			System.out.println("This feature is not working yet");
			break;
		case 5:
			default:
				System.out.println("Invalid option, Enter your option again: ");
		}
	}
	
	/*
	 * This function toggles the state of the Fuel Indicator
	 * It reads the current boolean value of status and then determines whether to
	 * change it to True or False.
	 * USAGE - toggle() - Changes state to opposite of current
	 */
	public void toggle() {
		if(status) { 
			status = false;
			System.out.println("You have turned the Fuel Indicator off.");
		} else {
			status = true;
			System.out.println("You have turned the Fuel Indicator on.");
		}
	}
	
	/*
	 * This function displays the Fuel level to console.
	 * USAGE - display() - This displays the level.
	 */
	public void display() {
		
		if(level >= 0 && level <= 100) {
			System.out.println("The fuel level is: " + level + "%.");
		} else {
			System.out.println("Out of Fuel!");
		}
	}
	
}
