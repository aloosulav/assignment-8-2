package messageEncoder;



public class ShuffleCipher implements MessageEncode {
		 
		  
		  private int n;
		 
		  
		  public ShuffleCipher (int n){
		      this.n = n;
		  }
		 
		  
		  private String shuffle(String text){
		     
		      int mid;
		      if (text.length() % 2 == 0)
		          mid = text.length()/2;
		      else
		          mid = (text.length()+1)/2;
		      
		      String first = text.substring(0, mid);
		      
		      String second = text.substring(mid);
		     
		      String shuffled = "";
		     
		      for(int i=0, j=0 ;i < first.length(); i++, j++)
		      {
		          shuffled += first.charAt(i);
		          if(j < second.length())
		              shuffled += second.charAt(i);           
		      }
		     
		      return shuffled;
		  }

		@Override
		
		public String encode(String plainText){
		      String encodedMsg = plainText;
		      for(int i=0;i<n;i++)
		          encodedMsg = shuffle(encodedMsg);
		      return encodedMsg;
		  }
		 
}
