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
public class Softwarephase3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      User U = new User();
      // Manager_User MU = new Manager_User();
   Scanner input=new Scanner(System.in);
   while(true)
   {
      // System.out.println(U.Register.getClass());
   System.out.println("1-Register\n2-Log-in\n3-Exit\n");
   System.out.println("\nEnter number of your choice\n");
        int n=input.nextInt();
        if (n==1)
           U.register();
         else if (n==2)
        U.Log_in();
          else if (n==3)
            break;
    }



   }
}