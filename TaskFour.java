public class TaskFour {
}
    class Calculator {
        public double firstValue;
        public double secondValue;
        public String operation = "";

        public Calculator(double firstValue, double secondValue, String operation) {
            this.firstValue = firstValue;
            this.secondValue = secondValue;
            this.operation = operation;
        }

        Calculator() {
            this(5.0, 4.0, "*");
        }

        public double calculate() {
            double result;
            if (operation.equals("+")) {
                return result = firstValue + secondValue;
            } else if (operation.equals("-")) {
                return result = firstValue - secondValue;
            } else if (operation.equals("*")) {
                return result = firstValue * secondValue;
            } else if (operation.equals("/")) {
                return result = firstValue / secondValue;
            } return 0;
        }
        public static void main(String[] args) {
            Calculator calculator = new Calculator(9.4, 5.0, "+");
            System.out.println(calculator.calculate());
            Calculator calculator1 = new Calculator(3.3, 1.6, "*");
            System.out.println(calculator1.calculate());
            Calculator calculator2 = new Calculator(8.0, 4.0, "/");
            System.out.println(calculator2.calculate());
            Calculator calculator3 = new Calculator(10.0, 4.4, "-");
            System.out.println(calculator3.calculate());
        }
    }