
public class Mammal{
	private boolean sleeping = false;
	public void regulateTemperature() {
		System.out.println("My tmeperature is just right now.");
	}
	public void startSleeping() {
		sleeping = true;
		System.out.println();
	}
	public boolean isSleeping() {
		return sleeping;
	}
}
