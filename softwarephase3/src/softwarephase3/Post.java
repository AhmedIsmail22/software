/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarephase3;

import java.util.ArrayList;
import java.util.Scanner;
public class Post {

  private String postid;

  private String postcontent;

  private String post_date;

  private String commentpost;

  public String post_privacy;

    public User myUser;
    /**
   * 
   * @element-type Group
   */
  public ArrayList<Group> groups;
   
    /**
   * 
   * @element-type Comment
   */
  public ArrayList<Comment>  myComment;
   
  public User User;
  /**
   * 
   * @element-type Like
   */
  public ArrayList  myLike;
    /**
   * 
   * @element-type Comment
   */
  public ArrayList<Comment> Comment;
    public User U;
    /**
   * 
   * @element-type Like
   */
  public ArrayList<Like> Like;
    /**
   * 
   * @element-type Share
   */
  public ArrayList<Share>  myShare;

  private String writepost() {
  return null;
  }

  private void displaypost() {
  }

  private void deletepost() {
  }

  private void uploadcontent() {
  }

}
/**
 *
 * @author Eslam ismail
 */
/*public class Post1 {
    String date;
    User u = new User();
    void displaypost(){
    Scanner input=new Scanner(System.in);
    System.out.print("\nWrite your Post \n\n\n");
    String content = input.next();
        String n = u.name;
        System.out.println(n);
        System.out.println();
        System.out.println(content);
        System.out.println();
       
    
    
    }
    
}*/
