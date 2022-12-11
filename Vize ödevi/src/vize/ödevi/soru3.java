package vize.ödevi;
// n'den m'ye kadar olan sayılardan 7'ye tam bölünen sayıları bulunuz. 
import java.util.Scanner;
public class soru3 {
    public static void main(String[] args) {
        int i,n,m;
        Scanner scan = new Scanner(System.in);
         System.out.println("Başlangıç sayısı:");
        n = scan.nextInt();
        System.out.println("Bitiş sayısı:");
        m = scan.nextInt();
         for (i=n;i<m;i++) {
             if (i%7==0) System.out.print(i + ", " );
        }
         System.out.println("sayıları 7'ye tam bölünmektedir.");
    }
}