public class ShinyTest {
    public static void main(String[] args) {
        // Create instances of each subclass
        NormalPokemon charmander = new NormalPokemon();
        LegendaryPokemon regirock = new LegendaryPokemon();
        ShinyPokemon shinyPika = new ShinyPokemon();

        // Check shiny status using isShiny()
        System.out.println("Charmander Shiny: " + charmander.isShiny());  // Expected: false
        System.out.println("Regirock Shiny: " + regirock.isShiny());      // Expected: false
        System.out.println("Pikachu Shiny: " + shinyPika.isShiny()); // Expected: true

        // Display info (shiny will also appear in base displayinfo())
        System.out.println("\n--- Display Info Tests ---");
        charmander.displayinfo();
        regirock.displayinfo();
        shinyPika.displayinfo();
    }
}