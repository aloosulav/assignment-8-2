package myVendingmachine;
/*vending machine program
enters money and returns change in coins with variations of loop
*/
import java.util.Scanner;
public class myVendingmachine{
   public static void main (String[]args){
      Scanner key=new Scanner(System.in);
      int choice=0;double money=0;double j;String s1= "yes";
      
      System.out.println(" welcome to the vending machine");
      System.out.println("1.chips  $1.06"+"\n"+"2.drink $2.04"+"\n"+"3.nutrition bar $2.05"+"\n"+"4.mints $3.75"+"\n"+"5.chocolate $2.29 ");
          
      do{
       
         System.out.println(" insert money in 1s , 5s,or coins; press 0 when done");
         j=key.nextDouble()*100;  //due to addition error in java multiplying by 100 then dividing later on
          
         if (j==500||j==100||j==25||j==10||j==5||j==1||j==0){
                
            money=money+j;
            
         }
         else{
            System.out.println("INVALID ENTRY ");
         }
        
      }while (j!=0);
      
      money=money/100;
      System.out.println(money+"  dollars inserted");
      do{
         System.out.println("select item to dispense"+"\n"+"enter 0 to Cancel");
         choice=key.nextInt();
         switch (choice){
            case 1:
               if (money>=1.06){
                  System.out.println("vending chips...");
                  money=money-1.06;
               }
               else
                  System.out.println("insufficient funds");
               break;
          
            case 2:
               if (money>=2.04){
                  System.out.println("vending drinks...");
                  money=money-2.04;
               }
               else
                  System.out.println("insufficient funds");
               break;
                
            case 3:
               if (money>=2.5){
                  System.out.println("vending nutrition bar...");
                  money=money-2.5;
               }
               else
                  System.out.println("insufficient funds");
               break;
            case 4:
               if (money>=3.75){
                  System.out.println("vending mints...");
                  money=money-3.75;
               }
               else
                  System.out.println("insufficient funds");
               break;
            case 5:
               if (money>=2.29){
                  System.out.println("vending chocolate...");
                  money=money-2.29;
               }
               else
                  System.out.println("insufficient funds");
               break;
            case 0:
            
               break;
         }
        money =money*100;
        money=money/100;
         System.out.println("your balance is:"+money);
         System.out.println("Do you wish to make another selection? (yes/no)");
         s1= key.next();
        
      }while(s1.equals("yes"));       
             
      double q,d,n,p;
      
      money=money*100;
      q= money/25;
      money=money%25;
      d=money/10;
      money=money%10;
      n=money/5;
      money=money%5;
      p=money;
      System.out.println("YOUR CHANGE IS:");
      System.out.println((int)q+" :quarters "+"\n"+(int)d+" :dimes"+"\n"+(int)n+" :nickels "+"\n"+(int)p+" :pennies");
   }
}