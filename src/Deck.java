import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Deck
{
 //instance variables
	private static List<Card> cards;
	List<String> names = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
	//List<String> values = Arrays.asList(null, null, "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE");
//list of cards
public Deck()
{
	cards = new ArrayList<Card>();
	for (String name : names) {
		for(int i = 2; i <= 14; i ++)
{
			cards.add(new Card(i, name));
}
}
}
//deck methods
public void describe(){
	for(Card card : cards) 
{
		card.describe();
}
}
public void shuffle() {
	Collections.shuffle(cards);
}
public void draw() {
	for(int i = 0; i <= cards.indexOf(0); i++) {
		cards.remove(i);
	}
	
}
}



