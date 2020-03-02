
package supermoon;

public class NewHome extends Card {
    String _Location;
    int _Rooms;
        public NewHome(String Name){
            super("New Home");
            super.setName(Name);
        }
        
        public void setLocation(String Location)
	{
		_Location = Location;
	}
	
	
	
	public String getLocation()
	{
		return _Location;
	}
        
        public void setRooms(int Rooms)
	{
		_Rooms = Rooms;
	}
	
	
	
	public int getRooms()
	{
		return _Rooms;
	}
        
        public void printCard()
	{
		// code to print out card would go here
		System.out.println("Here is your lovely moonpig card");
		System.out.println("This card is to " + getName() + ". Who is has a new house in the "+getLocation()+" area with "+getRooms()+" rooms, congrats");
	}
	
	public void printEnvelope()
	{       // note  because messageCover is protected the subclass can access this directly.  
		System.out.println("Envelope for " + getName() + _messageCover);
	}
}
