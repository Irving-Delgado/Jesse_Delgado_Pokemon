package pokemon;

public class PokemonTest{
    public static void main(String[] args){
      Pokedex pokedex = new Pokedex();
      Pokemon attack = new Pokemon();
      Pokemon pidgy = pokedex.createPokemon("pidgy", 50, "flying");
      Pokemon pikachu = pokedex.createPokemon("pikachu", 60, "electricity");
      
      
      pokedex.pokemonInfo(pidgy);
      pokedex.pokemonInfo(pikachu);
      pokedex.listPokemon();
      
      attack.attackPokemon(pidgy);
      attack.attackPokemon(pikachu);
      
      pokedex.pokemonInfo(pidgy);
      pokedex.pokemonInfo(pikachu);
   
    }
}