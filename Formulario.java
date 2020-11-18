import javax.swing.*;

public class Formulario extends JFrame{
 private JLabel label1;

 public Formulario(){
   setLayout(null);
   label1= new JLabel("La Geekipedia de Ernesto");
   label1.setBounds(100,20,200,300);
   add(label1);
 }

 public static void main (String arg[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(0,0,300,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
 }
}