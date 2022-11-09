/*
Adım 1: Başla
Adım 2: Kullanıcıdan kilosunu ve boyunu alınız 
Adım 3: Vücut kitle endeksiniz hesaplayınız 
Adım 4: Çıkan değeri ekrana yazınız 
Adım 5: Bitir
*/
package Homeworks;
import java.util.Scanner;
public class odev3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen kilonuzu girinzi: ");
       int kilo = input.nextInt();
       System.out.println("Lütfen boyunuz metre cinsinden arada virgül olacak şekilde giriniz örnek:1,70m :  ");
       double boy = input.nextDouble();
       System.out.println("Vücut kitle endeksiniz hesaplanıyor lütfen bekleyiniz...");
       double VKE = kilo / ( boy * boy );
       System.out.println("vücut kitle endeksiniz " + VKE );
    
    }
    
}
