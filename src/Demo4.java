public class Demo4 {
    public static void main(String[] args) {
        //Exception handling in chain of methods

        methodA(5,0);
    }
    private static void methodA(int a, int b){
        //methodB(a,b);
        try {
            methodB(a,b);
        }
        catch (ArithmeticException e){
            System.out.println("Division by 0 is not allowed");
        }
    }
    private static void methodB(int a, int b) {
        System.out.println(a / b);
//        try{
//            System.out.println(a / b);
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Division by 0 is not allowed");
//        }
    }
}
