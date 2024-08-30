public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        // TODO: Initialize id and level with appropriate values
        id = 1;
        level = 1;
    }

    public Bulbasaur(int id, int level) {
        // TODO: Initialize id and level with appropriate values
        this.id = id;
        this.level = level;
    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        // Update the level
        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        // If the new level is 32 or higher, evolve to Venusaur
        if(lv>=16&&lv<32)
            id = 2;
        else if(lv>=32)
            id = 3;
    }

    // getLevel method
    public int getLevel() {
        return level;
    }

    // getName method
    public String getName() {
        // TODO: Implement this method
        // Return the name based on the current id
        if(id==1) return "Bulbasaur";
        else if(id==2) return "Ivysaur";
        else return "Venusaur";
    }

    // getID method
    public int getID() {
        // TODO: Implement this method
        return id; // Placeholder return value
    }

    // toString method
    @Override
    public String toString() {
        // TODO: Implement this method
        // Return a string representation of the Bulbasaur object
        return "Level: " + getLevel() + ", ID: " + getID();
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if they are the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check if the object is null or not of the same class

        Bulbasaur bulbasaur = (Bulbasaur) obj;

        // Compare both level and id
        return id == bulbasaur.id && level == bulbasaur.level;
    }


    // copy method
    public Bulbasaur copy() {
        // TODO: Implement this method
        // Create and return a new Bulbasaur object with the same id and level
        return new Bulbasaur(this.id, this.level); // Placeholder return value
    }
}
