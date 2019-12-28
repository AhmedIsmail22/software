/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarephase3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eslam ismail
 */
public class Group {
    Scanner input=new Scanner(System.in);
  private String Name;
  void setName(String n)
    {
        Name=n;
    }
    ArrayList<Group> G = new ArrayList<>();
    
    
    
   void newgroup(){
       Group g = new Group();
       System.out.println("Enter name of group");
   String name = input.next();
   g.setName(name);
   G.add(g);
   
   }
    void joingroup()
    {   Group g = new Group();
        G.add(g);
        
}



}
