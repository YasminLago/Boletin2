package boletin2_5;
//Yasmin
import java.util.Scanner;

public class Boletin2_5 {
  public static void main(String[] args) {
        float milla;
        final int M=1852;
        Scanner metros=new Scanner(System.in);
        System.out.println("millas");
        milla=metros.nextFloat();
        System.out.println("metros="+(milla*M));
    }
    
}