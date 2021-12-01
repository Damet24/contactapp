package contactapp.Formularios;

import java.awt.*;
import javax.swing.*;
import contactapp.*;

public class FrmContactoModelo extends javax.swing.JPanel {
    
    String id_contact, id_number;
    Usuario usuario;
    FrmPrincipal root;
    
    public FrmContactoModelo(String nombre, String numero, String id_contact, String id_number, Usuario u, FrmPrincipal root) {
        initComponents();
        lblNombre.setText(nombre);
        lblNumero.setText(numero);
        this.id_contact = id_contact;
        this.id_number = id_number;
        usuario = u;
        this.root = root;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        pnlFotoUsuario = new Fondo();
        lblNombre = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnDetalles1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(808, 100));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDetalles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDetalles.setText("Detalles");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFotoUsuarioLayout = new javax.swing.GroupLayout(pnlFotoUsuario);
        pnlFotoUsuario.setLayout(pnlFotoUsuarioLayout);
        pnlFotoUsuarioLayout.setHorizontalGroup(
            pnlFotoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );
        pnlFotoUsuarioLayout.setVerticalGroup(
            pnlFotoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("jLabel1");

        lblNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumero.setText("jLabel2");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnDetalles1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDetalles1.setText("Compartir");
        btnDetalles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalles1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(btnDetalles1)
                .addGap(10, 10, 10)
                .addComponent(btnDetalles)
                .addGap(10, 10, 10)
                .addComponent(btnEliminar)
                .addGap(10, 10, 10)
                .addComponent(btnEditar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblNombre)
                        .addGap(10, 10, 10)
                        .addComponent(lblNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnEditar)
                            .addComponent(btnDetalles)
                            .addComponent(btnDetalles1))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{           
            ContactApp.CambiarFormulario(root, new FrmEditarContacto(usuario, id_contact, id_number));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int Opcion = JOptionPane.showConfirmDialog(root, "¿Seguro que quieres eliminar este contacto?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(Opcion == JOptionPane.YES_OPTION){
            root.EliminarUsuario(id_contact + "");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        try{           
            ContactApp.CambiarFormulario(root, new FrmDetalleContacto(usuario, id_contact, id_number));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void btnDetalles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetalles1ActionPerformed
    
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnDetalles1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JPanel pnlFotoUsuario;
    // End of variables declaration//GEN-END:variables
}
