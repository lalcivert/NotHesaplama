package day01;
import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
        int fizik,kimya,turkce,tarih,muzik,matematik;

        Scanner input = new Scanner(System.in);

        System.out.println("fizik notunuzu giriniz: ");
        fizik= input.nextInt();

        System.out.println("kimya notunuzu giriniz: ");
        kimya= input.nextInt();

        System.out.println("türkçe notunuzu giriniz: ");
        turkce= input.nextInt();

        System.out.println("tarih notunuzu giriniz: ");
        tarih= input.nextInt();

        System.out.println("müzik notunuzu giriniz: ");
        muzik= input.nextInt();

        System.out.println("matematik notunuzu giriniz: ");
        matematik= input.nextInt();

        int toplam= (fizik+matematik+kimya+tarih+turkce+muzik);

        double ort=toplam/6;

        System.out.println("ortalamanız: "+ort);

        String sonuc =(ort>=60) ? "Geçti" : "Kaldı";
        System.out.println("Geçme-kalma durumu: "+sonuc);



    }
}
