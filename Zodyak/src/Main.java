import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Tarihinizi Girin (Örn: 2001): ");
        int dogumTarihi = scanner.nextInt();

        String[] zodyaklar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        String zodyak = zodyaklar[dogumTarihi % 12];

        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
    }
}