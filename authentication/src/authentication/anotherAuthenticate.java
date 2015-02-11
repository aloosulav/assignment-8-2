package authentication;


	import javax.swing.JOptionPane;
	import java.util.Scanner;
	public class anotherAuthenticate {
	public static void main(String[]args){
	String userName,password,userEntry,passEntry;
	Authentication call=new Authentication();
	Scanner key =new Scanner(System.in);
	userName=JOptionPane.showInputDialog(null,"Create your Username");
	password=JOptionPane.showInputDialog(null,"Create your Password");;
	JOptionPane.showMessageDialog(null,"Sign up successful! Please use your username and password to log in  ");
	userEntry=JOptionPane.showInputDialog(null,"Enter your Username");
	passEntry=JOptionPane.showInputDialog(null,"Enter your Password");
	if (call.userAuthentication(userName, userEntry)== true && call.passAuthentication(password,passEntry)==true){
	JOptionPane.showMessageDialog(null,"Log in successful! Welcome "+userEntry);
	}
	else
	JOptionPane.showMessageDialog(null,"Invalid username or password! ");

	}
	}


