/*
İstek: Klavyeden yarıçapı girilen kürenin alanını ve hacmini hesaplayan program

Çözüm Algoritması:
Step 1:Start
Step 2:Kürenin yarı çapını al
Step 3:Alınan yarı çap ile alan ve hacim hesaplamasını yapınız 
Step 4:Çıkan değerleri ekrana yazınız
Step 5:End
*/
package Homeworks;
import java.util.Scanner;
public class KureAlanHacım {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kürenin yarı çapını giriniz");
        double r = input.nextDouble();
        System.out.println("Teşekkürler hesaplama için lütfen bekleyiniz...");
        double Alan = r * r * 4;
        double Hacim = (Alan * r) / 3;
        System.out.println("Kürenin Alanı: " + Alan + "π" + "    "+ "Kürenin Hacmi: " + Hacim+"π");
    }
    
}
