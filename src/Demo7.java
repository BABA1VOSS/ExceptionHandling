//isme hum dekhte hai multiple exception kis tarah se handle karte hai kya puri class ko isist karna padega ya fir bari bari karna padega
public class Demo7 {
    static void main(String[] args) {
        try {
            System.out.println(5 / 0);// new ArithmeticException("/by 0");

        }
//        catch (ArithmeticException e) {
        catch (Throwable e){//This is never recommended,  because yeh error bhi throw kar deta hai --> maximum mein isko EXCEPTION likh skta hu
            //chahe mein Throwable hi likhu yeh cahl jayega
        //catch (RuntimeException e) {// hierarchy ke through chal jayega dekhne wali bat yeh hai ki, yeh jo arithmetic exception jo hai wo ek runtime exception ki child class hai or yeh dono exception ki child classes hai or
//            System.out.println(e.getMessage());
            System.out.println("catched by Throwable");
        }
    }
}
