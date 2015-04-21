package decode;



	public class SubstitutionCipher implements Decoder {
		 
		  
		  private int shiftBy;   
		 
		  
		  public SubstitutionCipher (int shiftBy){
		      this.shiftBy = shiftBy;
		  }
		 
		  
		  private char shift(char ch, int shiftValue){
		      char shiftedChar = ch;       
		      
		      if(ch >= 'a' && ch <= 'z')
		          shiftedChar = (char) ( 'a' + ( ch - 'a' + shiftValue ) %26 );
		     
		      else if(ch >= 'A' && ch <= 'Z')
		          shiftedChar = (char) ( 'A' + ( ch - 'A' + shiftValue ) %26 );
		      return shiftedChar;
		  }
		 
		  
		  public String encode(String plainText){
		      String encodedMsg = "";
		      for( int i = 0; i < plainText.length(); i++){
		          char ch = plainText.charAt(i);
		          encodedMsg += shift(ch, shiftBy);
		      }
		      return encodedMsg;
		  }
		  
		  public String decode(String cipherText){
		      String decodedMsg = "";
		      for( int i = 0; i < cipherText.length(); i++){
		          char ch = cipherText.charAt(i);
		          decodedMsg += shift(ch, -shiftBy);
		      }
		      return decodedMsg;
		  }
		} 

