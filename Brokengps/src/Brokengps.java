/*program to calculate distance between initial point (0,0) and final location 
after driving for an hour with a constant speed of 60 miles per hour.
changin direction every 5 mins which is every 5 miles.looping the process for 12 
times since 12*5=60 */

public class Brokengps{
public static void main (String[]args){
int number, x=0, y=0;  // create variables
for (int i=0;i<=12;i++){  // loop for 12 times because each loop signifies 5 miles
number=(int)(4.0*Math.random())+1;  //randomly select a direction
switch (number)   
{
case 1:
x=x+5;//adding 5 miles at each loop ; 5 miles travelled in 5 min when driving at 60 miles per hour
break;  
case 2:
y=y+5;
break;
case 3:
x=x-5;
break;
case 4: 
y=y-5;
break;
}
}
System.out.println("the final location is:("+x+","+y+") after an hour of driving. ");
double distance = Math.pow((Math.pow(x,2)+Math.pow(y,2)),0.5);//calculate distance from initial point
System.out.print("the distance between initial point(0,0) and the final location is :" +(distance));
}
}