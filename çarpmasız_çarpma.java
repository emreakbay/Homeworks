
package homeworks;
import java.util.Scanner;

public class çarpmasız_çarpma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen çarpmak istediğiniz iki sayıyı giriniz: ");
        int S1 = input.nextInt();
        int S2 = input.nextInt();
        if ( S1 == 0 || S2 == 0) {
            System.out.println("0");
        }
        int Çarpım = 0;
        int k = 1;
        while( k <= S2) {
            Çarpım = Çarpım + S1;
            k = k + 1;
        }
        System.out.println("Çarpım: " + Çarpım);
    }
    
}
