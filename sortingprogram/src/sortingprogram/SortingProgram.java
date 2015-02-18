package sortingprogram;
import java.util.Scanner;
public class SortingProgram {
	/*.
	Write an application to read any number of input (maximum is 50) for any order of number. The application will sort the number by ascending and descending and display both outputs.

	Create a method for ascending                      5

	Create a method for descending                        5

	Use Array and accept any number of input         2

	Write your own sort                                        10

	Correct output for ascending and descending     3
	*/
	
	

		public static void main(String[] args) {
			
	      mySortingProgram call=new mySortingProgram();
	Scanner key=new Scanner(System.in);
	double numbers[]=new double [50];
	int i=0;String s1="n",s2="n";double a;
	System.out.println("enter your numbers(up to 50 numbers acceptable). enter 0 when you are done");
	do{
		System.out.println("enter numbers");
	 a=key.nextDouble();
	numbers[i]=a;
	i=i+1;
	}while (a!=0);
	i=i-1;
	System.out.println("Sorting the numbers in ascending order:");
	call.ascending(numbers,i);

	System.out.println("Sorting the numbers in descending order:");
	call.descending(numbers,i);
		}
	}


