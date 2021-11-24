/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactapp;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ManageInfo {
    private ArrayList<Item> List;
    
    public ManageInfo(){
        List = new ArrayList();
    }
    
    public void Add(String value, String tag){
        System.out.println(List);
    }
    
    public void Del(int index){
        List.remove(index);
    }
    
    public ArrayList<Item> getList(){
        return List;
    }
    
    public int getSize(){
        return List.size();
    }
}
