/*
İstek: Kütlesi hızı ve yerden yükekliği girilen maddenin potansiyel ve
kinetik enerjisini hesaplayan program

Çözüm Algoritması:
Step 1:Start
Step 2:Kullanıcıdan maddenin kütle hız ve yerdek yüskseklik ölçülerini al
Step 3:ALınan değerler ile potansiyel ve kinetik enerji hesapla 
Step 4:Çıkan Sonuçları ekrana yaz 
Step 5:Bitire
*/
package Homeworks;
import java.util.Scanner;
public class KinetikPotansiyel {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen maddenin kütle miktarını kilogram cinsinden giriniz");
    double m = input.nextDouble();
    System.out.println("Teşekkürler şimdi maddenin yüksekliğini metre cinsinden giriniz");
    double h = input.nextDouble();
    System.out.println("Teşekkürler şimdi maddenin hızını metre/saniye cinsinden giriniz");
    double v = input.nextDouble();
    double Ep = m * 10 * h ;
    double Ek = (m * v * v) /2 ;
    System.out.println("Maddenin Kinetik Enerjisi: " + Ek + "  "
    + "Maddenin Potansiyel Enerjisi: " + Ep );
    }
    
}
