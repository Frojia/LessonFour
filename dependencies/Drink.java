//Task Three
package dependencies;
class Alcohol {
    public int strength;
    public Alcohol (int strength){
        this.strength = strength;
    }
}

class Whiskey extends Alcohol {
    private String type;
    private String label;
    private Ingredients ingredients;
    public Whiskey(int strength, String type, String label) {
        super(strength);
        this.type = type;
        this.label = label;
    }
    void addIngredients(Ingredients ingredients){
        this.ingredients = ingredients;
    }
}
class Ingredients {
    int amount;
    String name;
    public Ingredients(int amount, String name){
        this.amount = amount;
        this.name = name;
    }
}
