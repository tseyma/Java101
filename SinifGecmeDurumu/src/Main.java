import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, muzik, turkce, kimya, fizik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
        }
        System.out.println("Muzik notunuz:");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }
        System.out.println("Turkce notunuz:");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        System.out.println("Kimya notunuz:");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }

        System.out.println("Fizik notunuz:");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }
        double avarage = (mat + muzik + turkce + kimya + fizik) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız");

        } else {
            System.out.println("Tebrikler sınıfı geçtiniz");


        }
        System.out.println("Ortalamanız:"+avarage);
    }
}