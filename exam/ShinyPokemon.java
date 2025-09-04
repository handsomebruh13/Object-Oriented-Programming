import java.sql.SQLOutput;

public class ShinyPokemon extends Pokedex {

    // Default constructor sets shiny = true by calling super constructor
    public ShinyPokemon() {
        super("Pikachu", "M", "Electric", "Water, Flying", "Ground", 120,
                70, 60.2, "Pikachu is a small, yellow, mouse-like Pokémon with long ears tipped in black and a lightning\n bolt–shaped tail." +
                        " It stores electricity in its cheeks,\n which spark when it’s excited or about to use an Electric-type move.", true);
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        // Shiny info already printed in base displayinfo()
    }

    public static void main(String[] args) {
        ShinyPokemon shiny = new ShinyPokemon();
        shiny.displayinfo();
    }
}
