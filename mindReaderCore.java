import java.util.*;
public class mindReaderCore {
	Scanner in = new Scanner(System.in);
	Random rnd = new Random();

	// Shuffles/Jumbles up an array of integers
	public void jumbler(int[] array) {
		for (int i = array.length - 1; i > 0 ; i--) {
		 	int index = rnd.nextInt(i + 1);
		 	int a = array[index];
		 	array[index] = array[i];
		 	array[i] = a;
		}
	}
	// Returns a random element from an array
	public String randomElementPicker(String[] array) {
		return array[rnd.nextInt(array.length)];
	}
	// Method to get a single column from a 2D array
	public int[] getCol(int array[][], int col){
	   List<Integer> columnList = new ArrayList<Integer>(); 
	   for(int i=0; i<array.length; i++){
	      columnList.add(array[i][col]);
	   }
	   int[] columnArray = new int[columnList.size()];
	   for (int j=0; columnList.iterator().hasNext(); j++) {
	   	columnArray[j] = columnList.iterator().next();
	   }
	   return columnArray;
	}
	/* Receives a 2D cardArray and an elementArray, 
	shows the user the 2D array in terms of the elements in the elementArray 
	and returns the sum of the first numbers of whichever cards are selected as 'y' */
	public int coreGame(int[][] cardArray, String[] elementArray){
		int sum = 0;
		// loop over cards
		for (int i=1; i<=cardArray.length; i++) {
			String[] nameCard = new String[(getCol(cardArray,i)).length];
			// retrieve and jumble up card
			jumbler(getCol(cardArray,i));
			// replace numbers with names
			for (int j=1; j<=(getCol(cardArray,i)).length; j++) {
				 nameCard[j] = elementArray[getCol(cardArray,i)[j]];
				 // show card to user
				 System.out.println(nameCard[j]);
			}
			// receive user selection
			System.out.println("Is your selection in this card?\n (y/n)");
			if((in.nextLine()).equals("y")) {
				// add card[1] to sum if 'Yes'
				sum += cardArray[i][1];
			}
		}
		// exit loop when count==5
		return sum;
	}
}
