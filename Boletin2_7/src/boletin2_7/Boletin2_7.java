package boletin2_7;
//Yasmin
import java.util.Scanner;

public class Boletin2_7 {
  public static void main(String[] args) {
        float n,i,t;
        Scanner renda=new Scanner(System.in);
        System.out.println("n");
        n=renda.nextFloat();
        System.out.println("i");
        i=renda.nextFloat();
        System.out.println("t");
        t=renda.nextFloat();
        i=i/1200; 
        t=t*12;
        System.out.println("renda mensual="+(n*Math.pow(1+i, t)*i)/(Math.pow(1+i, t)-1));
       
    }
    
}