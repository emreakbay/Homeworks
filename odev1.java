/*
Adım 1: Başla
Adım 2: Kullanıcıdan matematik türkçe ve hayatbilgisi notunu alınız
Adım 3: Puanların ortalamasını alınız ve yazdırınız
Adım 4: Bitir
*/
package Homeworks;
import java.util.Scanner;
public class odev1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Lütfen matematik notunu giriniz: ");
     int Mat = input.nextInt();
     System.out.println("Lütfen türkçe notunu giriniz: ");
     int trk = input.nextInt();
     System.out.println("Lütfen Hayat Bilgisi notunu giriniz: ");
     int hyt = input.nextInt();
     System.out.println("Teşekkürler lütfen bekleyiniz...");
     double ort = ( trk + Mat + hyt ) / 3 ;
     System.out.println("Ders notu ortalamanız" + ort);
    }
    
}
