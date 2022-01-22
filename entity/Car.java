pakage entity;

public class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String printInfo() {
		return "Car: " + name; 
	}
}
