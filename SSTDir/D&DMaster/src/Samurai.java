
public class Samurai extends Human {
	private static int count;
	public Samurai(String name) {
		setHealth(200);
		count++;
	}
	public void deathBlow(Human human) {
		this.setHealth((this.getHealth())/2);
		human.setHealth(0);
	}
	public void meditate() {
		this.setHealth(200);
	}
	public static int howMany() {
		return count;
	}
}
