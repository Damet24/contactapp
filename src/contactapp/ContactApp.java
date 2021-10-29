package contactapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ContactApp {

    static public void ConfirmarSalir(JFrame rootPane){        
        int Opcion = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(Opcion == JOptionPane.YES_OPTION){
            rootPane.dispose();
        }
    }
    
}
