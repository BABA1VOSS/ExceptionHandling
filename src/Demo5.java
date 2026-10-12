public class Demo5 {
    public static void main(String[] args) {
        try{
            System.out.println("outer try Starts");
            try {
                System.out.println("Inner try Starts");
                System.out.println(5/0);// new ArithmeticException(" / by zero");
                System.out.println("Inner try ends");
            }
            catch(ArithmeticException e) {
                System.out.println("divide by zero is not allowed : inner");
            }
            System.out.println("outer try ends");
        }

        catch(ArithmeticException e) {
            System.out.println("Divide by zero : outer");
        }
    }
}
