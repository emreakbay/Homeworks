/*
Adım 1:Başlat
Adım 2:n sayısı gir
Adım 3:k=0,t1=0,t2=0,t3=0
Adım 4:Eğer k>n ise git adım 9
Adım 5:t1=t1+k
Adım 6:Eğer k%2!=0 ise t2=t2+k
Adım 7:Eğer k%2=0 ise t3=t3+k
Adım 8:k=k+1
Adım 9:Git adım 4
Adım 10:yaz t1 t2 t3
Adım 11:Bitir
 */
package homeworks;
import java.util.Scanner;
/**
 *
 * @author emrea
 */
public class homework4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir n pozitif tamsayısı giriniz");
        int n =input.nextInt();
        int t1=0;
        int t2=0;
        int t3=0;        
        for (int k=0;k<=n;k++) {
            t1+=k;
            if (k%2!=0) {
                t2+=k;
            }
            if (k%2==0) {
                t3+=k;
            }
        }
        System.out.println("[0-"+n +"] arasındaki sayıların toplamı: "+t1);
        System.out.println("[0-"+n +"] arasındaki tek sayıların toplamı: "+t2);
        System.out.println("[0-"+n +"] arasındaki çift sayıların toplamı: "+t3);
    }
    
}
