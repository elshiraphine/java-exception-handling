import java.util.Scanner;

public class CatchBlockTest {
    public static void main(String[] args) {
        Divide div = new Divide();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pembilang: ");
        int a = input.nextInt();

        System.out.println("Masukkan penyebut: ");
        int b = input.nextInt();

        try {
            double result = div.divide(a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Tidak dapat membagi dengan nol");
        }
    }
}
