/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon2;

public class Card {
   private String _category;
   private String _design;
   private String _messageCover;
   private String _messageFront;
   private String _name;
   int _age;
   private int _custID;
	
	public Card()   // constructor to initialise fields
	{
		_category = "";
		_design = "";
		_messageCover = "";
		_messageFront = "";
		_name = "";
		_age = 0;
	}
	
	public Card(String category)  // constructor to pick category
	{
		_category = category;
	}
	
	public Card(String name,  int age)  // constructor for birthdays
	{
		_category = "birthday";
		_name = name;
		_age = age;
	}

	public void setCategory(String category)
	{
		_category = category;
	}
	
	public void setDesign(String design)
	{
		_design = design;
	}
	
	public void setMessageCover(String messageCover)
	{
		_messageCover = messageCover;
	}
	
	public void setMessageFront(String messageFront)
	{
		_messageFront = messageFront;
	}
	
	public void setName(String name)
	{
		_name = name;
	}
	
	public void setAge(int age)
	{
		_age = age;
	}
	
	
	public String getName()
	{
		return _name;
	}
	
	public int getAge()
	{
		return _age;
	}
	
	public void printCard()
	{
		// code to print out card would go here
		System.out.println("Here is your lovely moonpig card");
		System.out.println("This card is to " + _name + ".  Who is " + _age + " old today");
	}
	
	public void printEnvelope()
	{
		System.out.println("Envelope for " + _name);
	}
	 
}
