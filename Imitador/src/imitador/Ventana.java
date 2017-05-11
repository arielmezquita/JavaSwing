
package imitador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;


public class Ventana implements ChangeListener{
    JFrame windows;
    JPanel panel1;
    JLabel lba1, lba2;
    JSeparator separator;
    String nombrepelicula;
    JCheckBox chk1, chk2, chk3, chk1b, chk2b, chk3b;
    JRadioButton rbt1, rbt2, rbt3, rbt1b, rbt2b, rbt3b; 
    ButtonGroup grp1, grp2;
    JTextField txt1, txt2, txt3, txt4;
    JComboBox cbo1, cbo2;
    JSpinner jsp1, jsp2;
    String valor1;
    int index1;
    
    public void createPanel1(){
        panel1 = new JPanel();
        panel1.setLayout(null);
        
        panel1.add(lba1 = new JLabel("Original"));
        lba1.setBounds(20,20,100,20);
        ButtonGroup grp1 = new ButtonGroup();
        panel1.add(rbt1 = new JRadioButton("Opcion 1", false));
        rbt1.setBounds(20,60,100,20);        
        grp1.add(rbt1); 
        panel1.add(rbt2 = new JRadioButton("Opcion 2", false));
        rbt2.setBounds(20,90,100,20);   
        grp1.add(rbt2);
        panel1.add(rbt3 = new JRadioButton("Opcion 3", false));
        rbt3.setBounds(20,120,100,20);
        grp1.add(rbt3);
        panel1.add(chk1 = new JCheckBox("Opcion 1", false));
        chk1.setBounds(120,60,100,20);
        panel1.add(chk2 = new JCheckBox("Opcion 2", false));
        chk2.setBounds(120,90,100,20);
        panel1.add(chk3 = new JCheckBox("Opcion 3", false));        
        chk3.setBounds(120,120,100,20);
        
        //Eventos para Seleccionar CheckBoxes Simultaneos
        chk1.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
        if(e.getStateChange()==ItemEvent.SELECTED)
            chk1b.setSelected(true);
        else
            chk1b.setSelected(false);
        }});
        
        chk2.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
        if(e.getStateChange()==ItemEvent.SELECTED)
            chk2b.setSelected(true);
        else
            chk2b.setSelected(false);
        }});
        
        chk3.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
        if(e.getStateChange()==ItemEvent.SELECTED)
            chk3b.setSelected(true);
        else
            chk3b.setSelected(false);
        }});
        
        rbt1.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
        if(e.getStateChange()==ItemEvent.SELECTED)
            rbt1b.setSelected(true);
        else
            rbt1b.setSelected(false);
        }});
        
        rbt2.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
        if(e.getStateChange()==ItemEvent.SELECTED)
            rbt2b.setSelected(true);
        else
            rbt2b.setSelected(false);
        }});
        
        rbt3.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
        if(e.getStateChange()==ItemEvent.SELECTED)
            rbt3b.setSelected(true);
        else
            rbt3b.setSelected(false);
        }});
        
        panel1.add(txt1 = new JTextField(5));
        txt1.setBounds(220,60,100,20);
        txt1.addKeyListener(new KeyListener(){
            @Override
            public void keyReleased(KeyEvent e) {
                valor1 = txt1.getText();
                txt2.setText(valor1);
            }
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {}
        });
        
        
        panel1.add(cbo1 = new JComboBox());
        cbo1.setBounds(220,90,100,20);
        panel1.add(jsp1 = new JSpinner());
        jsp1.setBounds(220,120,100,20);
        jsp1.addChangeListener(this);
        cbo1.addItem("Item 1");
        cbo1.addItem("Item 2");
        cbo1.addItem("Item 3");
        
        cbo1.addItemListener(new ItemListener(){
        @Override   
        public void itemStateChanged(ItemEvent e) 
        {
            if (e.getSource()==cbo1)
            index1 = cbo1.getSelectedIndex();
            cbo2.setSelectedIndex(index1);
        }});
        
        ////////////////// Parte del Espejo /////////////////
        
        panel1.add(separator = new JSeparator());
        separator.setBounds(0,160,500,20);
        separator.setEnabled(false);
        panel1.add(lba2 = new JLabel("Espejo"));
        lba2.setBounds(20,170,100,30);
        
        panel1.add(rbt1b = new JRadioButton("Opcion 1", false));
        rbt1b.setBounds(20,210,100,20);
        rbt1b.setEnabled(false);
        grp1.add(rbt1); 
        panel1.add(rbt2b = new JRadioButton("Opcion 2", false));
        rbt2b.setBounds(20,240,100,20);   
        rbt2b.setEnabled(false);
        grp1.add(rbt2);
        panel1.add(rbt3b = new JRadioButton("Opcion 3", false));
        rbt3b.setBounds(20,270,100,20);
        rbt3b.setEnabled(false);
        grp1.add(rbt3);
        
        panel1.add(chk1b = new JCheckBox("Opcion 1", false));
        chk1b.setBounds(120,210,100,20);
        chk1b.setEnabled(false);
        panel1.add(chk2b = new JCheckBox("Opcion 2", false));
        chk2b.setBounds(120,240,100,20);
        chk2b.setEnabled(false);        
        panel1.add(chk3b = new JCheckBox("Opcion 3", false));        
        chk3b.setEnabled(false);
        chk3b.setBounds(120,270,100,20);
        
        panel1.add(txt2 = new JTextField(5));
        txt2.setBounds(220,210,100,20);
        txt2.setEnabled(false);
        panel1.add(cbo2 = new JComboBox());
        cbo2.setBounds(220,240,100,20);
        cbo2.setEnabled(false);
        panel1.add(jsp2 = new JSpinner());
        jsp2.setBounds(220,270,100,20);
        jsp2.setEnabled(false);
        
        cbo2.addItem("Item 1");
        cbo2.addItem("Item 2");
        cbo2.addItem("Item 3");
    }
    
    //Crear Ventana
    public void createWindows(){
        windows = new JFrame();        
        windows.setTitle("Imitador");
        windows.setSize(400,350);  
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
    public void stateChanged(ChangeEvent e) {
       jsp2.setValue((int) jsp1.getValue());
    }

}
