import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        number = input.nextInt();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " bir mükemmel sayıdır.");
        } else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }


    }
}