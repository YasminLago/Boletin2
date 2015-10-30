package boletin2_8;
//Yasmin
import java.util.Scanner;

public class Boletin2_8 {
  public static void main(String[] args) {
      float gC;
      Scanner resultado=new Scanner(System.in);
      System.out.println("Graos Centigrados");
      gC=resultado.nextFloat();
      System.out.println("Graos Fahrenheit= "+(gC*1.8+32));
      System.out.println("Graos Kelvin= "+(gC+273.15));
              
    }
    
}