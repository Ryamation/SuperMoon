/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermoon;

import java.util.Scanner;

/**
 *
 * @author t.bain
 */
public class SuperMoon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanL = new Scanner(System.in);
        
        int choice = -1;
        
        while (choice <1 || choice > 3){
            System.out.println("Enter Either 1, 2 or 3\n1.Birthday Card\n2.New Home Card\n3.Exit Program");
            choice = scanL.nextInt();
        }
        switch(choice){
            case 1:
                birthday();
                break;
            case 2:
                NewHome();
                break; 
            case 3:
                break;
        }  
        }
         public static void birthday(){
             System.out.println("You have choosen the birthday card\n");
        Scanner scan = new Scanner(System.in);
        Scanner scanL = new Scanner(System.in);
        String strName; 
        int intAge;

        System.out.println("What is the name of the recipient of this card>> ");
        strName = scanL.nextLine();
        System.out.println("How old is the recipient >> ");
        intAge = scan.nextInt();

        Birthday bCard = new Birthday(strName, intAge);

        //  later on we might want to retrieve the name of the person on the card
        // to display on the GUI screen  to do that we need a get method in Cards

        strName = bCard.getName();
        intAge = bCard.getAge();
        System.out.println(" Printing card now for " + strName + " who is " + intAge + "old ...");
        bCard.printCard();
                
    }
         public static void NewHome(){
            System.out.println("You have choosen the new home card\n");
            Scanner scanL = new Scanner(System.in);

            String strName, Location;
            int NoRooms;

            System.out.println("What is the name of the recipient of this card>> ");
            strName = scanL.nextLine();

            NewHome bCard = new NewHome(strName);

            strName = bCard.getName();
            System.out.println("Where is the new house located?>> ");
            Location = scanL.nextLine();
            bCard.setLocation(Location);
        
            System.out.println("How many rooms are in the new house?>> ");
            NoRooms = scanL.nextInt();
            bCard.setRooms(NoRooms);

            System.out.println("Printing card now for " + strName);
            bCard.printCard();
        }
    
}
