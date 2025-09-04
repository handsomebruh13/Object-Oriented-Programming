public class NormalPokemon extends Pokedex {
    private boolean shiny = false;

    public NormalPokemon() {
        super("Charmander", "Male", "Fire", "Grass, Bug, Ice, Steel",
                "Water, Rock, Ground", 185, 95, 185.5,
                "Charmander is a small orange lizard Pokémon with a flame on its tail that shows its health and mood.\n" +
                        "It’s a Fire-type and the first stage before evolving into Charmeleon.",
                false);  // Add shiny boolean here
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
    }

    public static void main(String[] args) {
        NormalPokemon charmander = new NormalPokemon();
        charmander.displayinfo();
    }
}