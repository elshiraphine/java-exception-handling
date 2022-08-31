public class OuterScopes {
    public static void main(String[] args) {
        try {
            doSomething("10");
            doSomething("InvalidInt-10");
            doSomething("0");
        }catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public static void doSomething(String numberString) {
        try {
            int number = Integer.parseInt(numberString);
            System.out.println(10/number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("NumberFormatException handled in doSomething");
        }
    }
}
