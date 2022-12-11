package vize.ödevi;
// yarıçapı kullanıcıdan alınan dairenin çevresini hesaplayınız.

import java.util.Scanner;

public class soru_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz");
        int r = scan.nextInt();
        double alan = Math.PI * r * r ;
        double cevre = 2 * Math.PI * r ;
        System.out.println( r + " yarıçaplı dairenin çevresi " + cevre + "; alanı ise " + alan + "dir." );
    }
}
