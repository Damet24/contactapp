package contactapp.Formularios;

import contactapp.*;
import java.awt.*;
import java.sql.*;
import javax.swing.JPanel;

public class FrmPrincipal extends javax.swing.JFrame {

    Conector con;
    Statement stmt;
    Connection reg;
    Usuario usuario;
    int cont = 0;
    
    public FrmPrincipal(Usuario u) {
        initComponents();
        con = new Conector();
        reg = con.getConector();
        usuario = u;
        txtBuscar.setText("");
        ListarUsuarios();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevoContacto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        VerReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(243, 248, 255));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.setText("jTextField1");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevoContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevoContacto.setText("Nuevo Contacto");
        btnNuevoContacto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoContactoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnNuevoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jScrollPane1.setBorder(null);

        MainPane.setPreferredSize(new java.awt.Dimension(808, 484));

        javax.swing.GroupLayout MainPaneLayout = new javax.swing.GroupLayout(MainPane);
        MainPane.setLayout(MainPaneLayout);
        MainPaneLayout.setHorizontalGroup(
            MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        MainPaneLayout.setVerticalGroup(
            MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(MainPane);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad de contactos  — ");

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo contacto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cerrar sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");

        jMenuItem4.setText("Información del programa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");

        VerReporte.setText("Ver reporte");
        VerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerReporteActionPerformed(evt);
            }
        });
        jMenu3.add(VerReporte);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCantidad))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ContactApp.ConfirmarSalir(this);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ContactApp.ConfirmarSalir(this);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnNuevoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoContactoActionPerformed
        con.Desconectar();
        ContactApp.CambiarFormulario(this, new FrmCrearContacto(usuario));
    }//GEN-LAST:event_btnNuevoContactoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        con.Desconectar();
        ContactApp.CambiarFormulario(this, new FrmIngresar());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        con.Desconectar();
        ContactApp.CambiarFormulario(this, new FrmCrearContacto(usuario));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            stmt = reg.createStatement();
            ResultSet rs = stmt.executeQuery("CALL search_contact ('%" + txtBuscar.getText() + "%', " + usuario.getId() + ");");
            LimpearUsuarios();
            cont = 0;
            while(rs.next()){
                Statement stmt2 = reg.createStatement();
                ResultSet rs2 = stmt2.executeQuery("SELECT * FROM `numbers` where fk_contact = " + rs.getString("id_contact") + ";");
                if(rs2.next()){
                    ShowPanel(new FrmContactoModelo(rs.getString("name") + " " + rs.getString("last_name"), rs2.getString("number"),rs.getString("id_contact"), rs2.getString("id_number"), usuario, this), 0, 100 * cont);
                }
                else ShowPanel(new FrmContactoModelo(rs.getString("name") + " " + rs.getString("last_name"), rs2.getString("number"),rs.getString("id_contact"), rs2.getString("id_number"), usuario, this), 0, 100 * cont);
                rs2.close();
                stmt2.close();
                cont++;      
            }
            ShowPanel(new JPanel(), 0, 100 * cont);
            MainPane.setPreferredSize(new Dimension(700, 100 * cont));
            CantidadContactos();
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void VerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerReporteActionPerformed
        con.Desconectar();
        ContactApp.CambiarFormulario(this, new FrmReporte(usuario));
    }//GEN-LAST:event_VerReporteActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmAcercaDe form = new FrmAcercaDe();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

     public void ListarUsuarios(){
        try{
            stmt = reg.createStatement(); 
            ResultSet rs = stmt.executeQuery("CALL select_contacts(" + usuario.getId() + ");");
            cont = 0;
            LimpearUsuarios();
            while(rs.next()){
                Statement stmt2 = reg.createStatement();
                ResultSet rs2 = stmt2.executeQuery("SELECT * FROM `numbers` where fk_contact = " + rs.getString("id_contact") + ";");
                if(rs2.next()){
                    ShowPanel(new FrmContactoModelo(rs.getString("name") + " " + rs.getString("last_name"), rs2.getString("number"),rs.getString("id_contact"), rs2.getString("id_number"), usuario, this), 0, 100 * cont);
                }
                else ShowPanel(new FrmContactoModelo(rs.getString("name") + " " + rs.getString("last_name"), rs2.getString("number"),rs.getString("id_contact"), rs2.getString("id_number"), usuario, this), 0, 100 * cont);
                rs2.close();
                stmt2.close();
                cont++;
            }
            ShowPanel(new JPanel(), 0, 100 * cont);
            MainPane.setPreferredSize(new Dimension(700, 100 * cont));
            CantidadContactos();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void ShowPanel(JPanel p, int x, int y){
        p.setSize(798, 100);
        p.setLocation(x, y);
        MainPane.add(p, BorderLayout.CENTER);
        MainPane.revalidate();
        MainPane.repaint();
    }
    
    public void CantidadContactos(){
        try{
            stmt = reg.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT amount_contacts(" + usuario.getId() + ") as amount;");
            while(rs.next()){
                lblCantidad.setText(rs.getString("amount"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void EliminarUsuario(String id){
        try{
            stmt = reg.createStatement();
            stmt.execute("DELETE FROM `contacts` WHERE `contacts`.`id_contact` = " + id);
            ListarUsuarios();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void LimpearUsuarios(){
        MainPane.removeAll();
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPane;
    private javax.swing.JMenuItem VerReporte;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevoContacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
