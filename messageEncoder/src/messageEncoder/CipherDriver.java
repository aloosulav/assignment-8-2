package messageEncoder;
import java.util.Scanner;


public class CipherDriver {
	 public static void main(String[] args) {
	    
	      Scanner input = new Scanner(System.in);

	              System.out.print("Enter text to be encode: ");
	              String text = input.nextLine();
	              String encodedMsg = "";
	              int n;
				
	                  System.out.print("Enter shift value: ");
	                  n = input.nextInt();
	                  input.nextLine();
	                  SubstitutionCipher sub = new SubstitutionCipher(n);
	                  encodedMsg = sub.encode(text);
	                  System.out.println("Encoded Message: " + encodedMsg);
	                  
	                  System.out.print("Enter number of shuffles: ");
	                  n = input.nextInt();
	                  input.nextLine();
	                  ShuffleCipher shu = new ShuffleCipher(n);
	                  encodedMsg = shu.encode(text);
	                  System.out.println("Encoded Message: " + encodedMsg);
	                 
	              
	             
	          } 
	     
	  
}
