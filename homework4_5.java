        /*
Adım 1:Başlat
Adım 2:n! r! (n-r)! tanımla
Adım 3:kombinasyon için n ve r yi al
Adım 4:n!/(r!*(n-r)!) işlemi ile sonucu bul
Adım 5:Sonucu yaz
Adım 6:Bitir
 */

package homeworks;
import java.util.Scanner;
/**
 *
 * @author emrea
 */
public class homework4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here




Scanner input = new Scanner(System.in);
        System.out.print("Lütfen n'i giriniz: ");
        int n=input.nextInt();
        int k=1;
        int x=1;
            while(k<=n){
            x=x*k;
            k=k+1;
    }//F1:n!
            System.out.print("Lütfen r'yi giriniz: ");
        int r=input.nextInt();
        int a=1;
        int y=1;
            while(a<=r){
            y=y*a;
            a=a+1;
    }//F2:r!
        int b=1;
        int z=1;
            while(b<=(n-r)){
            z=z*b;
            b=b+1;
    }//F3:(n-r)!
            int S =(int) (x/(y*z));
            System.out.println(+n+" elemanlı kümenin "+r+"'li kombinasyonları: "+S);
    }
    
}

   
