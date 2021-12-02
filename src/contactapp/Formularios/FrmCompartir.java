package contactapp.Formularios;

import contactapp.*;
import java.sql.*;
import javax.swing.*;

public class FrmCompartir extends javax.swing.JFrame {

    Conector con;
    Statement stmt;
    Connection reg;
    int id_user_receiver, id_contact;    
    
    public FrmCompartir(String nombre, String telefono, int id_contact) {
        initComponents();
        con = new Conector();
        reg = con.getConector();        
        lblNombre.setText(nombre);
        lblTelefono.setText(telefono);
        this.id_contact = id_contact;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnCompartir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnReceptor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compartir Contacto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Teléfono:");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefono.setText("jLabel3");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Información del contacto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        btnCompartir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCompartir.setText("Compartir");
        btnCompartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompartirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Receptor:");

        btnReceptor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnCompartir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTelefono))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addComponent(btnReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompartir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ContactApp.CambiarFormulario(this, new FrmPrincipal());
    }//GEN-LAST:event_formWindowClosing

    private void btnCompartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompartirActionPerformed
        try{
            if(!"".equals(btnReceptor.getText())){
                stmt = reg.createStatement();
                ResultSet rs = stmt.executeQuery("CALL select_user ('" + btnReceptor.getText() + "');");
                if(rs.next()){
                    id_user_receiver = rs.getInt("id_user");                
                }
                rs.close();
                stmt.close();
                Statement stmt2 = reg.createStatement();
                stmt2.executeUpdate("CALL insert_inbox (" + id_user_receiver + ", " + Sesion.getUserId() + ", " + id_contact + ", '" + txtDescripcion.getText() + "');");
                stmt2.close();
                JOptionPane.showMessageDialog(this, "Contacto compartido", "Hecho", JOptionPane.INFORMATION_MESSAGE);
                con.Desconectar();
                ContactApp.CambiarFormulario(this, new FrmPrincipal());
            }else{
                JOptionPane.showMessageDialog(this, "El receptor es obligatorio", "Error", JOptionPane.WARNING_MESSAGE);
            }            
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "El receptor no existe", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCompartirActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmCompartir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCompartir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCompartir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCompartir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new FrmCompartir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCompartir;
    private javax.swing.JTextField btnReceptor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
