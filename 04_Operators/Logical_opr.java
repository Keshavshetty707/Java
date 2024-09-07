
public class Logical_opr {
    public static void main(String[] args) {
        //&& (Logical and) : Returns true if both statements are true
        int x = 5;
        System.out.println("x : "+x);
        System.out.println("Logical and");
        System.out.println(" x <= 5 &&  x < 10 : "+(x <= 5 &&  x < 10));

        //|| (Logical or) : Returns true if one of the statements is true	
        System.out.println("\nLogical or");
        System.out.println(" x < 5 ||  x < 10 : "+(x < 5 ||  x < 10));

        //!	(Logical not) :	Reverse the result, returns false if the result is true
        System.out.println("\nLogical not");
        System.out.println("!(x < 5 && x < 10) : "+ !(x < 5 && x < 10));

    }
}
