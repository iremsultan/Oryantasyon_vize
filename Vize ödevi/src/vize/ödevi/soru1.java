package vize.ödevi;
// Derslerin not ortalamasını hesaplama
import java.util.Scanner;
public class soru1 {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);
        int  matematik, fizik, turkce, kimya ;
        System.out.println("Matematik notunuz: ");
        matematik = not.nextInt();
        System.out.println("Fizik notunuz:");
        fizik = not.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya= not.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = not.nextInt();
        double ortalama ;
        ortalama = (matematik + fizik + turkce + kimya)/4;
        System.out.println("Not ortalamanız:" + ortalama);      
    }
}
 