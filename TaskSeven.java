public class TaskSeven{
    public static void main(String[] args) {
        Cars car = new Cars();
    }


}
class Cars {
    {
        System.out.println("Init");
    }

    public Cars() {
        System.out.println("constructor");
    }

    {
        System.out.println("Init 2");
    }
}