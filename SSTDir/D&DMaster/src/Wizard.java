
public class Wizard extends Human {
	public Wizard (String name) {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	public void heal(Human human) {
		human.setHealth(human.getHealth()+this.getIntelligence());
		System.out.println("the Wizard has just healed" + human);
	}
	public void fireball(Human human) {	
		System.out.println("the Wizard casted a fireball on" + human);
		human.setHealth(human.getHealth()-3);
	}
	
	}
	
