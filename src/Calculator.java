public class Calculator {

    static int x = 60; // perameterised data
    static int y = 30;
    public static void add(){
        System.out.println("Addition = "+ (x+y));
    }
    public static void multiply(){
        System.out.println("Multiply = "+ (x*y));
    }
    public static void division(){
        System.out.println("division = "+ (x/y));
    }
    public static void subtraction(){
        System.out.println("subtraction = "+ (x-y));
    }
    public static void main(String[] args) {
        add();
        multiply();
        division();
        subtraction();
    }


}
