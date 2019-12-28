/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarephase3;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Eslam ismail
 */
public class Friend {
    Scanner input=new Scanner(System.in);
   /* private String Name;
    private String Password;
     private String Email;
     int FID;*/
    
  public String FName;

  private String FEmail;

  private float FAge;

  private String FPassword;

  private int FPhone;

  public String FID = null;
  public User UFID;
   ArrayList<Friend> myfrinds=new ArrayList<>();

   public void sendrequest(String N) {
       System.out.println("Enter name of friend who you want add him\n");
                       N = input.next();
  }

  public void deletefriend() {
  }

  public void Acceptfriend(String N) {
      Friend f = new Friend();
      
    
     for(int i = 0 ; i< myfrinds.size()+1 ; i++)
         
     { System.out.println("You have a friend request from  " + N);
         String z = input.next();
        
         /*if(N.equals(myfrinds.get(i).FID))
             System.out.println("noooooooooooooooo");*/
          if(z.equals("accept"))
         {System.out.println("you and " + N + " became friends" );
         
         
  }
  }
  }

  public void Showfrinds() {
  }

     void addfrind (){
         User U = new User();
        
         
     System.out.println("Are you want add frint ");
    
                        
     
     
     
     }
    
    
    
}
