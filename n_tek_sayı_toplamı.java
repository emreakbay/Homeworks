/*
Adım 1: Başla
Adım 2: Kullanıcıdan n değerini al
Adım 3: Toplam = 0
Adım 4: k = 1
Adım 5: Eğer k > n ise git Adım 9
Adım 6: Toplam = Toplam + k
Adım 7: k = k + 2
Adım 8: Adım 5 e git
Adım 9: Yazdır "Toplam"
Adım 10: Bitir
*/
package homeworks;

import java.util.Scanner;

public class n_tek_sayı_toplamı {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen n değerini giriniz: ");
        int n = input.nextInt();
        int Toplam = 0;
        int k = 1;
        while ( k <= n ) {
            Toplam = Toplam + k;
            k = k + 2 ;
        }
        System.out.println(Toplam);
    }
    
}
