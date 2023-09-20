
public class Cat implements Speaker {
	String name;
	String favoriteToy;
	int miceCaught;
	
	public Cat(String name, String favoriteToy) {
		this.name = name;
		this.favoriteToy = favoriteToy;
		this.miceCaught = 0;
	}
	
	@Override
	public void speak() {
		System.out.println(name + " says, Meow and such. Bring me my " + favoriteToy );

	}

}
