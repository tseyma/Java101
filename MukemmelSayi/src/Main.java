import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, result;
        Scanner inp = new Scanner(System.in);

        do {
            result =0;
            System.out.print("Bir sayı giriniz: ");
            n = inp.nextInt();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    result += i;
                }
            }
            if (result == n) {
                System.out.println(n + " mükemmel sayıdır.");
            } else {
                System.out.println(n + " mükemmel sayı değildir.");
            }
        }while(n>0);
    }
}