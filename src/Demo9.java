//Throw and Throws
public class Demo9 {
//    public static void main(String[] args) {
    //checkEligibility(-90);
    // is line ko dekhe to kisi ki bhi age ko -ve ni dal skte lekin agar i/p mein negative agya to usko hum theek karenge , using try catch block
//        try {
//            checkEligibiity(-5);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//       int age = 29 ;
//        int age = -29 ;
//        if(age <=0) {
//            System.out.println("Age cannot be negative ");
//        }
//
//        if (age > 18){
//            System.out.println("you are eligible to vote");
//        }
//        }
//    }
//
//    private static void checkEligibiity(int age) {
//        if (age <= 0) {
//            System.out.println("Age cannot be negative ");
//            System.err.println("Age cannot be negative ");
//            throw new IllegalArgumentException("Age cannot be negative");
//        }
//
//        if (age > 18) {
//            System.out.println("you are eligible to vote");
//        }
//    }
//}

// s = null; s.length (); null pointer exception
// hum in galtio ko kaise suddharte hai using try catch block


    public static void main(String[] args) {
        try {
            checkEligibility(-5);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Entered age was " + e.getAge());
        }
    }
    private static void checkEligibility(int age) throws InvalidAgeException {
        try{
            if(age <=0) {
                throw new InvalidAgeException("age cannot be -ve", age);
            }

            if (age > 18) {
                System.out.println("you are eligible to vote");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
//MAKING OF CUSTOM EXCEPTION


class InvalidAgeException extends Exception {
    int age;

    public InvalidAgeException(String message, int age) {
        super(message);
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
// isko mene itna complicated isliye kia hai kyunki , isse main mulitple age ke input le skta hu
    //extra info ke lie isko use karte hai
    //warna koi extra info ni chaiye to ddirect message ko propagate karva do
}