public class Variables {
    public static void main(String[] args) {
        //Different types of variables
        //int : it store only whole number 
        int myInt = 10;
        System.out.println("value of myInt is ="+ myInt);

        //float : it store decimal and whole number
        float myFloat = 10.5f, myFloat1 = 10;
        System.out.println("value of myFloat is ="+ myFloat);
        System.out.println("value of myFloat is ="+ myFloat1);

        //String : it store sequences of character enclosed with double cotes
        String myString = "Keshav";
        System.out.println("value of myString is ="+ myString);

        //Boolean : it store 2 states true or false
        boolean myBoolean = true, myBoolean1 = false;
        System.out.println("value of myBoolean is ="+ myBoolean);
        System.out.println("value of myBoolean is ="+ myBoolean1);

        //char : it is used to store a single character 
        char myChar = 'A', myChar1 = '%';
        System.out.println("value of myChar is ="+ myChar);
        System.out.println("value of myChar is ="+ myChar1);

        //final : it means the value stored in this variable cannot be chaged after created 
        final int myFinalInt = 10;
        System.out.println("value of myFinalInt is ="+ myFinalInt);
    }
}