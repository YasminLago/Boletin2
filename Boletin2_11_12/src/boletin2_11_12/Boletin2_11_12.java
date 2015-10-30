package boletin2_11_12;
//Yasmin
import java.util.Scanner;

public class Boletin2_11_12 {
 public static void main(String[] args) {
      float soldoFixo,km,retencionSS=36,irpf,soldoLiquido;
      int ventas,comision=5,diasdesplazamento,dietas=30;
      Scanner soldo=new Scanner(System.in);
      System.out.println("Soldo fixo");
      soldoFixo=soldo.nextFloat();
      System.out.println("Nº Km");
      km=soldo.nextFloat();
      System.out.println("Retención Seguridad Social");
      retencionSS=soldo.nextFloat();
      System.out.println("I.R.P.F");
      irpf=soldo.nextFloat();
      System.out.println("Nº ventas");
      ventas=soldo.nextInt();
      System.out.println("Comisiones");
      comision=soldo.nextInt();
      System.out.println("Dias desplazamento");
      diasdesplazamento=soldo.nextInt();
      System.out.println("Dietas");
      dietas=soldo.nextInt();
      soldoLiquido=soldoFixo+(ventas*comision/100)+(km*2)+(diasdesplazamento*dietas);
      System.out.println("Soldo liquido");
      float irpfSS = (soldoFixo-(soldoFixo*18/100))-36;
      System.out.println("Soldo a percibir " + irpfSS + (ventas*comision/100) + (km*2) + (diasdesplazamento*dietas));
        
    }
    
}