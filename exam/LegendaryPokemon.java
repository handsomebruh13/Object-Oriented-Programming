public class LegendaryPokemon extends Pokedex {

    private String signatureMove;

    public LegendaryPokemon() {
        super("Regirock", "Female", "Normal, Flying, Poison, Fire",
                "Normal, Flying, Poison, Fire", "Fighting, Ground, Steel Water, Grass",
                210, 134, 141.10,
                "Regirock is a Rock-type Legendary Pokémon made entirely of boulders.\nIts body is held together by a mysterious force, it can repair itself by adding new rocks.",
                false);  // shiny boolean here

        this.signatureMove = "Explosion";
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Signature Move: " + signatureMove);
    }

    public static void main(String[] args) {
        LegendaryPokemon r = new LegendaryPokemon();
        r.displayinfo();
    }
}
