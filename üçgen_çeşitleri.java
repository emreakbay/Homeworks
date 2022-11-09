package homeworks;
import java.util.Scanner;

public class üçgen_çeşitleri {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz: ");
        
        int Kenar_1 = input.nextInt();
        int Kenar_2 = input.nextInt();
        int Kenar_3 = input.nextInt();
        
        if ( Kenar_1  <= 0 || Kenar_2 <= 0 || Kenar_3 <= 0) {
            System.out.println("Lütfen sıfırdan büyük tam sayı giriniz...");
        }
        else if ( Kenar_1 == Kenar_2 && Kenar_1 == Kenar_3 && Kenar_2 == Kenar_3) {
            System.out.println("Eşkenar Üçgen");
        }
        else if ( (Kenar_1 == Kenar_2) && (Kenar_1 != Kenar_3) && (Kenar_2 != Kenar_3) ) {
            System.out.println("İkizkenar Üçgen");
        }
        else if ( (Kenar_2 == Kenar_3) && (Kenar_1 != Kenar_3) && (Kenar_2 != Kenar_1) ) {
            System.out.println("İkizkenar Üçgen");
        }
        else if ( (Kenar_1 == Kenar_3) && (Kenar_1 != Kenar_2) && (Kenar_3 != Kenar_2) ) {
            System.out.println("İkizkenar Üçgen");
        }
        else if ( (Kenar_1 != Kenar_2) && (Kenar_2 != Kenar_3) && (Kenar_1 != Kenar_3) ) {
            System.out.println("Çeşitkenar Üçgen");
        }
        else{
            System.out.println("Lütfen tekrar deneyiniz");
        }
    }
    
    
}
