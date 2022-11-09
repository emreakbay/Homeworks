
package homeworks;
import java.util.Scanner;
public class sayi_toplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen n değerini giriniz: ");
        int S = input.nextInt();
        
        int A = S * ( S + 1 );
        int B = A / 2;
        System.out.println("n sayısına kadar olan sayıların toplamı: " + B );
        
    }
    
}
