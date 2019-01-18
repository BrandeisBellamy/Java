
public class RaceCar extends Automobile {
	private String name;
	private int year;
	private String color;

	//Constructor
	public RaceCar(String brand, String city, String state, String name, int year, String color) {
		super(brand, city, state);
		this.name = name;
		this.year = year;
		this.color = color;
	}

	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + " RaceCar [name=" + name + ", year=" + year + ", color=" + color + "]";
	}



}
