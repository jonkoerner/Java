
public class MammalTest {

	public static void main(String[] args) {
		Mammal h= new Mammal();
		h.displayenergy();
		Gorilla g= new Gorilla();
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		g.displayenergy();
		g.eatBananas();
		g.eatBananas();
		g.displayenergy();
		g.climb();
		g.displayenergy();
		
		//Create a DragonTest class to instantiate a dragon and have it attack three towns, eat two humans, and fly twice.
		Dragon d= new Dragon();
		d.displayenergy();
		d.attackTown();
		d.attackTown();
		d.attackTown();
		d.eatHumans();
		d.eatHumans();
		d.fly();
		d.fly();
	}
}
