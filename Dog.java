
public class Dog implements Speaker {
	String name;
	String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
		
	}
	@Override
	public void speak() {
		System.out.println(name + " says arf arf.");
	}
}
