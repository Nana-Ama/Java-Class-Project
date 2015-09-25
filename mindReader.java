import java.util.*;

class mindReader {

public static void main(String[] args) {
	// Before Game
		// Start, Do you want to play?
		// Store username
		// Read Element File into Array
		// Read Card File into Array
		int[][] cardArray = {{1,2},{3,4}};
		String[] elementArray = {"eric","bombie"};
		// Prompt User to pick an element and keep it secret

	// Core Game
		// Pass Element & Card Array to coreGame
		mindReaderCore core = new mindReaderCore();
		int sum = core.coreGame(cardArray,elementArray);

	// After Game
		// Get Sum
		// Show Selection to User
		// Play Again?

	}
}
	
