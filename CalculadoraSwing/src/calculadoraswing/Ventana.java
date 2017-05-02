package calculadoraswing;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
    //Creando Objetos de la Vetana
    JFrame ventana;
    JPanel panel1, panel2, panel3;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnx;
    JButton btnSuma, btnResta, btnDividir, btnMultiplicar, btnResultado, btnLimpiar;
    JTextField txt1;
    JLabel msj, lab1, lab2;
    int valor1, valor2;
    String operador;
    
    //Creacion de Panenles
    public void crearPanel1(){
            panel1 = new JPanel();
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
            panel1.add(lab1 = new JLabel(" "));
            lab1.setHorizontalAlignment(JTextField.RIGHT); 
            lab1.setFont(lab1.getFont().deriveFont(20f));
            panel1.add(lab2 = new JLabel(" "));
            lab2.setHorizontalAlignment(JTextField.RIGHT); 
            lab2.setFont(lab2.getFont().deriveFont(20f));
    }
    public void crearPanel2(){
            panel2 = new JPanel();
            //panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
            txt1 = new JTextField(8);
            txt1.setText("");
            txt1.setEditable(true);
            txt1.setBackground(Color.black);
            txt1.setForeground(Color.white);
            txt1.setHorizontalAlignment(JTextField.RIGHT); 
            txt1.setFont(txt1.getFont().deriveFont(50f));
            panel2.add(txt1);
    }
    public void crearPanel3(){
            panel3 = new JPanel();   
            GridLayout gl = new GridLayout(5,4);
            panel3.setLayout(gl);
            panel3.add(btnLimpiar = new JButton("CE"));
            btnLimpiar.setBackground(Color.black);
            btnLimpiar.addActionListener(this);
            btnLimpiar.setBackground(Color.black);
            btnLimpiar.setForeground(Color.white);
            panel3.add(btnx = new JButton(" ")); 
            btnx.setBackground(Color.black); 
            btnx.setForeground(Color.white);
            panel3.add(btnx = new JButton(" "));
            btnx.setBackground(Color.black);
            btnx.setForeground(Color.white);
            panel3.add(btnDividir = new JButton("/"));
            btnDividir.addActionListener(this);
            btnDividir.setBackground(Color.black);
            btnDividir.setForeground(Color.white);
            
            panel3.add(btn7 = new JButton("7"));
            btn7.addActionListener(this);
            btn7.setBackground(Color.black); 
            btn7.setForeground(Color.white);
            panel3.add(btn8 = new JButton("8"));
            btn8.addActionListener(this);
            btn8.setBackground(Color.black); 
            btn8.setForeground(Color.white);
            panel3.add(btn9 = new JButton("9"));
            btn9.addActionListener(this);
            btn9.setBackground(Color.black); 
            btn9.setForeground(Color.white);
            panel3.add(btnMultiplicar = new JButton("x"));
            btnMultiplicar.addActionListener(this);
            btnMultiplicar.setBackground(Color.black);
            btnMultiplicar.setForeground(Color.white);
            
            panel3.add(btn4 = new JButton("4"));
            btn4.addActionListener(this);
            btn4.setBackground(Color.black);
            btn4.setForeground(Color.white);            
            panel3.add(btn5 = new JButton("5"));
            btn5.addActionListener(this);
            btn5.setBackground(Color.black);            
            btn5.setForeground(Color.white);
            panel3.add(btn6 = new JButton("6"));
            btn6.addActionListener(this);
            btn6.setBackground(Color.black);            
            btn6.setForeground(Color.white);
            panel3.add(btnResta = new JButton("-"));
            btnResta.addActionListener(this);
            btnResta.setBackground(Color.black);
            btnResta.setForeground(Color.white);
            panel3.add(btn1 = new JButton("1"));
            btn1.addActionListener(this);
            btn1.setBackground(Color.black);
            btn1.setForeground(Color.white);
            panel3.add(btn2 = new JButton("2"));
            btn2.addActionListener(this);
            btn2.setBackground(Color.black);            
            btn2.setForeground(Color.white);
            panel3.add(btn3 = new JButton("3"));
            btn3.addActionListener(this);
            btn3.setBackground(Color.black);
            btn3.setForeground(Color.white);
            panel3.add(btnSuma = new JButton("+"));
            btnSuma.addActionListener(this);
            btnSuma.setBackground(Color.black);
            btnSuma.setForeground(Color.white);
            
            panel3.add(btnx = new JButton(" ")); 
            btnx.setBackground(Color.black);
            btnx.setForeground(Color.white);
            panel3.add(btn0 = new JButton("0"));
            btn0.setBackground(Color.black);
            btn0.addActionListener(this);
            btn0.setForeground(Color.white);
            panel3.add(btnx = new JButton(".")); 
            btnx.setBackground(Color.black);
            btnx.setForeground(Color.white);
            panel3.add(btnResultado = new JButton("="));
            btnResultado.setBackground(Color.black);
            btnResultado.addActionListener(this);       
            btnResultado.setForeground(Color.white);
    }
    
    public void crearVentana(){
            ventana = new JFrame();
            ventana.setTitle("Caculadora 2k17");
            ventana.setSize(338,550);
            ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
            ventana.add(panel1);
            ventana.add(panel2);
            ventana.add(panel3);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);   
    }
 
    public Ventana(){
        crearPanel1();
        crearPanel2();
        crearPanel3();
        crearVentana();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {   
        if(ae.getSource()==btn1)
       {
           txt1.setText(txt1.getText()+1);  
       }else if(ae.getSource()==btn2)
       {
           txt1.setText(txt1.getText()+"2");
       } else if(ae.getSource()==btn3)
       {
           txt1.setText(txt1.getText()+"3");
       }else if(ae.getSource()==btn4)
       {
           txt1.setText(txt1.getText()+"4");
       }else if(ae.getSource()==btn5)
       {
           txt1.setText(txt1.getText()+"5");
       }else if(ae.getSource()==btn6)
       {
           txt1.setText(txt1.getText()+"6");
       }else if(ae.getSource()==btn7)
       {
           txt1.setText(txt1.getText()+"7");
       }
       else if(ae.getSource()==btn8)
       {
           txt1.setText(txt1.getText()+"8");
       }
       else if(ae.getSource()==btn9)
       {
           txt1.setText(txt1.getText()+"9");
       }  
       else if(ae.getSource()==btn0)
       {
           txt1.setText(txt1.getText()+"0");
       }
       else if(ae.getSource()==btnLimpiar)
       {
           txt1.setText("");
           lab1.setText(" ");
           lab2.setText(" ");
       }
       else if(ae.getSource()==btnSuma)
       {
            operador = "+";
            lab1.setText(txt1.getText());
            txt1.setText("");
            valor1=Integer.parseInt(lab1.getText());
            lab2.setText(" +");
       }
       else if(ae.getSource()==btnResta)
       {
            operador = "-";
            lab1.setText(txt1.getText());
            txt1.setText("");
            valor1=Integer.parseInt(lab1.getText());
            lab2.setText(" -");
       }
       else if(ae.getSource()==btnMultiplicar)
       {
            operador = "*";
            lab1.setText(txt1.getText());
            txt1.setText("");
            valor1=Integer.parseInt(lab1.getText());
            lab2.setText(" x");
       }
       else if(ae.getSource()==btnDividir)
       {
            operador = "/";
            lab1.setText(txt1.getText());
            txt1.setText("");
            valor1=Integer.parseInt(lab1.getText());
            lab2.setText(" /");
       }
        else if(ae.getSource()==btnResultado)
       {
           valor2= Integer.parseInt(txt1.getText());
           lab1.setText(" ");
           lab2.setText(" ");
           operador(operador);
       }
    }
    public void operador(String x){
        switch(operador){
            default:
                txt1.setText("");
                lab1.setText(" ");
                lab2.setText(" ");
                break;
            case "+":
                txt1.setText(Integer.toString(valor1+valor2));    
                break;
            case "-":
                txt1.setText(Integer.toString(valor1-valor2));    
                break;
            case "*":
                txt1.setText(Integer.toString(valor1*valor2));    
                break;
             case "/":
                txt1.setText(Integer.toString(valor1/valor2));    
                break;
        }
    }
}
