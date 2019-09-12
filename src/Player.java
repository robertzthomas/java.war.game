import java.util.List;

public class Player extends Deck
{
//instance variables
static List<Card> hand;
int score;
private String name;
public Player(String name, int score)
{
	this.name = name;
	this.score = score;
}
public void Describe() 
{
System.out.println(name);
for(Card card : hand) {
	System.out.println(card);
}
}

public void flip() 
{
	hand.remove(0);
}
public  void draw(int Deck) 
{
 draw();
}
public void incrementScore() 
{
this.score = score + 1;
}
}
