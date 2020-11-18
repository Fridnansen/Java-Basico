import java.util.Scanner;

public class VectoresDinamicos{ 
  public static void main(String args[]){
     
   int longitud = 0;
   Scanner entrada = new Scanner(System.in); 
   
   System.out.print("¿Cuantos números deseas ingresar?");
   longitud = entrada .nextInt();

   int numeros[] = new int[longitud];
   
   for(int i=0; i < numeros.length; i++){
   System.out.println("Por favor dame el valor #" + (i + 1));
   numeros [i] = entrada.nextInt();
   //numeros[i] = i + 10;
   } 

   for(int i=0; i < numeros.length; i++){
     System.out.print("[" + numeros[i] + "]");
//   System.out.print("[" + numeros[1] + "]"); 
//   System.out.print("[" + numeros[2] + "]"); 
//   System.out.print("[" + numeros[3] + "]");
//   System.out.print("[" + numeros[4] + "]");    	   
  }
 }
}
