


package homeworks;

import java.util.Scanner;

public class pozitif_negatif_sıfır {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen bir tam sayı değeri giriniz: ");
        int Tam_S = input.nextInt();
        
        if ( Tam_S > 0 ) {
            System.out.println("Sayı Pozitiftir");
        }
        else if ( Tam_S == 0 ) {
            System.out.println("Sayı Sıfırdır");
        }
        else if ( Tam_S < 0 ) {
            System.out.println("Sayı Negatiftir");
        }
        else 
            System.out.println("Lütffen Tam Sayı Giriniz...");
    }   
}
