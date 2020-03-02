/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermoon;

public class Birthday extends Card{
   int _age;
	
	public Birthday()   // constructor to initialise fields
	{
	    super("Birthday");	
            _age = 0;
	}
	
	public Birthday(String name,  int age)  // constructor for birthdays
	{
           super("birthday");
           super.setName(name);  // as the modifier in the superclass is private subclass must use set and get to access the field
            _age = age;  
	}
	
		
	public void setAge(int age)
	{
		_age = age;
	}
	
	
	
	public int getAge()
	{
		return _age;
	}
	
	public void printCard()
	{
		// code to print out card would go here
		System.out.println("Here is your lovely moonpig card");
		System.out.println("This card is to " + getName() + ".  Who is " + _age + " old today");
	}
	@Override
	public void printEnvelope()
	{       // note  because messageCover is protected the subclass can access this directly.  
		System.out.println("Envelope for " + getName() + _messageCover);
	}
	 
}
