import javax.swing.*;

public class Formulario3 extends JFrame{

   private JLabel label3;
   private JLabel label4;   

   public Formulario3(){
   setLayout(null);
   label3= new JLabel("Interfaz gráfica.");
   label3.setBounds(10,20,300,30);
   add(label3);
   label4 = new JLabel("Versión 1.0");
   label4.setBounds(10,70,100,30);
   add(label4);
 }

 public static void main (String arg[]){
   Formulario3 formulario1 = new Formulario3();
   formulario1.setBounds(0,0,300,200);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
   formulario1.setResizable(false);
 }
}