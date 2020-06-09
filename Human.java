//Task 1 and Task 6
public class Human {

       private int weight;
       private int age;
       private String firstName;
       private String lastName;
       private int height;

    public Human (int weight, int age, String firstName, String lastName, int height){
            this.weight = weight;
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
            this.height= height;
        }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                '}';
    }
    public static void main(String[] args) {
        Human human = new Human(76, 26, "Max", "Romanovich", 178);
        System.out.println(human);
    }
}