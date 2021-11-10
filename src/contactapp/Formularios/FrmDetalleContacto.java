package contactapp.Formularios;

import java.awt.Color;
import javax.swing.BorderFactory;
import contactapp.*;
import java.sql.*;

public class FrmDetalleContacto extends javax.swing.JFrame {

    Conector con;
    Statement stmt;
    Connection reg;
    String Nombre, SegundoNombre, Apellido, SegundoApellido, TelefonoPersonal, CorreoPersonal, TagCorreo, TagTelefono, NombreCompleto;
    
    public FrmDetalleContacto() {
        initComponents();
        pnlDivisor.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        pnlDivisor2.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        pnlDivisor3.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        con = new Conector();
        reg = con.getConector();
        lblTelefonoOpcional.setText("");
        lblTagTelefonoOpcional.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlDivisor = new javax.swing.JPanel();
        lblTelefonoPersonal = new javax.swing.JLabel();
        lblTagTelefono = new javax.swing.JLabel();
        lblTelefonoOpcional = new javax.swing.JLabel();
        lblTagTelefonoOpcional = new javax.swing.JLabel();
        pnlDivisor2 = new javax.swing.JPanel();
        lblCorreoPersonal = new javax.swing.JLabel();
        lblTagCorreo = new javax.swing.JLabel();
        pnlDivisor3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalles del Contacto");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNombre.setText("jLabel1");

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setText("Editar");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");

        lblTelefonoPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefonoPersonal.setText("jLabel2");

        lblTagTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTagTelefono.setText("jLabel3");

        lblTelefonoOpcional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefonoOpcional.setText("jLabel6");

        lblTagTelefonoOpcional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTagTelefonoOpcional.setText("jLabel7");

        javax.swing.GroupLayout pnlDivisorLayout = new javax.swing.GroupLayout(pnlDivisor);
        pnlDivisor.setLayout(pnlDivisorLayout);
        pnlDivisorLayout.setHorizontalGroup(
            pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisorLayout.createSequentialGroup()
                .addGroup(pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoPersonal)
                    .addComponent(lblTagTelefono)
                    .addComponent(lblTelefonoOpcional)
                    .addComponent(lblTagTelefonoOpcional))
                .addGap(0, 0, 0))
        );
        pnlDivisorLayout.setVerticalGroup(
            pnlDivisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelefonoPersonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTagTelefono)
                .addGap(10, 10, 10)
                .addComponent(lblTelefonoOpcional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTagTelefonoOpcional)
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout pnlDivisor3Layout = new javax.swing.GroupLayout(pnlDivisor3);
        pnlDivisor3.setLayout(pnlDivisor3Layout);
        pnlDivisor3Layout.setHorizontalGroup(
            pnlDivisor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisor3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDivisor3Layout.setVerticalGroup(
            pnlDivisor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDivisor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlDivisor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDivisor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNombre)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(pnlDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDivisor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDivisor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void ObtenerDatos(){
        try{
            int idContact = 1;
            String sql1 = "select * from contacts where id_contact = " + idContact + " limit 1;";
            String sql2 = "select * from numbers where fk_contact = " + idContact + " limit 1;";
            String sql3 = "select * from emails where fk_contact = " + idContact + " limit 1;";             
            stmt = reg.createStatement();            
            ResultSet rs1 = stmt.executeQuery(sql1);
            // contactos
            while(rs1.next()){
                Nombre = rs1.getString("name");
                SegundoNombre = rs1.getString("second_name");
                Apellido = rs1.getString("last_name");
                SegundoApellido = rs1.getString("second_last_name");                
            }
            stmt = reg.createStatement();            
            ResultSet rs2 = stmt.executeQuery(sql2);
            // numeros
            while(rs2.next()){
                TelefonoPersonal = rs2.getString("number");
                TagTelefono = rs2.getString("tag");                   
            }
            stmt = reg.createStatement();            
            ResultSet rs3 = stmt.executeQuery(sql3);                       
            // correos
            while(rs3.next()){
                CorreoPersonal = rs3.getString("email");
                TagCorreo = rs3.getString("tag");                
            }
            MostrarDatos();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
        
    public void MostrarDatos(){
        try{
            NombreCompleto = Nombre + " " + Apellido;
            lblNombre.setText(NombreCompleto);
            lblTelefonoPersonal.setText(TelefonoPersonal);
            lblTagTelefono.setText(TagTelefono);
            lblCorreoPersonal.setText(CorreoPersonal);
            lblTagCorreo.setText(TagCorreo);
        }catch(Exception e){
            System.out.println(e.getMessage());
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
                new FrmDetalleContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreoPersonal;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTagCorreo;
    private javax.swing.JLabel lblTagTelefono;
    private javax.swing.JLabel lblTagTelefonoOpcional;
    private javax.swing.JLabel lblTelefonoOpcional;
    private javax.swing.JLabel lblTelefonoPersonal;
    private javax.swing.JPanel pnlDivisor;
    private javax.swing.JPanel pnlDivisor2;
    private javax.swing.JPanel pnlDivisor3;
    // End of variables declaration//GEN-END:variables
}
