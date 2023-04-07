import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafe (KM): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double biletFiyati = mesafe * 0.10;
            double indirim = 0;

            if (yas < 12) {
                indirim = biletFiyati * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                indirim = biletFiyati * 0.10;
            } else if (yas >= 65) {
                indirim = biletFiyati * 0.30;
            }

            if (yolculukTipi == 2) {
                indirim += biletFiyati * 0.20;
            }

            double toplamFiyat = biletFiyati - indirim;

            System.out.println("Toplam Fiyat: " + toplamFiyat + " TL");
        }
    }
}