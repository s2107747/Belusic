
public abstract class Indicator {
//state of indicators
private boolean on;

public Indicator(){
	setOn(false);
}
//Test comment

//Toggle indicator throws Exception neccessary to make thread sleep work
public boolean toggle() throws InterruptedException {
	on=!on;
	//display indicator state
	
    	this.display(); 
   
	return on;
}

//Check state of indicator
public Boolean isOn(){
	return on;
}
//change indicator on.(not used)
public void setOn(boolean on) {
	this.on = on;
}
//display indicator state to console

public void display() throws InterruptedException {
	//displays flashing indicator to console
	if(this.isOn()){
		int i;
		//displays indicator 5 times for 500 miliseconds
		for(i=0;i<5;i++)
		{
			this.output();
			Thread.sleep(500);
			System.out.print("   \r");
			Thread.sleep(500);
		} 
	} else
	{
		System.out.print("indicator off");
		Thread.sleep(1000);
		
	}
}
//class for outputting indicator
public abstract void output();

}

