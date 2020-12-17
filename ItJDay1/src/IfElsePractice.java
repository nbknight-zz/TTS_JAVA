import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		guessingGame(3);
		guessingGame2(50);
		
		
		

	}
	
	public static void guessingGame(int number) {
		//Given a number
		//and a user chooses a number
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a number between 1 and 10");
		int choice = input.nextInt();
		input.close();
		//if the number chosen is the same as the given number
		if(choice == number){
		System.out.println("Wow"); //read Wow!
		}else {
		//else read Nope!
		System.out.println("Nope");
		}
	}
	
	public static void grade() {
		//Given a prompt, the user should be able to enter a grade
		Scanner input = new Scanner(System.in);
		System.out.println("What is your current grade? ");
		int grade = input.nextInt();		
		//If the grade is 60 or higher
		if(grade >= 60) {
		System.out.println("You passed!");//they passed
		}else {//else
			System.out.println("Dang.... that sucks. But I'll see you next year!");
		//They have to take the class again
		}
		input.close();
	}
	
	public static void guessingGame2(int number) {
		//Given a number
		
//		And the user chooses a number
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a number between 1 and 100");
		int choice = input.nextInt();
		input.close();
		//if number is below 1 or above 100
		if(choice < 1 || choice > 100) {
			System.out.println("Sorry not a valid number");//not a valid number
		}else if(choice == number) {
			System.out.println("Coolio Homeskillet");
			
		}
		else if(Math.abs(choice - number) <= 5){//else if number is within 5
		
			System.out.println("Sucks");
		//oh so close
		} else {
			System.out.println("Nope!");
		
		
		//nope
		}
	}
	
	public static void animal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Give me ")
	}
		

}
