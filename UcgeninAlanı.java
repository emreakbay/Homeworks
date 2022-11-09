/*
İstek: Kullanıcıdan kenar uzunluğu ve o kenara ait yüksekliği 
girelilen üçgenin alanını hesaplayan program 

Çözüm Algoritması: 
Adım1:Start
Adım2:Kullanıcıdan üçgenin kenar uzunluğunu al
Adım3:Kullanıcıdan üçgenin yüksekliğini al
Adım4:Alınan değerleri çarp ve iki ye böl 
Adım5:Sonucu ekrana yazdır
Adım6:End
*/
package homeworks ;
import java.util.Scanner;
public class UcgeninAlanı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin bir kenarını girniz");
        double a = input.nextInt();
        System.out.println("Teşekkürler şimdi üçgenin yüksekliğini giriniz");
        double b = input.nextInt();
        System.out.println("Üçgenin alanı için Lütfen bekleyiniz...");
        double c = ( b * a ) / 2;
        System.out.println("Üçgenin alanı"+c);
    }
    
}

