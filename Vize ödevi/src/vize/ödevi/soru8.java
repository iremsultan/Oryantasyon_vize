package vize.ödevi;
// Girilen sayının pozitif mi negatif mi olduğunu bulunuz.

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        double sayi = scan.nextDouble();
        
        if (sayi>0) {
            System.out.println("Girdiğiniz sayı pozitiftir.");
        }
        else if (sayi<0) {
        System.out.println("Girdiğiniz sayı negatiftir.");
      }
        else {
            System.out.println("Girdiğiniz sayı ne pozitif ne negatiftir.");
        }
    }
    }

