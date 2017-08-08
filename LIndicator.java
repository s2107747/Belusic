
public class LIndicator extends Indicator {

	public LIndicator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() throws InterruptedException {
		String color;
		int i;
		for(i=0;i<10;i++)
		{
		color="\01["+i*3+"m";
		System.out.print(color+"<-" + "\033[0m\r");
		Thread.sleep(50);
		}
		System.out.print("             \r");
		Thread.sleep(500);
		
	}

}
