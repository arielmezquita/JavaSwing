
package miniencuesta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JSlider;

import javax.swing.JOptionPane;

public class Ventana implements ActionListener{
    JFrame windows;
    JPanel panel1;
    JButton btn1;
    JLabel lba1, lba2, lba3, lba4;
    JSeparator separator;
    String nombrepelicula;
    JCheckBox chk1, chk2, chk3;
    JRadioButton rbt1, rbt2, rbt3; 
    ButtonGroup grp1;
    JSlider sld1;
    String system, skill, hour="0";
    
    public void createPanel1(){
        panel1 = new JPanel();
        
        //Opciones de Sistema Operativo
        panel1.setLayout(null);
        panel1.add(lba1 = new JLabel("Elige un Sistema Operativo"));
        lba1.setBounds(20,20,200,20);
        ButtonGroup grp1 = new ButtonGroup();
        panel1.add(rbt1 = new JRadioButton("Windows", false));
        rbt1.setBounds(20,60,200,20);        
        grp1.add(rbt1); 
        panel1.add(rbt2 = new JRadioButton("Linux", false));
        rbt2.setBounds(20,90,200,20);   
        grp1.add(rbt2);
        panel1.add(rbt3 = new JRadioButton("Mac", false));
        rbt3.setBounds(20,120,200,20);
        grp1.add(rbt3);
        
        //Opciones de Especialidad 
        panel1.add(separator = new JSeparator());
        separator.setBounds(20,160,240,20);
        panel1.add(lba2 = new JLabel("Elige tu especialidad"));
        lba2.setBounds(20,170,200,30);
        panel1.add(chk1 = new JCheckBox("Programacion", false));
        chk1.setBounds(20,210,200,20);
        panel1.add(chk2 = new JCheckBox("Diseño Grafico", false));
        chk2.setBounds(20,240,200,20);
        panel1.add(chk3 = new JCheckBox("Administracion", false));        
        chk3.setBounds(20,270,200,20);
        
        panel1.add(separator = new JSeparator());
        separator.setBounds(20,310,240,20);
        panel1.add(lba3 = new JLabel("Horas que dedicas en el ordenador"));
        lba3.setBounds(20,320,250,30);
        panel1.add(lba4 = new JLabel("0"));
        lba4.setBounds(30,360,200,30);
        
        //Slider para Indicar cantidad de Horas en Rango de 1 a 10   
        panel1.add(sld1 = new JSlider(JSlider.HORIZONTAL,1,10,1));
        sld1.setBounds(50,360,150,30);
        sld1.addChangeListener(new ChangeListener(){
        @Override
        public void stateChanged(ChangeEvent e) {
            lba4.setText("" + ((JSlider)e.getSource()).getValue());
            hour = "" + ((JSlider)e.getSource()).getValue();
            }   
        });
        
        //Boton Para Generar Descripcion 
        panel1.add(btn1 = new JButton("Generar"));
        btn1.addActionListener(this);
        btn1.setBounds(80,410,120,30);
    }
    
    //Crear Ventana
    public void createWindows(){
        windows = new JFrame();        
        windows.setTitle("Mini Encuesta");
        windows.setSize(300,500);  
        windows.add(panel1);
        windows.setLocationRelativeTo(null);
        windows.setVisible(true);
        windows.setDefaultCloseOperation(windows.EXIT_ON_CLOSE);   
    }
    
    public Ventana(){
        createPanel1();
        createWindows();
    }

    //Metodo para validad opciones seleccionadas y generar descripcion
    @Override
    public void actionPerformed(ActionEvent e) {
        if(rbt1.isSelected()){
            system = "Windows";
        }else if (rbt2.isSelected())
        {
            system = "Linux";
        }else if (rbt3.isSelected())
        {   
            system = "Mac";
        }else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar por lo menos un Sistema Operativo");
        }
        
        skill = "";
        if(chk1.isSelected()== true){
            skill = skill + "Programacion, ";
        }
        if (chk2.isSelected()== true)
        {
            skill = skill + "Diseño Grafico";
        }
        if (rbt3.isSelected()== true)
        {  
            skill = skill + "Administracion";
        }
        
        JOptionPane.showMessageDialog(null, "Tu Sistema Operativo favorito es "+system+", tus especialidades son: "+skill+" y el numero de horas dedicas es de: "+hour);
    }
   
}
