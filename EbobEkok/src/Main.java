import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, ebob = 1, ekok;

        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();

        int i = 1;
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);
    }
}
