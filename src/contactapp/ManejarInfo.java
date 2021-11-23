/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactapp;

import contactapp.Formularios.FrmInfoModelo;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author danie
 */
public class ManejarInfo {
    
    static public ManageInfo numbers;
    static public ManageInfo emails;
    static public JPanel top;
    static public JPanel bottom;
    static public JPanel mainPanel;
    
    static public void ListarUsuarios(JPanel panel, ArrayList<Item> List, int height, ManageInfo listIndex){
        System.out.println(List);
        int cont = 0;
        LimpearUsuarios(panel);
        for(int i = 0; i < List.size(); i++){
            System.out.println(List.get(i).getValue());
            ShowPanel(panel, new FrmInfoModelo(List.get(i).getValue(), List.get(i).getTag(), i, listIndex), 0, 55 * i);
            cont++;
        }
        ShowPanel(panel, new JPanel(), 0, 1 * cont);
        panel.setLocation(height, 0);
        panel.setPreferredSize(new Dimension(300, 55 * cont));
    }
    
    static public void LimpearUsuarios(JPanel panel){
        panel.removeAll();
    }
    
    static public void ListarInfo(){
        ListarUsuarios(top, numbers.getList(), 0, numbers);
        ListarUsuarios(bottom, emails.getList(), numbers.getSize() * 55, emails);
        mainPanel.setLocation(0, 0);
        mainPanel.setPreferredSize(new Dimension(300,((numbers.getSize() * 55) + emails.getSize() * 55)));
    }
    
    static public void ShowPanel(JPanel panel, JPanel p, int x, int y){
        p.setSize(300, 55);
        p.setLocation(x, y);
        panel.add(p, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }
}
