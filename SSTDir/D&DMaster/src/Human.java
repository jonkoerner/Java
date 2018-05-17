
public class Human {
	private int strength= 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	private String name;
	
	public Human() {}
	
	public Human(String name) {
		this.name = name;
	}

	public void displayAll(){
		System.out.println( getName() +" has a");
		System.out.println("Strenght of " +getStrength());
		System.out.println("Intelligence of "  +getIntelligence());
		System.out.println("Stealth of " + getStealth());
		System.out.println(" and a health of " +getHealth());
	}
	
	public void attack(Human human) {
		human.setHealth(human.getHealth()-strength);
		System.out.println(name + " dealt " + strength +" damage to " +human.getName());
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
