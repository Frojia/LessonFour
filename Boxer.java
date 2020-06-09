// Task 2
    public class Boxer {
        public int age;
        public int weight;
        public int strength;

        public Boxer(int age, int weight, int strength) {
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Boxer anotherBoxer) {
            if (age <= anotherBoxer.age && weight >= anotherBoxer.weight && strength > anotherBoxer.strength) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            Boxer boxer1 = new Boxer(25, 90, 100);
            Boxer boxer2 = new Boxer(35, 80, 90);
            boxer1.fight(boxer2);
            System.out.print(boxer1.fight(boxer2));
        }
    }