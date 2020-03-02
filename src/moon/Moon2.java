/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon;

import java.util.Scanner;
public class Moon2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		//----------------  example using birthday constructor
		Scanner scan = new Scanner(System.in);
                Scanner scanL = new Scanner(System.in);
                
		String strName; 
		int intAge;
				
		System.out.println("What is the name of the recipient of this card>> ");
		strName = scanL.nextLine();
		System.out.println("How old is the recipient >> ");
		intAge = scan.nextInt();
			
		Card oCard = new Card(strName, intAge);
				
		//  later on we might want to retrieve the name of the person on the card
		// to display on the GUI screen  to do that we need a get method in Cards
				
		strName = oCard.getName();
		intAge = oCard.getAge();
		System.out.println(" Printing card now for " + strName + " who is " + intAge + "old ...");
		oCard.printCard();
				
			
	}
}
