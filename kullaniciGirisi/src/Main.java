import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = inp.nextLine();

        System.out.print("Şifreniz:");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("12345")) {
            System.out.println("Giriş yaptınız");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Şifreniz yanlış. Sıfırlamak ister misiniz?");
            String menu = "Evet için 1'e, Hayır için 2'ye basınız.";
            System.out.println(menu);
            int choice = inp.nextInt();
            if (choice == 1) {
                System.out.print("Oluşturmak istediğiniz yeni şifreyi giriniz :");
                int newPassword = inp.nextInt();

                if (newPassword == 12345) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else if (choice == 2) {
                System.out.println("Sisteme giriş yapabilmek için doğru şifreyi giriniz ya da yeni şifre oluşturunuz!");
            } else {
                System.out.println("Geçersiz işlem yaptınız!");
            }
            } else {
            System.out.println("Bilgileriniz yanlış.");
        }
    }}




