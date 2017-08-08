
public class LIndicator extends Indicator {

	public LIndicator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() throws InterruptedException {
		String colorInd;
		int i;
		for(i=0;i<10;i++)
		{
		colorInd="\033["+i*3+"m<-\033[0m\r";
		//System.out.println(color);
		System.out.print(colorInd);
		Thread.sleep(50);
		}
		System.out.print("             \r");
		Thread.sleep(500);
		
	}

}
