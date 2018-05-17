
public class Ninja extends Human {

	public Ninja(String name){
		this.setStealth(10);
		setName(name);
	}
	public void steal(Human human) {
		human.setHealth(human.getHealth()-this.getStealth());
	}
	
	public void run() {
		this.setHealth(this.getHealth()-10);
	}
}
