import java.util.Scanner;
import java.sql.SQLOutput;
public class Main {
            public static void main(String[] args) {



                Scanner inp = new Scanner(System.in);
               double armut,elma,domates,muz,patlican;
               double armutf= 2.14;
            double elmaf=3.67;
            double domatesf=1.11;
            double muzf=0.95;
            double patlicanf= 5.00;

            System.out.println("Armut Kaç Kilo ? :");
            armut=inp.nextDouble();

            System.out.println("Elma Kaç Kilo ? :");
            elma=inp.nextDouble();

            System.out.println("Domates Kaç Kilo ? :");
            domates=inp.nextDouble();

            System.out.println("Muz Kaç Kilo ? :");
            muz=inp.nextDouble();

            System.out.println("Patlıcan Kaç Kilo ? :");
            patlican=inp.nextDouble();

            Double ToplamTutar=(armut*armutf)+(domatesf*domates)+(muzf*muz)+(elmaf*elma)+(patlicanf*patlican);
            System.out.println("Toplam Ödenecek Tutar : " + ToplamTutar+ "TL");


    }
}