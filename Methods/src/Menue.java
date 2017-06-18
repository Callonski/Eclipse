import java.util.Scanner;
// This is a very impoortant message!!!
public class Menue {
		//Just adding something essential to this document
	public static void main(String[] args) {
		int theChoice = 1;
		// This comment is so important, I cant describe it!!
		while(theChoice != 4){
			theChoice = menue();
			switch(theChoice){
			case 1: 
				System.out.println("Du valde \"Sätta in pengar\""); 
				break;
			case 2:
				System.out.println("Du valde \"Ta ut pengar\""); 
				break;
			case 3:
				System.out.println("Du valde \"Saldobesked\"");
				break;
			case 4:
				System.out.println("Du valde \"Avsluta\""); 
				break;
			default:
				System.out.println("Välj något i menyn, ett tal mellan 1-4");
				break;
			}
		}
		
		
	}
	
	public static int menue(){
		Scanner scan = new Scanner(System.in);
		
		String one = "1. Sätta in pengar";
		String two = "2. Ta ut pengar";
		String three = "3. Saldobesked";
		String four = "4. Avsluta";
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		
		int input = scan.nextInt();
		
		return input;
	}

}
