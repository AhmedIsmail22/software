/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarephase3;

import java.util.ArrayList;
import java.util.Vector;
import static jdk.nashorn.internal.objects.NativeJava.type;
import static org.omg.CORBA.AnySeqHelper.type;

public class Message {

  public User sender;

  public User reciver;

  public String message;

  
    /**
   * 
   * @element-type User
   */
  public ArrayList<User>  myUser;
 
  

  public void sendmessage() {
  }

  public void readmessage() {
  }

}
