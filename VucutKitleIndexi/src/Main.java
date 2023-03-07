import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float boy,kilo,kitle_Index;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        Scanner Boy=new Scanner(System.in);
        boy=Boy.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        Scanner Kilo=new Scanner(System.in);
        kilo=Kilo.nextDouble();

        kitle_Index=kilo/ boy * boy;
        System.out.println("Vücut Kitle İndeksiniz :"+kitle_Index);


    }
}