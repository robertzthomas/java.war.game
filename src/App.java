public class App {
	public static void main(String[] args) 
{
	Deck mainDeck = new Deck();
	Player a = new Player("sally", 0);
	Player b = new Player("bob", 0);
	mainDeck.shuffle();
	for(int i = 0; i <= 52; i++) {
		if( i % 2 == 0) {
			a.draw();
		}
		else {
			b.draw();
		}
	}

}
}
