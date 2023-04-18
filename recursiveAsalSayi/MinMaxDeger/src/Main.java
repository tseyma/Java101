import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, min, max, sayi;
        System.out.print("Kaç tane sayı gireceksiniz? ");
        n = input.nextInt();

        System.out.print("1. sayıyı giriniz: ");
        sayi = input.nextInt();
        min = sayi;
        max = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = input.nextInt();
            if (sayi < min) {
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
