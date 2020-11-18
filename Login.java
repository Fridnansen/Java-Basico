import java.util.Scanner;

public class Login{ 
  public static void main(String args[]){
   
   Scanner entrada = new Scanner(System.in); 
   String usuario = "", password = "";
   
   System.out.print("Ingresa tu nombre de usuario: ");
   usuario = entrada.nextLine();

   System.out.print("Ingresa tu contraseña: ");
   password = entrada.nextLine();

   if(usuario.equals("ernesto") && password.equals("123456")) {
   System.out.println("Inicio de sesión correcto");
   }else {
   System.out.println("Nombre de usuario o contraseña incorrecto");
  }
 }
}
