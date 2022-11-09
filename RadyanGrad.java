/*
İstek: klavyeden derece cinsinden girilen açıyı radyan 
ve grad cinsine çeviren program

Çözüm Algoritamsı:
Adım 1: Start
Adım 2: Kullanıcıdan derece ölçüsünü al 
Adım 3: Dereceyi radyan cinsine çevir
Adım 4: Dereceyi grad cinsine çevir 
Adım 5: Grad ve radyan ölçülerini ekrana yazdır 
Adım 6:End
*/
package Homeworks;
import java.util.Scanner;
public class RadyanGrad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen derece ölçüsünü giriniz");
        double d = input.nextInt();
        System.out.println("Teşekkürler lütfen bekleyiniz...");
        double r = d / 180;
        double g = (d * 10) / 9;
        System.out.println("Grad değeri: "+ g +", Radyan değeri: "+ r);
    }
    
}
