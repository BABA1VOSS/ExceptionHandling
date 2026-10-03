public class Demo2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        methodA(a, b);
    }

    private static void methodA(int a, int b) {
        methodB(a, b);
    }

    private static void methodB(int a, int b) {
        System.out.println(a / b);
    }
}
//className.MethodName and LineNo.

//how to handle exception  ---> conforming a goal :- when on exception occurs, don't crash. Handle it and continue the flow of control, for this we have a special syntax --> try catch
/*
try -----> iske under ata hai risky code
try {
        int a = 5;
        int b = 0;
        system.out.println(a/b);
}

catch -----> catch ke under ata hai preventive code
catch (Exception e) {
//catch will define us that how the code will run if exception occurs on above line and maintaining the code flow
}
 */

