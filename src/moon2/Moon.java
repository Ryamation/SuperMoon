/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon2;

/**
 *
 * @author T.Bain
 */

import java.util.Scanner;
public class Moon {
	public static void main(String args[])
	{
		//  This code is used to set up one card, normally we would use an array 
		//  for the object oCard so we can have more than one instance of a card
		
		Scanner scan = new Scanner(System.in);
                Scanner scanL = new Scanner(System.in);
                Card oCard = new Card();
		String strName, strMessageFront;
		int intAge;

		Customer.hello();
                
		System.out.println("What is the name of the recipient of this card>> ");
		strName = scan.next();
		System.out.println("How old is the recipient >> ");
		intAge = scan.nextInt();
		System.out.println("What message would you like on the front of the card >> ");
		strMessageFront = scanL.nextLine();
		
		oCard.setName(strName);
		oCard.setAge(intAge);
		oCard.setMessageFront(strMessageFront);
		
		
		
		//  later on we might want to retrieve the name of the person on the card
		// to display on the GUI screen  to do that we need a get method in Cards
		
		strName = oCard.getName();
		intAge = oCard.getAge();
		System.out.println(" Printing card now for " + strName + " who is " + intAge + "old ...");
		oCard.printCard();
		
		
		
		
	}
}
