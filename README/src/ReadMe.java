

	import java.io.*;
	public class ReadMe {
	   public static void main(String[] args) throws Exception{
	          RandomAccessFile raf = null;
	          try {
	          raf= new RandomAccessFile("Pledge.txt", "r");
	          raf.seek(123);
	        char arr=(char)raf.readByte();
	           System.out.println("124th cahracter:" + arr);
	           raf.seek(134);
	            arr=(char) raf.readByte();      
	                 System.out.println("135th cahracter:"+ arr);
	      } catch (IOException ex) {
	         ex.printStackTrace();
	      }
	          finally{
	        	  raf.close();
	          }
	   }
	}

