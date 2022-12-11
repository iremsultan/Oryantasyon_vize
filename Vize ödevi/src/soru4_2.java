
import java.util.Scanner;


public class soru4_2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Fakt hesaplmk ist giriniz");
        int n = oku.nextInt();
        int faktöriyel = 1;
                
                for (int i=1;i<=n;i++) {
                    faktöriyel= faktöriyel*i;
    }
                System.out.println( n+ " sayısının faktöriyeli " + faktöriyel + " dir" );
}
}