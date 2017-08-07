
public abstract class fuelIndicator{

	private int level; 
	private boolean status;
	
	public fuelIndicator() {
		this.level = 100;
	}
	
	public void fuelUp() {
		level = 100;
	}
	
	public void toggle() {
		if(status) { 
			status = false;
			System.out.println("You have turned the Fuel Indicator off.");
		} 
		if(!status)  {
			status = true;
			System.out.println("You have turned the Fuel Indicator on.");
		}
	}
	
	public void display() throws InterruptedException {
		level -= 10;
		
		if(level >= 0 && level <= 100) {
			System.out.println("The fuel level is: " + level + "%.");
		} else {
			System.out.println("Out of Fuel!");
		}
	}
	
}
