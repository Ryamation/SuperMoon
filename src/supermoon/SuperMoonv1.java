/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermoon;

/**
 *
 * @author T.Bain
 */
import java.util.Scanner;
public class SuperMoonv1 {
	public static void main(String args[])
	{
		//  This code is used to set up one card, normally we would use a list
		//  This sets up a birthday card and uses sets to populate data
		
		Scanner scan = new Scanner(System.in);
                Scanner scanL = new Scanner(System.in);
		String strName, strMessageFront;
		int intAge;
                Birthday bCard = new Birthday();
 
		
		System.out.println("What is the name of the recipient of this card>> ");
		strName = scan.next();
		System.out.println("How old is the recipient >> ");
		intAge = scan.nextInt();
		System.out.println("What message would you like on the front of the card >> ");
		strMessageFront = scanL.nextLine();
		
		bCard.setName(strName);
		bCard.setAge(intAge);
		bCard.setMessageFront(strMessageFront);
		
		
		
		//  later on we might want to retrieve the name of the person on the card
		// to display on the GUI screen  to do that we need a get method in Cards
		
		strName = bCard.getName();
		intAge = bCard.getAge();
		System.out.println(" Printing card now for " + strName + " who is " + intAge + "old ...");
		bCard.printCard();
		
		
		
		
	}
}
