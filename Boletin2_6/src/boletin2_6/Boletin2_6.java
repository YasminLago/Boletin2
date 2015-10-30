package boletin2_6;
//Yasmin
import java.util.Scanner;

public class Boletin2_6 {
  public static void main(String[] args) {
        float pt,pp;
        Scanner porcentaxe= new Scanner(System.in);
        System.out.println("pt");
        pt=porcentaxe.nextFloat();
        System.out.println("pp");
        pp=porcentaxe.nextFloat();
        System.out.println("porcentaxe="+((pt-pp)*100)/pt+"%");
    }
    
}