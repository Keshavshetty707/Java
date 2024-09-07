public class Comparison_opr {
    public static void main(String[] args) {
        //Comparison operators are used to compare two values (or variables)
        //The return value of a comparison is either true or false

        int a = 10;
        int b = 20;
        
        //== (	Equal to)
        System.out.println("a == b : "+(a == b)); // false
     
        //!= (Not equal)
        System.out.println("a != b : "+(a != b)); // true

        //> (Greater than)
        System.out.println("a > b : "+(a > b)); // false
        
        //< (Less than)
        System.out.println("a < b : "+(a < b)); // true
        
        //>= (Greater than or equal to)
        System.out.println("a >= b : "+(a >= b)); // false
        
        //<= (Less than or equal to)
        System.out.println("a <= b : "+(a <= b)); // true
    }
}