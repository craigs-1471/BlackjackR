package bjObjects;

import java.util.ListIterator;

public class Dealer extends Player {
	
	public String currentDealerHandToString() {
		String currentHand = "Dealer's Hand:\n";
		
		ListIterator<String> itr = getCurrentHand().listIterator();
		while(itr.hasNext()) {
			currentHand+= itr.next() + " ";
		}
		
		currentHand+= "value: " + getCurrentHandValue();
		return currentHand;
	}
}
