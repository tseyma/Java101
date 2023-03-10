import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, sayac = 0, toplam = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                sayac += 1;
                toplam += i;
            }
        }
        if (sayac > 0) {
            double ort = toplam / sayac;
            System.out.println("Sayıların ortalaması: " + ort);
        } else {
            System.out.println("Sayı bulunamadı");


        }
    }
}




