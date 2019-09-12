public class Card {
//instance variables
private int value;
private String name;
//constructor for card class
public Card(int value, String name)
{
	this.value = value;
	this.name = name;
}
//getters and setters for card value
public void setValue(int value)
{	
	this.value = value;
}
public int getValue()
{
	return value;
}
//getters and setters for card name
public void setName(String name)
{
	
	this.name = name;
}
public String getName()
{
	return name;
}
public void describe()
{
System.out.println(value + " of " + name); 
}
}




