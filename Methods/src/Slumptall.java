/**
 * This program generates a chosen number of random numbers and sorts them into even and odd
 * @author Carl johan Engene, cajo0250
 */
import java.util.Scanner;

public class Slumptall {
	
	public static void main(String[] args) {
		int currentSize = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of random numbers: ");
		int rand = scan.nextInt();
		int[] a = new int[rand];
		for(int i = 0; i < rand; i++) {
			a[i] = (int)(Math.random()*1000 - 1);
		}
		//printing the random numbers
		System.out.println("Here are the random numbers:");
		for(int myNum : a){
			System.out.print(myNum + " ");
		}
		//creating a new array of same length for ordering the numbers
		int[] arrayOrdered = new int[rand];
		//copying the even numbers to the new array
		for(int i = 0; i < rand; i++){
			if(a[i] % 2 == 0){
				arrayOrdered[currentSize] = a[i];
				currentSize++;
			}
		}
		//assigning the number of even and odd numbers to variables
		int noEven = currentSize;
		int nuOdd = rand - currentSize;
		
		//printing the even numbers first
		System.out.println("\n\nHere are the random numbers sorted: ");
		for(int i = 0; i < currentSize; i++){
			System.out.print(arrayOrdered[i] + "  ");
		}
		//followed by a separator
		System.out.print("|  ");
		
		//copying the odd numbers thats left in the first array into the ordered array	
		for(int i = 0; i < rand; i++){
			if(a[i] % 2 != 0){
				arrayOrdered[currentSize] = a[i];
				System.out.print(arrayOrdered[currentSize] + " ");
				currentSize++;
			}
		}
		System.out.println("\n\nEven Numbers: " + noEven);
		System.out.println("Odd Numbers: " + nuOdd);
		scan.close();
	}
}

