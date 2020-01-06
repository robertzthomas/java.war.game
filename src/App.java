public class App {
	public static void main(String[] args) {
		Deck mainDeck = new Deck();
		Player a = new Player("Emily", 0);
		Player b = new Player("Zac", 0);
		mainDeck.shuffle();
		for (int i = 0; i < 26; i++) {

			a.draw(mainDeck);
			b.draw(mainDeck);

		}

		for (int i = 0; i < 26; i++) {
			Card playerAcard = a.flip();
			Card playerBcard = b.flip();
			if (playerAcard.getValue() > playerBcard.getValue()) {
				a.incrementScore();
			} else if (playerAcard.getValue() < playerBcard.getValue()) {
				b.incrementScore();
			}
		}
		System.out.println("player A score = " + a.getScore());

		System.out.println("player B score = " + b.getScore());
		
		if (a.getScore() > b.getScore()) {
			System.out.println("player A wins!");
		} else if (a.getScore() < b.getScore()) {
			System.out.println("player B wins!");
		}
	}
}
