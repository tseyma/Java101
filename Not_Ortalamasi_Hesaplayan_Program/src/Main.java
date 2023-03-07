import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfı
        Scanner input=new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("Matematik notunuz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuz:");
        fizik=input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya=input.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce=input.nextInt();

        System.out.print("Tarih notunuz:");
        tarih=input.nextInt();

        System.out.print("Müzik notunuz:");
        muzik=input.nextInt();

        //ortalama hesapla
        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama=toplam/6.0;
        System.out.println("not ortalaması:"+ortalama);

        //sınıfı geçme durumu
        boolean durum = ortalama>=60;
        String sonuc = durum ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(sonuc);

    }
}