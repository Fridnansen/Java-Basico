import javax.swing.*;

public class Formulario31 extends JFrame {
    
   private JTextField textfield1;
   private JScrollPane scrollpanel;
   private JTextArea textarea1;

  public Formulario31(){
   setLayout(null);
 
   textfield1= new JTextField();
   textfield1.setBounds(10,10,200,30);
   add(textfield1);
   
   textarea1= new JTextArea();
   scrollpanel = new JScrollPane(textarea1);
   scrollpanel.setBounds(10,50,400,300);
   add(scrollpanel);
  }

 public static void main (String args[]){
   Formulario31 formulario1 = new Formulario31();
   formulario1.setBounds(0,0,540,400);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
   formulario1.setResizable(false);
 }
}