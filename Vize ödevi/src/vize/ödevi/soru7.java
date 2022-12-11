package vize.ödevi;
//Girilen sayının tek mi çift mi olduğunu bulunuz. 

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = scan.nextInt();
        
        if (sayi%2 == 0){
            System.out.println("Girdiğiniz sayı çifttir.");
        }
        else {
            System.out.println("Girdiğiniz sayı tektir.");
        }
    }
}
