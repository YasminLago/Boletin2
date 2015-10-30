package boletin2_4;
//Yasmin
import java.util.Scanner;

public class Boletin2_4 {
  public static void main(String[] args) {
     float num1,num2,suma,resta,multiplicacion,division;
      Scanner resultado=new Scanner(System.in);
      System.out.println("num1");
     num1=resultado.nextFloat();
      System.out.println("num2");
      num2=resultado.nextFloat();
      suma=num1+num2;
      resta=num1-num2;
      multiplicacion=num1*num2;
      division=num1/num2;
      System.out.println("resultado suma="+suma+"resultado resta="+resta+"resultado multiplicacion"+multiplicacion+"resultado division"+division);  
      
        
    }
    
}