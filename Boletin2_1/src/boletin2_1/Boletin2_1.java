package boletin2_1;
//Yasmin
import java.util.Scanner;

public class Boletin2_1 {
 //pedimos entrada por teclado
    public static void main(String[] args) {
    //pedimos entrada por teclado
        float base,altura;
        Scanner obx=new Scanner(System.in);
        System.out.println("teclea base");
        base=obx.nextFloat();
        System.out.println("teclea altura");
        altura = obx.nextFloat();
        System.out.println("area="+base*altura/2);
    }
    
}