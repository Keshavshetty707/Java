
public class Unary_opr {
    public static void main(String[] args) {
        int num = 10;

        // Unary plus
        int result = +num;
        System.out.println("The value of result after unary plus is: " + result);

        // Unary minus
        result = -num;
        System.out.println("\nThe value of result after unary minus is: " + result);

        // Pre-increment
        result = ++num;
        System.out.println("\nThe value of result after pre-increment is: " + result);

        // Post-increment
        result = num++;
        System.out.println("\nThe value of result after post-increment is: " + result);

        // Pre-decrement
        result = --num;
        System.out.println("\nThe value of result after pre-decrement is: " + result);

        // Post-decrement
        result = num--;
        System.out.println("\nThe value of result after post-decrement is: " + result);
    }
}
