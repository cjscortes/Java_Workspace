//Christopher Serrano 
// Professor Zareh 
//Bulgarian Solitaire
//Professor Zareh 
// 03/30/3023
// 
//
// 
package myBulgarianProject; 
import java.util.ArrayList; // built in package 
import java.util.Collections; // built in package 
import java.util.Random;// built in package 

public class BulgarianProjectJava {

    ArrayList<Integer> cards = new ArrayList<Integer>(); // used to store dynamically sized collection of elements for the cards 
    Random rand = new Random(); // Random function 
    boolean cont = true; // allows for the program to flow through the cards
    boolean cont2 = true;


	public static void main(String[] args) { // creating the main method 
		 BulgarianProjectJava game = new BulgarianProjectJava(); // declaring the game for your game 
    }
	  public BulgarianProjectJava() {
	        System.out.println("LETS START THE GAME, Ladies and Gentleman! Are you ready!?");
	        int sum = 0;
	        while (cont) { // execute a block of statements continuously until the given condition is true - for the card size  
	            if (sum < 45) { // Using an if statement to sum and make sure that the deck is less than 45 
	                cards.add(rand.nextInt(46 - sum)); // Must be a total of 45 cards in total 
	            } else { // use else function to make sure a block of code is being executed, if the condition is false 
	                cont = false;
	            }
	            sum = 0;
	            for (int i = 0; i < cards.size(); i++) { //going to loop a certain integer of cards 
	                sum += cards.get(i); //  plus equals operator 
	            }

	            removeZeros(cards); // removes the zeros 

	            System.out.println(cards); // statement that allows an argument to be printed and passed through it 
	        }
	        System.out.println("The Deck of cards are finished Shuffling!!! ");

	        while (cont2) {
	            solitaireStep();
	            System.out.println(cards); // while loop that allows for the deck of cards to shuffle 
	            if (checkCards()) {
	                cont2 = false;
	            }
	        }

	        Collections.sort(cards); // allows for the cards to be sorted 
	        System.out.println("Bulgarian Solitaire has officially ended, Thanks for playing"); // print out statements
	        System.out.println(cards); // print 
	    }
	  public void removeZeros(ArrayList<Integer> list) { //
	        for (int j = 0; j < list.size(); j++) { // gives you the size of the list, i IS KNOWN AS THE ITERATOR 
	            if (list.get(j) == 0) { // used to get the element in the deck of cards in proper sequence 
	                list.remove(j); 
	            } // bracket 
	        } // right bracket 
	    }// bracket for the public void 
	  public void solitaireStep() { // beginning of the solitaire step 

	        int numberRemoved = 0;

	        for (int i = 0; i < cards.size(); i++) { // list has been generated, it will run through the step of subtracting 1 from every number in the list, 
	        	                                    //removing zeros and adding a new value equal to the number of stacks
	            int value = cards.get(i);
	            cards.set(i, value - 1); // depending on the value must delete by 1 
	            removeZeros(cards);
	            numberRemoved++;
	        }
	        cards.add(numberRemoved);
	    } // end of the solitarie braket 

	    public boolean checkCards() { // boolean logic that will always equal true 
	        ArrayList<Integer> expectedCards = new ArrayList<Integer>(); 

	        for (int i = 1; i < 10; i++) {
	            expectedCards.add(i);
	        }
	        ArrayList<Integer> sortedCards = cards;
	        Collections.sort(sortedCards);
	        boolean equal = true;
	        if (sortedCards.size() != expectedCards.size()) {
	            equal = false;
	        }
	        for (int i = 0; i < sortedCards.size(); i++) {
	            if (sortedCards.size() == expectedCards.size()) {
	                if (sortedCards.get(i) != expectedCards.get(i)) {
	                    equal = false;
	                }
	            }
	        }

	        return equal;
	    }
	}

	
	
	
	
	
	
	
   