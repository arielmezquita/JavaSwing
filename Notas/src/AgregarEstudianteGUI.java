
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author lsoto
 * @ArielMezquita in Java SE / NetBeans IDE 8.0.2 @ITLA 
 */
public class AgregarEstudianteGUI extends javax.swing.JFrame {

    public AgregarEstudianteGUI() {
        initComponents();
        mostrarList();
        bloquear();
        txtID.setVisible(false);
    }
    
    //Mostrar Todos Los Estudiantes
    public void mostrarList() {

        EstudianteDAOImpl estudiante = new EstudianteDAOImpl();
        ArrayList<Estudiante> list = new ArrayList<Estudiante>();
        list = (ArrayList) estudiante.todos();

        DefaultTableModel model = (DefaultTableModel) JTabReg.getModel();
        model.setRowCount(0);

        for (Estudiante test: list) {
            model.addRow(new Object[]{test.getId(), test.getNombre(), test.getMatricula(), test.getNota()});           
        }
    }
    
   //Busqueda de Estudiante por Nombre
    public void mostrarBusqueda(String nombre){
        EstudianteDAOImpl estudiante = new EstudianteDAOImpl();
        ArrayList<Estudiante> list = new ArrayList<Estudiante>();
        list = (ArrayList) estudiante.buscar(nombre);

        DefaultTableModel model = (DefaultTableModel) JTabReg.getModel();
        model.setRowCount(0);

        for (Estudiante test: list) {
            model.addRow(new Object[]{test.getId(), test.getNombre(), test.getMatricula(), test.getNota()});           
        }
    }
    //Busqueda de Estudiante por Matricula 
    public void mostrarBusquedaPorMatricula(String matricula){
        EstudianteDAOImpl estudiante = new EstudianteDAOImpl();
        ArrayList<Estudiante> list = new ArrayList<Estudiante>();
        list = (ArrayList) estudiante.buscarPorMatricula(matricula);

        DefaultTableModel model = (DefaultTableModel) JTabReg.getModel();
        model.setRowCount(0);

        for (Estudiante test: list) {
            model.addRow(new Object[]{test.getId(), test.getNombre(), test.getMatricula(), test.getNota()});           
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabReg = new javax.swing.JTable();
        btnEliminar = new javax.swing.JToggleButton();
        btnActualizar = new javax.swing.JToggleButton();
        txtID = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        cboBuscar = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Matrícula");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nota");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Registro de Estudiantes");

        JTabReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Matricula", "Nota"
            }
        ));
        JTabReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabRegMouseClicked(evt);
            }
        });
        JTabReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTabRegKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTabReg);
        if (JTabReg.getColumnModel().getColumnCount() > 0) {
            JTabReg.getColumnModel().getColumn(0).setMinWidth(0);
            JTabReg.getColumnModel().getColumn(0).setPreferredWidth(0);
            JTabReg.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setEnabled(false);
        txtID.setFocusable(false);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        cboBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matricula", "Nombre" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Buscar");

        jLabel8.setText("@ARIEL MEZQUITA / ITLA 2016 / JPA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        btnGuardar.setEnabled(false);
        if (validar()) {
            Estudiante e = new Estudiante(txtNombre.getText(),
                    txtMatricula.getText(),
                    Integer.parseInt(txtNota.getText()));
            EstudianteDAOImpl dao = new EstudianteDAOImpl();
            dao.guardar(e);
            mostrarList();
            JOptionPane.showMessageDialog(this, "Estudiante guardado!");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar los datos",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        bloquear();
    }//GEN-LAST:event_btnGuardarActionPerformed
//Seleccionar Item en el JTable
    private void JTabRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabRegMouseClicked
        desbloquear();
        btnEliminar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnGuardar.setEnabled(false);
        if(evt.getButton()==1){
            int fila = JTabReg.getSelectedRow();
            try {
                DefaultTableModel model = (DefaultTableModel) JTabReg.getModel();
                txtID.setText(model.getValueAt(fila, 0).toString());
                txtNombre.setText(model.getValueAt(fila, 1).toString());
                txtMatricula.setText(model.getValueAt(fila, 2).toString());
                txtNota.setText(model.getValueAt(fila, 3).toString());
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_JTabRegMouseClicked
//Salir de la Ventana
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed
//Eliminar Registros de la BD y JTable
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            if (validar()) {
            Estudiante t = new Estudiante(Integer.parseInt(txtID.getText()),txtNombre.getText(),
                    txtMatricula.getText(),
                    Integer.parseInt(txtNota.getText()));
            EstudianteDAOImpl dao = new EstudianteDAOImpl();
            dao.eliminar(t);
            mostrarList();
            JOptionPane.showMessageDialog(this, "Estudiante Eliminado!");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un registro para Eliminar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        bloquear();
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed
//Actualizar Item de la BD and JTable
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            if (validar()) {
            Estudiante t = new Estudiante(Integer.parseInt(txtID.getText()),txtNombre.getText(),
                    txtMatricula.getText(),
                    Integer.parseInt(txtNota.getText()));
            EstudianteDAOImpl dao = new EstudianteDAOImpl();
            dao.actualizar(t);
            mostrarList();
            JOptionPane.showMessageDialog(this, "Estudiante Actualizado!");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un registro para Actualizar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        bloquear();
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void JTabRegKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTabRegKeyReleased

    }//GEN-LAST:event_JTabRegKeyReleased
//Habilitar los campos para ingresar nuevo Item
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        desbloquear();
        limpiar();
        mostrarList();
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed
//Validar Texbox de busqueda
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
           btnBuscar.setEnabled(true);
    }//GEN-LAST:event_txtBuscarKeyReleased
//Buscar por parametro seleccionado 
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       if(txtBuscar.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Introducir Parametro de Busqueda");
            }else if(cboBuscar.getSelectedItem().toString().equals("Matricula")){
                    mostrarBusquedaPorMatricula(txtBuscar.getText());
            }else if(cboBuscar.getSelectedItem().toString().equals("Nombre")){
                    mostrarBusqueda(txtBuscar.getText());
            }

    }//GEN-LAST:event_btnBuscarActionPerformed
// Metodo para Limpiar TextBox 
    private void limpiar() {
        txtID.setText("");
        txtNombre.setFocusable(true);
        txtNombre.setText("");
        txtMatricula.setText("");
        txtNota.setText("");
        txtBuscar.setText("");
    }
// Metodo para Validad TextBox
    private boolean validar() {
        return !(txtNombre.getText().trim().equals("")
                || txtMatricula.getText().trim().equals("")
                || txtNota.getText().trim().equals(""));
    }
// Metodo para Bloquear TextBox 
    private void bloquear(){
        txtNombre.setEnabled(false);
        txtMatricula.setEnabled(false);
        txtNota.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnBuscar.setEnabled(false);
    }
// Metodo para DesBloquear TextBox   
    private void desbloquear(){
        txtNombre.setEnabled(true);
        txtMatricula.setEnabled(true);
        txtNota.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnBuscar.setEnabled(false);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarEstudianteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEstudianteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEstudianteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEstudianteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEstudianteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTabReg;
    private javax.swing.JToggleButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
