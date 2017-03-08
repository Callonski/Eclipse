/**
 * This class will print out triangles of versals
 * after you enter side-length and orientation.
 * @author Carl johan Engene, cajo0250
 */
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		int letterLength, angel, i, j, k;
		Scanner scan = new Scanner(System.in);
		//I choose a do-while-loop to get back to the start after the triangle-print
		
		do{
			System.out.print("Enter the length of the 2 equaly long sides (to EXIT enter: -1): ");
			letterLength = scan.nextInt();
		
			//I do not want any negative numbers, so the loops will only start on positive numbers
			if(letterLength >= 0 && letterLength != -1){ 
				System.out.print("Perpendicular angle down = 0 or up = 1 ??: ");
				angel = scan.nextInt();
				//code below gives the upside-down triangle through a nested for-loop
					if(angel == 1){
						System.out.println("");
						for(j = letterLength; j >= 0; j--){
			  
							for(i = 0; i < j; i++){
								char letter = (char)(i + 'A');
								System.out.print(letter);
							}
							System.out.println(""); 
						}
					//code below gives the regular triangle through another nested for-loop
					}else if(angel == 0){
						for(k = 0; k <= letterLength; k++){
							for(i = 0; i < k; i++){
								char letter = (char)(i + 'A');
								System.out.print(letter);
							}
							System.out.println("");  
						}	
						System.out.println("");  
					}else if (angel != ( 1 | 0 ) ){
						System.out.println("You have to choose between 0 or 1");
					}
		
					}else if (letterLength < -1){ 
						System.out.println("\n" + "You have to enter a positive number!" + "\n");
						
				}else {
					//fake exit of the program, just gives the illusion of exit but if you scroll up it's still there
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n Goodbye! Have a nice day! \n\n\n\n\n\n\n"); 
					}
						
		}while(letterLength != -1);
		scan.close();
	}
}
