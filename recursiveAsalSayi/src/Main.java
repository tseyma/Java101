
import java.util.Scanner;

public class Main {
    static int prime(int number, int i){
        if(i == 1){
            return 1;
        }else{
            if(number % i == 0){
                return 0;
            }
        }
        return prime(number, i-1);
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();

        int asal = prime(number, number/2);
        if(asal==1){
            System.out.println(number + " Sayısı asaldır");
        }else{
            System.out.println(number + " Sayısı asal değildir.");
        }
    }
}