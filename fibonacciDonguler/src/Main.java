import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, n1=0, n2=1;
        System.out.print("Sayı giriniz: ");
        n = inp.nextInt();
        System.out.print(n + " Elemanlı Fibonacci Serisi: ");
        for (int i=1; i<=n; i++){
            System.out.print(n1 + " ");
            int total = n1 + n2;
            total=n1+n2;
            n1=n2;
            n2=total;
        }
    }
}