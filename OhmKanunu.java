/*
istek: klavyeden bir iletkenin direnci ile akımı girildiğinde uçlarındaki
gerilimi hesaplayan program (ohm kanunu)

Çözüm Algoritması:
Step 1:Start
Step 2:Kullanıcıdan iletkenin direncini ve akım miktarını al
Step 3:Alınan bilgi dahilinde iletkenin uçlarındaki gerilimi hesapla
Step 4:Çıkan sonucu ekrana yaz
Step 5:Bİtir
*/
package Homeworks;
import java.util.Scanner;
public class OhmKanunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iletkenin gerilimi değerini yazınız");
        double V = input.nextDouble();
        System.out.println("Lütfen iletkenin akım mikarını giriniz");
        double A = input.nextDouble();
        System.out.println("Teşekkürler hesaplama için lütfen bekleyiniz...");
        double X = V / A ;
        System.out.println("İletkenin uçları arasındaki gerilim(ohm): " + X +"Ω");
    }
    
}
