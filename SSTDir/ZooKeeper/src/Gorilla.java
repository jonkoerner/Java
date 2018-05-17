public class Gorilla extends Mammal {

	public void throwSomething(){
		System.out.println("The gorilla is mad and just throw an apple at you. I gorillas energy level is at"); 
		this.setEnergyLevel(this.getEnergyLevel()-5);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla just ate a banana, he is felling very  alive.");
        this.setEnergyLevel(this.getEnergyLevel()+10);
	}

	public void climb() {
		System.out.println("The gorilla is climbing a wall and looks worn out.");
        this.setEnergyLevel(this.getEnergyLevel()-10);
	}
}
