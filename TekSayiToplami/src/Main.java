import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, toplam = 0;
        do {
            System.out.println("Sayı girin: ");
            n = sc.nextInt();
            if (n % 4 == 0) {
                System.out.println(n);
                toplam += n;
            }
        } while (n % 2 == 0);
        System.out.println(toplam);
    }
}