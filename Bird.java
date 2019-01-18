
public class Bird extends Animal {
	
	private int wingSpan;
	private boolean canFly;
	
	//constructor
	public Bird(int weight, int height, int wingSpan, boolean canFly) {
		super(weight, height);
		this.wingSpan = wingSpan;
		this.canFly = canFly;
	}

	//getter and setter
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	//to string
	@Override
	public String toString() {
		return "Bird [wingSpan = " + wingSpan + " cm, canFly = " + canFly + "]";
	}
	
	

}
