package peliculas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Ventana implements ActionListener{
    JFrame windows;
    JPanel panel1;
    JTextField txt1;
    JButton btn1;
    JComboBox cbo1;
    JLabel lba1, lba2;
    String nombrepelicula;
    
    public void createPanel1(){
        panel1 = new JPanel();

        panel1.setLayout(null);
        panel1.add(lba1 = new JLabel("Escriba el Titulo de la Pelicula"));
        lba1.setBounds(20,20,400,20);
        panel1.add(txt1 = new JTextField(10));
        txt1.setBounds(20,45,200,30);
        panel1.add(btn1 = new JButton("Agregar Pelicula"));
        btn1.addActionListener(this);
        btn1.setBounds(20,80,200,30);
        
        panel1.add(lba2 = new JLabel("Lista de Peliculas"));
        lba2.setBounds(250,20,200,30);
        panel1.add(cbo1 = new JComboBox());
        cbo1.setBounds(250,45,200,30);
        cbo1.addItem("Listado");
    }
    
    public void createWindows(){
        windows = new JFrame();        
        windows.setTitle("Catalogo de Peliculas");
        windows.setSize(500,200);  
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
        nombrepelicula = txt1.getText();
        cbo1.addItem(nombrepelicula);
        txt1.setText("");
    }
}
