package contactapp.Formularios;

import contactapp.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class FrmDetalleContacto extends javax.swing.JFrame {

    Conector con;
    Statement stmt;
    Connection reg;
    String id_contact, id_number, Nombre;
    Usuario usuario;
    
    public FrmDetalleContacto(Usuario u, String id_contact, String id_number) {
        initComponents();
        pnlDivisor.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        pnlDivisor2.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        pnlDivisor3.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        con = new Conector();
        reg = con.getConector();
        usuario = u;
        this.id_contact = id_contact;
        this.id_number = id_number;
        ObtenerDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFotoUsuario = new Fondo();
        lblNombre = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlDivisor = new javax.swing.JPanel();
        lblTelefonoPersonal = new javax.swing.JLabel();
        lblTagTelefono = new javax.swing.JLabel();
        pnlDivisor2 = new javax.swing.JPanel();
        lblCorreoPersonal = new javax.swing.JLabel();
        lblTagCorreo = new javax.swing.JLabel();
        pnlDivisor3 = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        lblTagDireccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalles del Contacto");
        setResizable(false);

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

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNombre.setText("jLabel1");

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");

        lblTelefonoPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefonoPersonal.setText("jLabel2");

        lblTagTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTagTelefono.setText("jLabel3");

        javax.swing.GroupLayout pnlDivisorLayout = new javax.swing.GroupLayout(pnlDivisor);
        pnlDivisor.setLayout(pnlDivisorLayout);
        pnlDivisorLayout.setHorizontalGroup(
            pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisorLayout.createSequentialGroup()
                .addGroup(pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoPersonal)
                    .addComponent(lblTagTelefono))
                .addGap(0, 0, 0))
        );
        pnlDivisorLayout.setVerticalGroup(
            pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelefonoPersonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTagTelefono)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCorreoPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCorreoPersonal.setText("jLabel4");

        lblTagCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTagCorreo.setText("jLabel5");

        javax.swing.GroupLayout pnlDivisor2Layout = new javax.swing.GroupLayout(pnlDivisor2);
        pnlDivisor2.setLayout(pnlDivisor2Layout);
        pnlDivisor2Layout.setHorizontalGroup(
            pnlDivisor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisor2Layout.createSequentialGroup()
                .addGroup(pnlDivisor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreoPersonal)
                    .addComponent(lblTagCorreo))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDivisor2Layout.setVerticalGroup(
            pnlDivisor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCorreoPersonal)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(lblNombre)
                .addGap(274, 274, 274))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnlFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDivisor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDivisor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNombre)
                    .addComponent(pnlFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(pnlDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pnlDivisor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDivisor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ContactApp.CambiarFormulario(this, new FrmEditarContacto(usuario, id_contact, id_number));
    }//GEN-LAST:event_btnEditarActionPerformed

    class Fondo extends JPanel {
        private Image Imagen;        
        @Override
        public void paint(Graphics g){
            Imagen = new ImageIcon(getClass().getResource("/Imagenes/user.png")).getImage();
            g.drawImage(Imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
    public void ObtenerDatos(){
        try{
            stmt = reg.createStatement();
            ResultSet rs = stmt.executeQuery("CALL select_contacts (" + id_contact + ");");
            while(rs.next()){
                Statement stmt2 = reg.createStatement();
                ResultSet rs2 = stmt2.executeQuery("CALL select_numbers_emails_address (" + rs.getString("id_contact") + ");");
                if(rs2.next()){
                    Nombre = rs.getString("name") + " " + rs.getString("last_name");
                    lblNombre.setText(Nombre);
                    lblTelefonoPersonal.setText(rs2.getString("number"));
                    lblTagTelefono.setText(rs2.getString("tag_number"));
                    lblCorreoPersonal.setText(rs2.getString("email"));
                    lblTagCorreo.setText(rs2.getString("tag_email"));
                    lblDireccion.setText(rs2.getString("address"));
                    lblTagDireccion.setText(rs2.getString("tag_address"));
                }
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblCorreoPersonal;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTagCorreo;
    private javax.swing.JLabel lblTagDireccion;
    private javax.swing.JLabel lblTagTelefono;
    private javax.swing.JLabel lblTelefonoPersonal;
    private javax.swing.JPanel pnlDivisor;
    private javax.swing.JPanel pnlDivisor2;
    private javax.swing.JPanel pnlDivisor3;
    private javax.swing.JPanel pnlFotoUsuario;
    // End of variables declaration//GEN-END:variables
}
