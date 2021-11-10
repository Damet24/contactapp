package contactapp;

import javax.swing.*;

public class ContactApp {

    static public void ConfirmarSalir(JFrame rootPane){        
        int Opcion = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(Opcion == JOptionPane.YES_OPTION){
            rootPane.dispose();
        }
    }
    
    static public void CambiarFormulario(JFrame actual, JFrame siguiente){
        siguiente.setVisible(true);
        actual.dispose();
    }
}
