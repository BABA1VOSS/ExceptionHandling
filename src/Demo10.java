//Throws -best use in checked exception , so let's see the code of checked exception first
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Demo10 {
    public static void main(String[] args) {
        try {
            readFile();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }//isme dhyan dene wali bat yeh hai ki jaise neeche wale ne throws kia waaise main class bhi exception throws kar degi, par woh kaha karegi main ko to seedha JVM call karta hai uss case mein erro ni ayega pura ka pura Stack Trace print hogta bahut bada sa


//        generally, kabhi bhi hume main mein throws ka use ni karna hai


        //FileReader fr = new FileReader("abc.txt");
        //jab file found hi nahi hui hai to, file mein exception to ayega hi usko theek karne ka ek hi tareeka hai ki woh humesha try and catch block m hi likha jayega
//        try {
//            FileReader fr = new FileReader("abc.txt");
//        }
//        catch (FileNotFoundException e){
//            System.out.println("file not found");
//        }
        //now we are converting these code into a particular method
    }
//    private static void readFile() {
//        try {
//            FileReader fr = new FileReader("abc.txt");
//        }
//        catch (FileNotFoundException e){
//            System.out.println("file not found");
//        }
        //ab mein itna sab bekar ka code ni likhna chahta hu to mein kya karunga , mein karunga yeh ki mein apni sari zimmedari caller ko saup dunga
        private static void readFile() throws FileNotFoundException{
            FileReader fr = new FileReader("abc.txt");

    }
}

