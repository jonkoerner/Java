
public class Dragon extends Mammal {

	public Dragon() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Raaaahhhhhhh I am the dragon, flying");
		this.setEnergyLevel(this.getEnergyLevel()-50);
		this.displayenergy();
	}
	
	public void eatHumans() {
		System.out.println("The Dragon just ate a villager");
		this.setEnergyLevel(this.getEnergyLevel()+25);
		this.displayenergy();
	}
	public void attackTown() {
		System.out.println("The Dragon is fighting the Town,Fizzzzzzzzzzzzz");
		this.setEnergyLevel(this.getEnergyLevel()-100);
		this.displayenergy();
	}
}
