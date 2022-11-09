
package homeworks;
import java.util.Scanner;

public class n_kadar_çarpma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen n değerini giriniz");
        
        int n = input.nextInt();
        int k = 1;
        int Carpim = 0;
        
        while( k <= n ){
           Carpim = Carpim + (k * k);
           k = k + 1;   
        }
        
        System.out.println(Carpim);
        
        
        
        
        
        
    }
    
}
