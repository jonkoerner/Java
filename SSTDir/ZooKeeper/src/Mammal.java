
public class Mammal {
	private int energyLevel = 100;

	public Mammal() {}
	
	public int getEnergyLevel() {
		return this.energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public String displayenergy() {
		System.out.println("This mammals current energy level is "+ energyLevel );
		return ("energyLevel");
	}
}
