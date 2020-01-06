import java.util.ArrayList;
import java.util.List;

public class Player {
//instance variables
	private List<Card> hand;
	private int score;
	private String name;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
		hand = new ArrayList<Card>();
	}

	public void describe() {
		System.out.println(name);
		for (Card card : hand) {
			card.describe();
		}
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());

	}

	public void incrementScore() {
		this.score = score + 1;
	}
}
