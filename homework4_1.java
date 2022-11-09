/*
Klavyeden girilen pozitif bir a tamsayısının tam bölenlerini hesaplayıp listeleyen program;
Adım1: Başla
Adım2: Kullanıcıdan bir pozitif bir a tam sayısı al
Adım3: i=1 
Adım4: Eğer i > N ise git 
 */
package homeworks;
import java.util.Scanner;
/**
 *
 * @author emrea
 */
public class homework4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir N değeri giriniz: ");
        int N = input.nextInt();
        System.out.println(N+" Sayısının pozitif tam bölenleri:");
        for (int i = 1; i <= N; i++) 
        {
            if(N % i == 0)
            {
                System.out.println(i);   
            }
        }
    }
}
    
