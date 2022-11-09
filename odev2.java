/*
Adım 1: Başla
Adım 2: kullanıcıdan yaşını alınız 
Adım 3: şuanki yıldan yaşı çıkartınız
Adım 4: çıkan değeri ekrana yazınız
Adım 5: bitir
*/
package Homeworks;
import java.util.Scanner;
public class odev2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        int yas = input.nextInt();
        int simdiyas = 2022 - yas;
        System.out.println("şuanki yaşınız:" + simdiyas);
        
        
    }
    
}
