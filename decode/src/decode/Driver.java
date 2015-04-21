package decode;


	import java.util.Scanner;




	public class Driver {
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
		                  ShuffleCipherr shu = new ShuffleCipherr(n);
		                  encodedMsg = shu.encode(text);
		                  System.out.println("Encoded Message: " + encodedMsg);
		                 
		              
		             
		          
			              System.out.print("Enter text to be decode: ");
			              text = input.nextLine();
			              String decodedMsg = "";

			      
			                  System.out.print("Enter shift value: ");
			                  n = input.nextInt();
			                  input.nextLine();
			                  SubstitutionCipher sub2 = new SubstitutionCipher(n);
			                  decodedMsg = sub2.decode(text);
			                  System.out.println("Decoded Message: " + decodedMsg);
			              
			                  System.out.print("Enter number of shuffles: ");
			                  n = input.nextInt();
			                  input.nextLine();
			                  ShuffleCipherr shu2 = new ShuffleCipherr(n);
			                  decodedMsg = shu2.decode(text);
			                  System.out.println("Encode Message: " + decodedMsg);
			                  
			               } 
			      
			  
			} 


