package authentication;

import java.util.Scanner;
public class authentication{
   public static void main(String[]args){
      String username,password,userEntry,passEntry;
      Scanner key=new Scanner(System.in);
      System.out.println("enter Username");
      username=key.nextLine();
      System.out.println("enter Password");
      password=key.nextLine();
      System.out.println("use your username and password to log in.");
      System.out.println("please enter your username");
      userEntry=key.nextLine();
      System.out.println("please enter your password");
      passEntry=key.nextLine();
      if (userAuthentication(username,userEntry)==true && passAuthentication(password,passEntry)== true){
      System.out.println("Welcome"+" "+userEntry+"!");
      }
      else
      System.out.println("invalid username or password!");
   }
   public static boolean userAuthentication(String name,String Entry){
   
      if (name.equals(Entry)){
        return true;
      }
      else
      return false;     
   }
   public static boolean passAuthentication(String pass,String Entry){
   if(pass.equals(Entry)){
   return true;
   }
   else
   return false;
   }
}