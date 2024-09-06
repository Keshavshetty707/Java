
public class Typecasting {
    public static void main(String[] args) {
    //java Type Casting : Type casting is when you assign a value of one primitive datatype to another type
        // Two types of casting:

    //Widening Casting (automatically) - converting a smaller type to a larger type size
    //Widening casting is done automatically when passing a smaller size type to a larger size type:    
        //byte -> short -> char -> int -> long -> float -> double

        System.out.println("\n1. Widening Casting");
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("myInt = "+myInt);      // Outputs 9
        System.out.println("myDouble(int -> double) = "+myDouble);   // Outputs 9.0

    // Narrowing Casting (manually) - converting a larger type to a smaller size type
    //Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
        // double -> float -> long -> int -> char -> short -> byte
        System.out.println("\n2. Narrowing Casting");
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1; // Manual casting: double to int

        System.out.println("myDouble1 = "+myDouble1);   // Outputs 9.78
        System.out.println("myInt1(double -> int) = "+myInt1);      // Outputs 9


    }
}
