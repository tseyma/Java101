import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 7, 23, -3, 45, -12};

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();

        System.out.println("Mevcut dizimiz : " + Arrays.toString(list));

        for(int i= 0; i < list.length; i++){

            if(number >= list[i] && number <= list[i+1]){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[i]);
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[i+1]);
                break;
            }
        }
    }
}