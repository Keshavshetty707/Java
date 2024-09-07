
public class Arithmetic_opr {
    public static void main(String[] args) {
        //Arithmetic operators are used to perform common mathematical operations

        //Addition(+) : Add two values
        System.out.println("Addition(+)");
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Sum of a = "+ a +" and b = "+ b +" is: "+sum);

        //Subtraction(-) : Subtracts one value from another
        System.out.println("\nSubtraction(-)");
        int c = 20, d = 10;
        int diff = c - d;
        System.out.println("Difference of c = "+ c +" and d = "+ d +" is: "+diff);

        //Multiplication(*) : Multiplies two values
        System.out.println("\nMultiplication(*)");
        int e = 10, f = 20;
        int product = e * f;
        System.out.println("Product of e = "+ e +" and f = "+ f +" is: "+product);

        //Division(/) : Divides one value by another
        System.out.println("\nDivision(/)");
        int g = 20, h = 10;
        int quo = g / h;
        System.out.println("Quotient of g = "+ g +" and h = "+ h +" is: "+quo);

        //Modulus(%) : Returns the divison remainder
        System.out.println("\nModulus(%)");
        int i = 20, j = 10;
        int rem = i % j;
        System.out.println("Remainder of i = "+ i +" and j = "+ j +" is: "+rem);

        //Increment(++) : Increases the value of a variable by 1
        System.out.println("\nIncrement(++)");
        int k = 10;
        System.out.println("Value of k before increment is: "+k);
        k++;
        System.out.println("Value of k after increment is: "+k);

        //Decrement(--) : Decreases the value of a variable by 1
        System.out.println("\nDecrement(--)");
        int l = 10;
        System.out.println("Value of l before decrement is: "+l);
        l--;
        System.out.println("Value of l after decrement is: "+l);
    }
}
