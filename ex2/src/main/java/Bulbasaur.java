public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        this.id = 1;   // Initial value for Bulbasaur
        this.level = 1; // Initial level
    }

    public Bulbasaur(int id, int level) {
        this.id = id;
        this.level = level;
    }

    // setLevel method
    public void setLevel(int lv) {
        this.level = lv; // Update the level first

        // Check for evolution based on the level
        if (lv >= 16 && lv < 32) {
            this.id = 2; // Evolve to Ivysaur
        } else if (lv >= 32) {
            this.id = 3; // Evolve to Venusaur
        }
    }

    // getLevel method
    public int getLevel() {
        return this.level;
    }

    // getName method
    public String getName() {
        switch (this.id) {
            case 2:
                return "Ivysaur";
            case 3:
                return "Venusaur";
            default:
                return "Bulbasaur"; // Default for id == 1
        }
    }

    // getID method
    public int getID() {
        return this.id;
    }

    // toString method
    @Override
    public String toString() {
        return "Level: " + getLevel() + ", ID: " + getID();
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        Bulbasaur bulbasaur = (Bulbasaur) obj;
        // Compare both level and id
        return id == bulbasaur.id && level == bulbasaur.level;
    }

    // copy method
    public Bulbasaur copy() {
        return new Bulbasaur(this.id, this.level);
    }
}
