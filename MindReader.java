import java.util.Scanner;

public class mindReader{
	public static void main(String args[]){
		//This is the first part. It includes the welcome address, username, choice of play and leads to the main game.
		int choice;
		String user;
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Welcome to MindReader Game.");
		System.out.println("Do you want to play MindReader?");

		System.out.println("1. YES");
		System.out.println("2. NO");
		choice = input.nextInt();

		

		if(choice == 1){
			System.out.println("Thanks for opting to play MindReader.");
			System.out.println("Enter your username");

			user = input2.nextLine();
		
		}

		else if (choice==2){
			System.out.println("You have opted to exit MindReader.");
			System.out.println("Thank you and do come again");
		}
	}
}