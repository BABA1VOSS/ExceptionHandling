public class Demo8 {
    public static void main(String[] args) {
        try {
//            System.out.println(5/0);//pakadne wali baat yahi hai ki, isme jo bhi try block main pehle execute hoga, jaise sout wala blcok hai to yeh ayega to arithmetic exception ayega uske badd ka code ni use hoga, lekin agar string wala karenge uper wale ko comment kar ke tab NullPointException ayega.
//            String s = null;
//            s.length();

            Object obj = "Hello";
            Integer i =(Integer) obj;//new ClassCastException();
        }
////        catch (Exception e) {
//        catch (ArithmeticException  | NullPointerException e) {//sirf siblings hi oneliner hi ho sakte hai
//            System.out.println("Divide by zero is not allowed");
//        }
       catch(NullPointerException e){
            System.out.println("Nulls are not allowed");
        }
        catch (Exception e){
            System.out.println("some generic Exception");
        }
        //rule yahi hai ki, pehle sare Exception hai fir generic exception kyunki wo sare Exception handle kar hi lega
        //Lekin agar yahi mein Exception generic wala pehle likh deta hu to mereko Compile time error show karega (already handled by the catch block of the exception) unreachable reh jayegi baki ka
    }
}
