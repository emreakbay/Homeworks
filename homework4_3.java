/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
        /*
Adım 1:Başlat
Adım 2:Klavyeden n sayısı ve a paydası gir 
Adım 3:Klavyeden istediğimiz basamak olarak b gir
Adım 4:S=n/a ,
Adım 5:Eğer n=0 ve b=0 ise git adım 11
Adım 6:k=n%10
Adım 7:n=n/10
Adım 8:b-=1
Adım 9:Eğer b=0 ise yaz k
Adım 10:Git adım 5
Adım 11:Bitir
 */
 
package homeworks;
import java.util.Scanner;
/**
 *
 * @author emrea
 */
public class homework4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        double n=input.nextDouble();
        System.out.print("LĞtfen sayının paydasını giriniz:");
        double a=input.nextDouble();
        if (n<0 || n==0) {
            System.out.println("Lütfen pozitif bir tamsayı girerek tekrar deneyiniz");
        }
        System.out.println("Lütfen sayının kaçıncı basamağındaki rakamı görmek istediğinizi seçiniz");
        int b=input.nextInt(); 
        double S=n/a;
         System.out.print(+S+" sayısının "+b+". basamağı:");
        while (n>0 && b>0){
            int k = (int) (n%10) ;
            n=n/10;
            b-=1;
            if (b==0) {
                System.out.println(+k);
            }
        }
        
    }
    
}
    
    

