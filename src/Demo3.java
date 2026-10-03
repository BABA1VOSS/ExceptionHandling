public class Demo3 {
    public static void main(String[] args) {
        //Exception handling
        System.out.println("step 1");
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
        }
        catch(ArithmeticException e){
            System.out.println("Division by 0 is not allowed");
        }
        System.out.println("step 2");
    }
}
