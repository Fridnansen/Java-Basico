import java.util.Scanner;

public class MatricesDinamicos{ 
  public static void main(String args[]){
     
   int filas = 0, columnas = 0;
   Scanner entrada = new Scanner(System.in); 
   
   System.out.print("¿Cuantas filas deseas ingresar?");
   filas = entrada .nextInt();

   System.out.print("¿Cuantas columnas deseas ingresar?");
   columnas = entrada .nextInt();

   int numeros[][] = new int[filas][columnas];

   for(int j=0; j < filas; j++){
     for(int i=0; i < columnas; i++){
     System.out.println("Por favor dame el valor #" + (j + 1) + "/" + (i + 1));
     numeros [j][i] = entrada.nextInt();
    }
   System.out.println("");
   } 
   
    for(int j=0; j < filas; j++){
     for(int i=0; i < columnas; i++){
     System.out.print("[" + numeros[j][i] + "]");
   }
   System.out.println("");	   
  }
 }
}
