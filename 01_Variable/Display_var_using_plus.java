public class Display_var_using_plus {
    public static void main(String[] args) {
        //+ : it is used to combine both text and a variable and also we can add a variable to another variable(it can be string or int)

        int a = 10 , b = 20;
        int B = a + b;
        System.out.println("The Sum of a + b ="+B);

        String name = "Keshav" ;
        System.out.println("Hello" + " " + name);

        String firstName = "Keshav";
        String lastName = "Shetty";
        System.out.println(firstName + lastName);
    }
    
}
