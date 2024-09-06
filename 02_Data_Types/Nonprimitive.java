public class Nonprimitive {
    int var1 = 50;
    public static void main(String[] args) {
        Nonprimitive obj = new Nonprimitive();
        //String :A String variable contains a collection of characters surrounded by double quotes
        System.out.println("A. String");
        String str = "Hello, World!";
        System.out.println(str);

        //Arrays : Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value
        System.out.println("B. Array");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        System.out.println(cars);
        System.out.println(myNum);

        System.out.println("accessing Nonprimitive class member using object:"+ obj.var1);
    }
}
