package fraction;


	import java.io.BufferedOutputStream;
	 import java.io.FileOutputStream;
	 import java.io.ObjectOutput;
	 import java.io.ObjectOutputStream;
	 import java.io.OutputStream;

	 public class FractionDriver {

	   public static void main(String[] args) {

	       try {

	           Fraction[] fractions = new Fraction[3];
	            OutputStream file = new FileOutputStream("SerialF.dat");
	            OutputStream buffer = new BufferedOutputStream(file);
	            ObjectOutput output = new ObjectOutputStream(buffer);

	           for (int i = 0; i < 3; i++) {
	                fractions[i] = new Fraction(10, 20);
	                output.writeObject(fractions[i]);
	            }
	           
	            output.close();
	           
	            System.out.println("Writing Fraction obejects to SerialF.dat is completed");

	       } catch (Exception e) {
	            System.out.println("Exception occured:" + e);
	        }

	   }

	}


