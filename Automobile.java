
public class Automobile {

	private String brand;
	private String city;
	private String state;

	//constructor
	public Automobile(String brand, String city, String state) {
		super();
		this.brand = brand;
		this.city = city;
		this.state = state;
	}

	//getter & setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	//toString
	@Override
	public String toString() {
		return "Automobile [brand=" + brand + ", city=" + city + ", state=" + state + "]";
	}












}
