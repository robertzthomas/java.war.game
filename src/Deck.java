import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck
{
//instance variables
	List<Card> cards;
	List<String> names = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
	List<String> values = Arrays.asList(null, null, "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE");
//list of cards
public Deck(){
	cards = new ArrayList<Card>();
	for (String name : names) {
		for(int i = 2; i <= 14; i ++)
{
			cards.add(new Card(i, name));
}
}
}
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
	cards.remove(0);
}
}



