
public class Play implements Runnable {

	Speaker pet;
	public Play(Speaker pet) {
		this.pet = pet;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread().getId() + ": ");
			pet.speak();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
