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
public class LinkedList_Remove {
    public static void main(String args[]) 
    { 
  
        // Creating an empty LinkedList 
        LinkedList<String> list = new LinkedList<>(); 
  
        // Using add() method to add elements in the list 
        list.add("Tomat"); 
        list.add("Kol"); 
        list.add("Jambu"); 
        list.add("10"); 
        list.add("20"); 
  
        // Output the list 
        System.out.println("LinkedList:" + list); 
  
        // Remove the head using remove() 
        list.remove(); 
  
        // Print the final list 
        System.out.println("Final LinkedList:" + list); 
    } 
} 
   
    
