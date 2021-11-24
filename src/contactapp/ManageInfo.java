/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactapp;

import java.util.ArrayList;

public class ManageInfo {
    private ArrayList<Item> List;
    
    public ManageInfo(){
        List = new ArrayList();
    }
    
    public void Add(String value, String tag){
        List.add(new Item(value, tag));
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
