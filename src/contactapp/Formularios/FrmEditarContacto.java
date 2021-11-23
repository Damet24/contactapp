package contactapp.Formularios;

import contactapp.*;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FrmEditarContacto extends javax.swing.JFrame {

    int id_contact, id_number;
    Conector con;
    Statement stmt;
    Connection reg;
    Usuario usuario;
    
    public FrmEditarContacto(Usuario u, int id_contact, int id_number) {
        initComponents();
        this.id_contact = id_contact;
        this.id_number = id_number;
        con = new Conector();
        reg = con.getConector();
        usuario = u;
        ConsultarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtSegundoNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtSegundoApellido = new javax.swing.JTextField();
        txtTelefonoPersonal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCorreoPersonal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarCampoTelefono = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarCampoCorreo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Contacto");
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Dirección:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setText("jTextField1");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setText("jTextField6");

        txtSegundoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSegundoNombre.setText("jTextField2");

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellido.setText("jTextField3");

        txtSegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSegundoApellido.setText("jTextField4");

        txtTelefonoPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefonoPersonal.setText("jTextField5");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        txtCorreoPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreoPersonal.setText("jTextField6");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Segundo nombre:");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Actualizar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Correo (Personal):");

        btnAgregarCampoTelefono.setText("+");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono (Personal):");

        btnAgregarCampoCorreo.setText("+");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Segundo apellido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCampoTelefono)
                    .addComponent(btnAgregarCampoCorreo))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAgregarCampoTelefono)
                    .addComponent(txtTelefonoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAgregarCampoCorreo)
                    .addComponent(txtCorreoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        con.Desconectar();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            stmt = reg.createStatement();
            if("".equals(ValidorCampos())){
                ResultSet rs = stmt.executeQuery("CALL select_numbers_emails_address (" + id_contact + ");");
                while(rs.next()){
                    try{
                        Statement stmt2 = reg.createStatement();
                        stmt2.executeUpdate("CALL update_contact (" + id_contact + ", '" + txtNombre.getText() + "', '" + txtSegundoNombre.getText() + "', '" + txtApellido.getText() + "', '" + txtSegundoApellido.getText() + "', " + id_number + ", 'Personal', '" + txtTelefonoPersonal.getText() + "', " + rs.getInt("id_email") + ", 'Personal', '" + txtCorreoPersonal.getText() + "', " + rs.getInt("id_address") + ", 'Personal', '" + txtDireccion.getText() + "');");               
                        stmt2.close();
                    }catch(SQLException e){
                        System.out.println(e);
                    }
                }
                JOptionPane.showMessageDialog(this, "Contacto actualizado", "Hecho", JOptionPane.INFORMATION_MESSAGE);
                ContactApp.CambiarFormulario(this, new FrmPrincipal(usuario));
            }else{
                JOptionPane.showMessageDialog(this, ValidorCampos(), "Error", JOptionPane.WARNING_MESSAGE);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void ConsultarDatos(){
        try{
            stmt = reg.createStatement();
            ResultSet rs = stmt.executeQuery("CALL select_contacts (" + id_contact + ");");
            while(rs.next()){
                Statement stmt2 = reg.createStatement();
                ResultSet rs2 = stmt2.executeQuery("CALL select_numbers_emails_address (" + rs.getString("id_contact") + ");");
                if(rs2.next()){
                    txtNombre.setText(rs.getString("name"));
                    txtSegundoNombre.setText(rs.getString("second_name"));
                    txtApellido.setText(rs.getString("last_name"));
                    txtSegundoApellido.setText(rs.getString("second_last_name"));
                    txtTelefonoPersonal.setText(rs2.getString("number"));
                    txtCorreoPersonal.setText(rs2.getString("email"));
                    txtDireccion.setText(rs2.getString("address"));
                }
                rs2.close();
                stmt2.close();
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    private String ValidorCampos(){
        String error = "";
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txtCorreoPersonal.getText());
        if("".equals(txtNombre.getText())) error = error + "El nombre es un campo requerido.\n";
        if("".equals(txtTelefonoPersonal.getText())) error = error + "El teléfono es un campo requerido.\n";
        if("".equals(txtCorreoPersonal.getText())){
            /* ### */
        }else{
            if(!matcher.matches()){
                error = error + "El correo es inválido.\n";
            }
        }      
        return error;
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
            java.util.logging.Logger.getLogger(FrmEditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new FrmEditarContacto().setVisible(true);
            }
        });
    } 
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCampoCorreo;
    private javax.swing.JButton btnAgregarCampoTelefono;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreoPersonal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefonoPersonal;
    // End of variables declaration//GEN-END:variables
}
