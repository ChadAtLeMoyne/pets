
public class Pets {

	public static void main(String[] args) {
		Cat rusty = new Cat("Rusty", "The souls of the innocent");
		Dog bartlett = new Dog("Bartlett", "Mixed");
		Dog sara = new Dog("Sara", "Princess");
		
		Thread t1 = new Thread(new Play(rusty));
		Thread t2 = new Thread(new Play(bartlett));
		Thread t3 = new Thread(new Play(sara));
		
		t1.start();
		t2.start();
		t3.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("This is the main thread");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected static void tellToSpeak(Speaker pet) {
		pet.speak();
	}

}
