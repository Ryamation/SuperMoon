/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermoon;

public class Card {
   protected String _category;
   protected String _design;
   protected String _messageCover;
   protected String _messageFront;
   private String _name;
	
	public Card()   // constructor to initialise fields
	{
		_category = "";
		_design = "";
		_messageCover = "";
		_messageFront = "";
		_name = "";
	}
	
	public Card(String category)  // constructor to pick category
	{
		_category = category;
                _design = "";
		_messageCover = "";
		_messageFront = "";
		_name = "";
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
	
	public String getName()
	{
		return _name;
	}
	

	
	public void printEnvelope()
	{
		System.out.println("Envelope for " + _name);
	}
	 
}
