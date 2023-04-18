import java.util.Scanner;

public class Main {
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        if (a == 0 && b == 0) {
            System.out.println("Taban değeri 0 iken üs değeri 0 olamaz!");
        } else {
            System.out.println("Sonuç : " + result);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Taban değerini giriniz : ");
            int base = input.nextInt();
            System.out.print("Üs değerini giriniz : ");
            int exp = input.nextInt();

            power(base,exp);

        }
    }
}