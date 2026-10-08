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
//            System.out.println("Division by 0 is not allowed");
//            System.out.println(e.getMessage());

            e.printStackTrace();
        }
//        try&catch method is different from if-else becoz it cannot throws the exception , this is preventive method only koi exception ka object bana hi ni , lekin try&catch mein pehle try karo agar exception agyi to usko throw karo fir catch karo ;
        finally {
             //chahe exception aye nya na aye lekin yeh run ho ke hi manega

        }

        System.out.println("step 2");
        System.out.println("step 2");
        System.out.println("step 2");

    }
}
