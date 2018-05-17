
public class HumanTest {

	public static void main(String[] args) {
		Human bart = new Human("Bart");
		Human ralph = new Human("Ralph");		
		bart.attack(ralph);
		bart.displayAll();
		ralph.displayAll();
	}
}
