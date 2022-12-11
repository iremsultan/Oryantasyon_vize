package vize.ödevi;
// 1 ile n arasındaki sayıların toplamını bulunuz.
import java.util.Scanner; 
public class soru5 {
public static void main(String[] args) {       
 
  Scanner scan = new Scanner(System.in);    
  System.out.print("Bir sayı giriniz : ");       
  int n = scan.nextInt();
  int toplam = 0 ;
  
  for ( int i=1; i<n; i++ ){ 
      
   toplam = toplam + i ; }
    System.out.println("1 ile " + n + " arasındaki sayıların toplamı " + toplam + "dir.");
  }
}