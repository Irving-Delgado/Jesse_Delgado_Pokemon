package pokemon;

public class Pokedex extends AbstractPokemon{
	Pokemon names = new Pokemon();
	public int myPokemons;


	public void listPokemon() {
		this.myPokemons = names.count;
		System.out.println("There are "+myPokemons+" Pokemon's in the Pokedex");
	}

	

}