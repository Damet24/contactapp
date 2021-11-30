package contactapp.Formularios;

import contactapp.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class FrmDetalleContacto extends javax.swing.JFrame {

    Conector con;
    Statement stmt;
    Connection reg;
    String id_contact, id_number;
    
    public FrmDetalleContacto(String id_contact, String id_number) {
        initComponents();
        pnlDivisor.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        pnlDivisor2.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        pnlDivisor3.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        con = new Conector();
        reg = con.getConector();
        this.id_contact = id_contact;
        this.id_number = id_number;
        ObtenerDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFotoUsuario = new Fondo();
        lblNombres = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        pnlDivisor = new javax.swing.JPanel();
        lblTelefonoPersonal = new javax.swing.JLabel();
        lblTagTelefonoPersonal = new javax.swing.JLabel();
        lblTagTelefonoOpcional = new javax.swing.JLabel();
        lblTelefonoOpcional = new javax.swing.JLabel();
        pnlDivisor2 = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        lblTagCorreo = new javax.swing.JLabel();
        pnlDivisor3 = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        lblTagDireccion = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalles del Contacto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout pnlFotoUsuarioLayout = new javax.swing.GroupLayout(pnlFotoUsuario);
        pnlFotoUsuario.setLayout(pnlFotoUsuarioLayout);
        pnlFotoUsuarioLayout.setHorizontalGroup(
            pnlFotoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlFotoUsuarioLayout.setVerticalGroup(
            pnlFotoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lblNombres.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNombres.setText("jLabel1");

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        pnlDivisor.setName(""); // NOI18N

        lblTelefonoPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefonoPersonal.setText("jLabel2");

        lblTagTelefonoPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTagTelefonoPersonal.setText("jLabel3");

        lblTagTelefonoOpcional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTagTelefonoOpcional.setText("jLabel3");

        lblTelefonoOpcional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefonoOpcional.setText("jLabel4");

        javax.swing.GroupLayout pnlDivisorLayout = new javax.swing.GroupLayout(pnlDivisor);
        pnlDivisor.setLayout(pnlDivisorLayout);
        pnlDivisorLayout.setHorizontalGroup(
            pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisorLayout.createSequentialGroup()
                .addGroup(pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoPersonal)
                    .addComponent(lblTagTelefonoPersonal)
                    .addComponent(lblTagTelefonoOpcional)
                    .addComponent(lblTelefonoOpcional))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        pnlDivisorLayout.setVerticalGroup(
            pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelefonoPersonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTagTelefonoPersonal)
                .addGap(14, 14, 14)
                .addComponent(lblTelefonoOpcional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTagTelefonoOpcional)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCorreo.setText("jLabel4");

        lblTagCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTagCorreo.setText("jLabel5");

        javax.swing.GroupLayout pnlDivisor2Layout = new javax.swing.GroupLayout(pnlDivisor2);
        pnlDivisor2.setLayout(pnlDivisor2Layout);
        pnlDivisor2Layout.setHorizontalGroup(
            pnlDivisor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisor2Layout.createSequentialGroup()
                .addGroup(pnlDivisor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo)
                    .addComponent(lblTagCorreo))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDivisor2Layout.setVerticalGroup(
            pnlDivisor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTagCorreo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDireccion.setText("jLabel4");

        lblTagDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTagDireccion.setText("jLabel5");

        javax.swing.GroupLayout pnlDivisor3Layout = new javax.swing.GroupLayout(pnlDivisor3);
        pnlDivisor3.setLayout(pnlDivisor3Layout);
        pnlDivisor3Layout.setHorizontalGroup(
            pnlDivisor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisor3Layout.createSequentialGroup()
                .addGroup(pnlDivisor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion)
                    .addComponent(lblTagDireccion))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDivisor3Layout.setVerticalGroup(
            pnlDivisor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTagDireccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Teléfonos:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Correo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Dirección:");

        lblApellidos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblApellidos.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnlFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres)
                    .addComponent(lblApellidos))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlDivisor2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDivisor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDivisor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellidos))
                    .addComponent(pnlFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDivisor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDivisor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
            ContactApp.CambiarFormulario(this, new FrmEditarContacto( id_contact, id_number));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
            con.Desconectar();        
            ContactApp.CambiarFormulario(this, new FrmPrincipal());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        try{
            con.Desconectar();        
            ContactApp.CambiarFormulario(this, new FrmPrincipal());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnVolverActionPerformed
    
    public void ObtenerDatos(){
        try{
            stmt = reg.createStatement();
            ResultSet rs = stmt.executeQuery("CALL select_contact (" + id_contact + ");");
            while(rs.next()){
                Statement stmt2 = reg.createStatement();
                ResultSet rs2 = stmt2.executeQuery("CALL select_numbers_emails_address (" + rs.getInt("id_contact") + ");");
                while(rs2.next()){
                    lblNombres.setText(rs.getString("name") + " " + rs.getString("second_name"));
                    lblApellidos.setText(rs.getString("last_name") + " " + rs.getString("second_last_name"));
                    if("Personal".equals(rs2.getString("tag_numbers"))){
                        lblTelefonoPersonal.setText(rs2.getString("number"));
                        lblTagTelefonoPersonal.setText(rs2.getString("tag_numbers"));
                    }
                    if("Laboral".equals(rs2.getString("tag_numbers"))){
                        if(!"".equals(rs2.getString("number"))){
                            lblTelefonoOpcional.setText(rs2.getString("number"));
                            lblTagTelefonoOpcional.setText(rs2.getString("tag_numbers"));                                                
                        }else{
                            lblTelefonoOpcional.setText("");
                            lblTagTelefonoOpcional.setText("");
                        }                        
                    }
                    if(!"".equals(rs2.getString("email"))){
                        lblCorreo.setText(rs2.getString("email"));
                        lblTagCorreo.setText(rs2.getString("tag_emails"));
                    }else{
                        lblCorreo.setText("");
                        lblTagCorreo.setText("");
                    }
                    if(!"".equals(rs2.getString("address"))){
                        lblDireccion.setText(rs2.getString("address"));
                        lblTagDireccion.setText(rs2.getString("tag_address"));
                    }else{
                        lblDireccion.setText("");
                        lblTagDireccion.setText("");
                    }
                }
//                pnlDivisor.setPreferredSize(new Dimension(280, 116));
                rs2.close();
                stmt2.close();
            }
        }catch(SQLException e){
            System.out.println(e);
        }
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
            java.util.logging.Logger.getLogger(FrmDetalleContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new FrmDetalleContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTagCorreo;
    private javax.swing.JLabel lblTagDireccion;
    private javax.swing.JLabel lblTagTelefonoOpcional;
    private javax.swing.JLabel lblTagTelefonoPersonal;
    private javax.swing.JLabel lblTelefonoOpcional;
    private javax.swing.JLabel lblTelefonoPersonal;
    private javax.swing.JPanel pnlDivisor;
    private javax.swing.JPanel pnlDivisor2;
    private javax.swing.JPanel pnlDivisor3;
    private javax.swing.JPanel pnlFotoUsuario;
    // End of variables declaration//GEN-END:variables
}
