
public class Cat extends Animal {
	
	private String name;
	private int lives = 9;
	
	//constructor
	public Cat(int weight, int height, String name, int lives) {
		super(weight, height);
		this.name = name;
		this.lives = lives;
	}

	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}

	//to string
	@Override
	public String toString() {
		return "Cat [name= " + name + ", lives= " + lives + "]";
	}
	
}
