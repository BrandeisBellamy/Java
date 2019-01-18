
public class Animal {
	
	private int weight;
	private int height;
	
	//constructor
	public Animal(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	//getter & setter
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//to string
	@Override
	public String toString() {
		return "Animal [weight= " + weight + " lbs, height= " + height + " cm]";
	}

}
