package boletin2_9;
//Yasmin
import java.util.Scanner;

public class Boletin2_9 {
 public static void main(String[] args) {
        float b100,b20,b5,m1,euros;
        Scanner total=new Scanner(System.in);
        System.out.println("Billete 100€");
        b100=total.nextFloat();
        System.out.print(System.getProperty("line.separator"));
        System.out.println("Billete 20€");
        b20=total.nextFloat();
        System.out.print(System.getProperty("line.separator"));
        System.out.println("Billete 5€");
        b5=total.nextFloat();
        System.out.print(System.getProperty("line.separator")); 
        System.out.println("Moneda 1€");
        m1=total.nextFloat();
        System.out.print(System.getProperty("line.separator"));    
        b100=b100*100;
        b20=b20*20;
        b5=b5*5;
        m1=m1*1;
        euros=b100+b20+b5+m1;
        System.out.println("Total euros="+euros+"€");
    
 }
    
}