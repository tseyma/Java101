
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("Dizinin Boyutu: ");
        int number = input.nextInt();
        int[] list = new int[number];
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < list.length; i++) {
            counter++;

            System.out.print(counter + "." + "eleman: ");

            int numbers = input.nextInt();
            list[i] = numbers;
        }
        Arrays.sort(list);
        System.out.println("Sıralama:" + Arrays.toString(list));
    }
}