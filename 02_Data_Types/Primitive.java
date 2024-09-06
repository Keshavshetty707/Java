public class Primitive {
    public static void main(String[] args){
        //byte : it store whole number from -128 to 127 (1byte size)
        byte a = 10;
        //byte b = 128;
        System.out.println("myByteVar: "+ a);
        // System.out.println("myByteVar: "+ b);//it gives error

        //short : it stores whole numbers from -32768 to 32767 (2bytes size)
        short A = 150;
        //short B = 32768;
        System.out.println("myShortVar: "+ A);
        // System.out.println("myShortvar2: "+ B);//it gives error

        //int : it stores whole numbers from -2,147,483,648  to 2,147,483,647 (4bytes size)
        int c = 100000;
        //int d = -2147483648;
        System.out.println("myIntVar: "+ c);
        // System.out.println("myIntVar: "+ d);//it gives error

        //long : it stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8bytes size)
        long e = -1000000000565656656l;
        //long f = -9223372036854775809l;
        System.out.println("myLongVar: "+ e);
        // System.out.println("myLongVar: "+ f);// it gives error 

        //float : it Stores fractional numbers,Sufficient for storing 6 to 7 decimal digits (4bytes size)
        float g = 100.000000000000000000000000000000000000000f;
        float h = 101.1234567f;
        System.out.println("myFloatVar: "+ g);//Output : 100.0
        System.out.println("myFloatVar1: "+ h);//Output : 101.12346

        //double : it Stores fractional numbers, Sufficient for storing 15 decimal digits
        double i = 100.000000000000000000000000000000000000000;
        double j = 101.12345678912345;
        double k = 101.98765432112345678;
        System.out.println("myFloatVar: "+ i);//Output : 100.0
        System.out.println("myFloatVar1: "+ j);//Output : 101.12345678912345
        System.out.println("myFloatVar2: "+ k);//Output : 101.98765432112346
    }
}
