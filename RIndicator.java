
public class RIndicator extends Indicator {

	public RIndicator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void output(){
		//out put flashing indicator to console.
		//this method could be modified in future to output to gpio
			System.out.print("->\r");
			

	}
}
