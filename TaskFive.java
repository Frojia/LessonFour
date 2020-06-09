public class TaskFive {
    public static void main(String[] args) {
        Fish fish = new Fish("Mykola", 50, "grey");
        System.out.println(fish.name);
    }
}
class Fish{
    public String name;
    private int weight;
    private String color;

    public Fish (String name, int weight, String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
//пустой фиш использоватьв таске 4
    public Fish() {
        this("aleks", 10, "white");
    }

    public Fish(String name) {
        this(name, 12, "black");
    }
}