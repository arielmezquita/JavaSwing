
package generadornumeros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Ventana implements ActionListener{
    JFrame windows;
    JPanel panel1;
    JButton btn1;
    JLabel lba1, lba2, lba3;
    JTextField txt1;
    JSpinner jsp1, jsp2;
    int valor1, valor2, num;
    
    public void createPanel1(){
        panel1 = new JPanel();
        panel1.setLayout(null);
        
        panel1.add(lba1 = new JLabel("Numero 1"));
        lba1.setBounds(20,50,200,20);
        panel1.add(jsp1 = new JSpinner());
        jsp1.setBounds(150,50,80,30);
        
        panel1.add(lba2 = new JLabel("Numero 2"));
        lba2.setBounds(20,90,200,30);
        panel1.add(jsp2 = new JSpinner());
        jsp2.setBounds(150,90,80,30);
                
        panel1.add(lba3 = new JLabel("Numero Generado"));
        lba3.setBounds(20,150,200,30);
        
        panel1.add(txt1 = new JTextField(5));
        txt1.setBounds(150,150,80,30);
        txt1.setEditable(false);
        
        panel1.add(btn1 = new JButton("Generar"));
        btn1.addActionListener(this);
        btn1.setBounds(80,210,120,30);
    }
    
    //Crear Ventana
    public void createWindows(){
        windows = new JFrame();        
        windows.setTitle("Generador de Numeros");
        windows.setSize(320,320);  
        windows.add(panel1);
        windows.setLocationRelativeTo(null);
        windows.setVisible(true);
        windows.setDefaultCloseOperation(windows.EXIT_ON_CLOSE);   
    }
    
    public Ventana(){
        createPanel1();
        createWindows();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        valor1 = (int) jsp1.getValue();
        valor2 = (int) jsp2.getValue();
        
        num = (int) (Math.random() * (valor2-valor1 )+valor1);
        txt1.setText(Integer.toString(num));
       
    }   
   
}
