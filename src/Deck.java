import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	// instance variables
	private List<Card> cards;
	List<String> names = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");

	private List<String> values = Arrays.asList("TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
			"JACK", "QUEEN", "KING", "ACE");

//list of cards
	public Deck() {
		cards = new ArrayList<Card>();
		for (String name : names) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(i, createCardName(i - 2, name)));
			}
		}
	}

//deck methods
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {

		return cards.remove(0);

	}

	private String createCardName(int value, String suite) {
		return values.get(value) + " of " + suite;
	}
}
