
public class LIndicator extends Indicator {

	public LIndicator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() throws InterruptedException {
		//displays left arrow indicator for 500 miliseconds
		System.out.print("<-\r");
		Thread.sleep(500);
		//hides indicator for 500 miliseconds
		System.out.print("   \r");
		Thread.sleep(500);
		
	}

}
