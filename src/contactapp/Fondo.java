package contactapp;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel {
    private Image Imagen;        
    @Override
    public void paint(Graphics g){
        Imagen = new ImageIcon(getClass().getResource("/Imagenes/user.png")).getImage();
        g.drawImage(Imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}