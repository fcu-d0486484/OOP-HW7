package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	private int cp;
	private final String name;
	private final PokemonType Type;
	public abstract void attack();
	public Pokemon(String name, PokemonType type,int cp) {
		super();
		this.cp = cp;
		this.name = name;
		Type = type;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		String name=this.name;
		return name;
	}
	public PokemonType getType() {
		PokemonType Type=this.Type;
		return Type;
	}
	
}
