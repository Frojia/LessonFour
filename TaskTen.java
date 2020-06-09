public class TaskTen {
    static class Overloading
    {
        public void display(char a)
        {
            System.out.println(a);
        }
        public void display(char b, int num)
        {
            System.out.println(b + " "+num);
        }
    }
    static class Sample
    {
        public static void main(String args[])
        {
            Overloading obj = new Overloading();
            obj.display('a');
            obj.display('a',10);
        }
    }
}
