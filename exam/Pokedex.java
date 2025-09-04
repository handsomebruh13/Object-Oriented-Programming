public class Pokedex {
    private String name;
    private String gender;
    private String type;
    private String strength;
    private String weakness;
    private String description;
    private int HP;
    private int MP;
    private double weight;
    private boolean shiny;  // Moved shiny here for all Pokémon

    // Constructor with shiny parameter
    public Pokedex(String name, String gender, String type, String strength, String weakness,
                   int HP, int MP, double weight, String description, boolean shiny) {
        this.name = name;
        this.gender = gender;
        this.type = type;
        this.strength = strength;
        this.weakness = weakness;
        setHP(HP);           // Validate HP
        setMP(MP);           // Validate MP
        setWeight(weight);   // Validate weight
        this.description = description;
        this.shiny = shiny;
    }

    // Getters and setters with validation

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        if (HP < 0) {
            throw new IllegalArgumentException("HP  cannot be negative.");
        }
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        if (MP < 0) {
            throw new IllegalArgumentException("MP cannot be negative.");
        }
        this.MP = MP;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive.");
        }
        this.weight = weight;
    }

    public boolean isShiny() {
        return shiny;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    // Other getters and setters (name, gender, type, etc.) can be added here as needed

    public void displayinfo() {
        System.out.println("Pokedex");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Type: " + type);
        System.out.println("Strength: " + strength);
        System.out.println("Weakness: " + weakness);
        System.out.println("HP: " + HP);
        System.out.println("MP: " + MP);
        System.out.println("Weight: " + weight);
        System.out.println("Description: " + description);
        System.out.println("Shiny: " + (shiny ? "Yes" : "No"));
    }
}
