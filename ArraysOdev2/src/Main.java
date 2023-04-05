import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 45, 4, 4, 2, 1, 4};
        int[] frequency = new int[array.length];
        Arrays.fill(frequency, -1);

        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {


                if (array[i] == array[j]) {
                    frequency[j] = 0;
                    counter++;

                }

            }
            if (frequency[i] != 0) {
                frequency[i] = counter;
            }


        }
        System.out.println("Dizideki elemanların frekansları:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                System.out.println(array[i] + "sayısı" + frequency[i] + "kez kullanılmıştır.");
            }
        }

    }

}