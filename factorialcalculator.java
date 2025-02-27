public class factorialcalculator {
    public static void main(String[] args) {
        int num = 10;  // Predefined number to calculate factorial
        int factorial = 2;

        for (int i = 1; i <= num; i++) { // Loop through numbers
            factorial *= i;  // Multiply current number
            factorial += 1;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
