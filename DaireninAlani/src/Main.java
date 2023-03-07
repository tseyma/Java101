import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    System.out.println("Dairenin yarıçapını giriniz");
    int r;
    double pi=3.14,aci;
    Scanner R=new Scanner(System.in);
    r=R.nextInt();

    System.out.println("Daire diliminin açısını giriniz");
    Scanner Aci=new Scanner(System.in);
    aci=Aci.nextInt();
    double alan=(aci* (r*r) * aci) / 360;

    System.out.println("Daire Diliminin Alanı"+alan);




    }
}