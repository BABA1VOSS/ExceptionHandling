//yeh demo5 ka hi ek extended exxample hai jisko mene case 2 ka naam dedia hai isme try ke under catch nahi rakhunga
public class Demo6 {
    public static void main(String[] args) {
        try{
            System.out.println("outer try Starts");
            try {
                System.out.println("Inner try Starts");
                System.out.println(5/0);// new ArithmeticException(" / by zero");
                System.out.println("Inner try ends");
            }
            catch(NullPointerException e) {
                System.out.println("Nulls are not allowed");
            }
            System.out.println("outer try ends");
        }

        catch(ArithmeticException e) {
            System.out.println("Divide by zero : outer");
        }
    }
}



