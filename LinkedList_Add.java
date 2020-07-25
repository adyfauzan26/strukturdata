/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strukturdata;

import java.util.LinkedList;

/**
 *
 * @author adyfa
 */
public class LinkedList_Add {
      public static void main(String args[]) { 
  
    
      LinkedList list = new LinkedList(); 
        
      list.add("Tomat"); 
      list.add("Kol"); 
      list.add("Jambu"); 
      list.add("10"); 
      list.add("20"); 
  
  
      System.out.println("Daftar Buah" + list); 
  
     
      list.add("Last"); 
      list.add("Element"); 
  
      // printing the new list 
      System.out.println("Daftar Buah Baru:" + list); 
   } 

}
