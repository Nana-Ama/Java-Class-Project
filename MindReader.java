import java.util.Scanner;

public class MindReader{
	
	public static void main(String args[]){
		ReaderArray elementArray = new ReaderArray();
		mindReaderCore core = new mindReaderCore();
		//This is the first part. It includes the welcome address, username, choice of play and leads to the main game.
		int choice;
		int sum = 0;
		String user;
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		System.out.println("Welcome to MindReader Game.");
		System.out.println("Do you want to play MindReader?");

		System.out.println("1. YES");
		System.out.println("2. NO");
		choice = input.nextInt();

		

		if(choice == 1){
			System.out.println("Thanks for opting to play MindReader.");
			System.out.println("Enter your username");
			user = input2.nextLine();

			System.out.println("Choose List\n 1.EiTs");
			System.out.println("Here is the List. Pick a name and keep it a secret");
			
			for (int i=0; i < elementArray.list.length; i++) {
				System.out.println(elementArray.list[i]);
			}
			
				sum = core.coreGame(elementArray.cardArray);
				System.out.println(user + " picked " + sum);		
		}

		else if (choice==2){
			System.out.println("You have opted to exit MindReader.");
			System.out.println("Thank you and do come again");
		}

	}
}