package homeworks;

import java.util.Scanner;

public class haftanın_günleri {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen 1-7 arası bir sayı giriniz: ");
        
        int S = input.nextInt();
        
        if ( S == 1 ) {
            System.out.println("Pazartesi");
        }
        else if ( S == 2) {
            System.out.println("Salı");
        }
        else if ( S == 3 ) {
            System.out.println("Çarşamba");
        }
        else if ( S == 4 ) {
            System.out.println("Perşembe");
        }
        else if ( S == 5 ) {
            System.out.println("Cuma");
        }
        else if ( S == 6 ) {
            System.out.println("Cumartesi");
        }
        else if ( S == 7 ) {
            System.out.println("Pazar");
        }
        else{
            System.out.println("Lütfen 1-7 arası bir tam sayı giriniz...");
        }
    }
}
 