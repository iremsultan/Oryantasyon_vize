package vize.ödevi;
// n sayısının faktöriyelini hesaplayınız.
import java.util.Scanner;
public class soru9 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Faktöriyelini hesapalamak istediğiniz sayıyı giriniz");
        int n = oku.nextInt();
        int faktöriyel = 1;

        for (int i=1;i<=n;i++) {
     
        faktöriyel= faktöriyel*i;
    }
        System.out.println( n+ " sayısının faktöriyeli " + faktöriyel + " dir" );
      }
        }
 
