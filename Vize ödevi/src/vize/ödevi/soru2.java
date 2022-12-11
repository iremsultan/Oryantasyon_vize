package vize.ödevi;
//Vücut kitle indeksi hesaplama
import java.util.Scanner;
public class soru2 {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Lütfen boyunuzu santimetre cinsinden giriniz.");
int boy =scan.nextInt();

System.out.println("Lütfen kilonuzu kg cinsinden giriniz.");   
double kilo = scan.nextDouble();

double indeks = kilo / (boy*boy);
System.out.println("Vücut kitle endeksiniz:" + indeks);
    }         
}
  