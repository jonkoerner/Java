
public class Pokemon{
	private String name;
	private int health;
	private String type;
	static int countPokemon;
	
	public Pokemon() {countPokemon++;}
	
	public Pokemon(String name, int health, String type){
		this();
		this.name = name;
		this.health = health;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}



