
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double tutar,kdvOran,kdvTutar,kdvliTutar;
        Scanner input= new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz:");



        tutar=input.nextDouble();
        kdvOran = (tutar>0) && (tutar<=1000) ? 0.18 : 0.08;
        kdvTutar=tutar*kdvOran;


        kdvliTutar=tutar+kdvTutar;
        System.out.println("Kdvsiz Tutar:"+tutar);
        System.out.println("Kdv Oranı:"+kdvOran);
        System.out.println("Kdv Tutarı:"+kdvTutar);
        System.out.println("Kdvli Tutar:"+kdvliTutar);



    }
}