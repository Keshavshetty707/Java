
public class Bitwise_opr {
    public static void main(String[] args) {
        
        // & (Bitwise AND )
        int numb1 = 5;
        int numb2 = 7;
    
        System.out.println("\n& (Bitwise AND)");
        int And = numb1 & numb2;
        System.out.println("numb1 & numb2 : " + And);

        // | (Bitwise OR )
        int numb3 = 5;
        int numb4 = 7;
        System.out.println("\n| (Bitwise OR)");
        System.out.println("numb3 | numb4: " + (numb3 | numb4));

        // ^ (Bitwise XOR )
        int numb5 = 5;
        int numb6 = 7;
        System.out.println("\n^ (Bitwise XOR )");
        System.out.println("numb5 ^ numb6 : " + (numb5 ^ numb6));

    //Shift Operator in Java
        // >> (Signed Right shift operator or Bitwise Right Shift)
        int numb7 = 10;
        System.out.println("\n>> (Signed Right shift operator)");
        System.out.println("numb7 >> 2 : " + (numb7 >>2 ));

        // >>> (Unsigned Right shift operator)
        int numb8 = 10;
        System.out.println("\n>>> (Unsigned Right shift operator)");
        System.out.println("numb8 >>> 2 : " + (numb8 >>> 2));

        // << (Left shift operator)
        int numb9 = 10;
        System.out.println("\n<< (Left shift operator)");
        System.out.println("numb9 << 2 : " + (numb9 << 2));
    }
    
}
