package boletin2_3;
//Yasmin
import java.util.Scanner;

public class Boletin2_3 {
      public static void main(String[] args) {
     float cambio= 1.2f,euros;
     Scanner dolares=new Scanner(System.in);
     System.out.println("cambio= "+cambio);
     System.out.println("euros");
     euros=dolares.nextFloat();
     System.out.println("Dolares= "+euros*cambio+"$");
    }
    
}