import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int ageLimit = 18;
		System.out.println("How old are you?");
		
		int age = Integer.parseInt(userInput.nextLine());
		if(age < ageLimit) {
			System.out.printf("You're too young!\n");
			System.exit(0);
			
		} else {
//		Scanner input = new Scanner(System.in);
		//I need a name (string)
		System.out.println("Give me a name other than yours: ");
		String name = userInput.nextLine();
		//I need an adverb (string)
		System.out.println("Now give me an adverb:");
		String adverb = userInput.nextLine();
		//I need a adjective (string adjective)
		System.out.println("Now an adjective");
		String adjective = userInput.nextLine();
		//I need a noun (string noun)
		System.out.println("Now, how about a noun");
		String noun = userInput.nextLine();		
		//I need another noun (string nounTwo)
		System.out.println("Another noun, please.");
		String nounTwo = userInput.nextLine();		
		//I need a number (int)
		System.out.println("And now a number: ");
		String number = userInput.nextLine();
		//I need their name;
		System.out.println("And finally, your name: ");
		String yourName = userInput.nextLine();
		userInput.close();
		
		System.out.printf("Dear %s,\n You are %s %s and I want to be your %s! I want to go to the %s with you in %s days.\n Sincerly,\n %s", name, adverb, adjective, noun, nounTwo, number, yourName);
		}
		

	}

}


