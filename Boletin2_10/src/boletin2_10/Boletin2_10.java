package boletin2_10;
//Yasmin
import java.util.Scanner;

public class Boletin2_10 {
   public static void main(String[] args) {
        int b100,b20,b5,m1,euros;
        System.out.println("Total €");
        Scanner total=new Scanner(System.in);
        euros=total.nextInt();
        b100= euros/100;
        b20=(euros%100)/20;
        b5=(euros%20)/5;
        m1=(euros%5);
        System.out.print("Nº billetes de 100€: " +b100+ "Nº Billetes de 20€: "+ b20+ "Nº Billetes de 5€: "+b5+ "Nº Monedas de 1€: "+m1);
    }
    
}