public class PokeInfo {
    public static void main(String[] args) {

        NormalPokemon charmander = new NormalPokemon();
        LegendaryPokemon r = new LegendaryPokemon();
        ShinyPokemon shiny = new ShinyPokemon();
        ShinyPokemon mimikyu = new ShinyPokemon();

        System.out.println("Pokedex Information #1: ");
        System.out.println(" ");
charmander.displayinfo();


System.out.println(" ");
        System.out.println("Pokedex Information #2: ");
        System.out.println(" ");
r.displayinfo();

System.out.println(" ");
System.out.println("Pokedex Information #3: ");
shiny.displayinfo();

        System.out.println(" ");
        System.out.println("Pokedex Information #4: ");
        mimikyu.displayinfo();
    }
}
