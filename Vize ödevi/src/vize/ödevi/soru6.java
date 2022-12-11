package vize.ödevi;
// Kullanıcıdan alınan iki sayıyı karşılaştırınız.
import java.util.Scanner;
public class soru6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karşılaştırmak istediğiniz ilk sayıyı giriniz.");
        int s1 = scan.nextInt();
        System.out.println("Lütfen karşılaştırmak istediğiniz ikinci sayıyı giriniz.");
        int s2= scan.nextInt();
        
        if (s1>s2) {
            System.out.println(s1 + " sayısı " + s2 + " sayısından büyüktür.");
        }
        else if (s1<s2) {
            System.out.println(s1 + "sayısı" + s2 + "sayısından küçüktür.");
        }
        else {
            System.out.println("İki sayı birbirine eşittir.");
    }
  }
}