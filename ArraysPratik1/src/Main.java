import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        int[] harmonic = {32,45,64,67,86,5,3};

        double result = 0.0;
        double avarage;

        for (int i = 0; i < harmonic.length; i++) {

            result += 1.0 / harmonic[i];

        }

        avarage = harmonic.length / result;
        System.out.println("==================================");
        System.out.println("Harmonik Ortalamanız : " + avarage);
        System.out.println("==================================");
    }
}