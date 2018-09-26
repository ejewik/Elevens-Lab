/**
 * This is a class that tests the Deck class.
 *
 *  \Emily Jewik
 *  1/13/18
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      String[] myRanks = {"queen" , "king" , "jack" };
      String[] mySuits = {"heart" , "spades" , "clubs" };
      int[] myPointValues = {12 , 13 , 11};
      Deck myDeck = new Deck( myRanks , mySuits , myPointValues );

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      
      System.out.println("**** Deck Methods After 2 Card Dealt ****");
     System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      
      System.out.println("**** Deck Methods After 3 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      
      System.out.println("**** Deck Methods After 4 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      
      System.out.println("**** Deck Methods After 5 Card Dealt ****");
     System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      
      System.out.println("**** Deck Methods After 6 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      
      System.out.println("**** Deck Methods After 7 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      
      System.out.println("**** Deck Methods After 8 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();
      
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      
      System.out.println("**** Deck Methods After 9 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " );
      System.out.println();
      System.out.println();


      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

        System.out.println("\n**** 52 Card Deck shuffle Tests ****");
        String[] ranks52 = {"ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "jack" , "queen" , "king" };
        String[] suits52 = {"spades" , "hearts" , "clubs" , "diamonds" };
        int[] pointValues52 = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 };
        
        
        System.out.println("  The Starting Deck ");
      
        Deck myDeck2 = new Deck( ranks52 , suits52 , pointValues52 );
        System.out.println( myDeck2.toString() );

        System.out.println("  The Deck After Dealing a Card" );
      
        myDeck2.deal();
        System.out.println( myDeck2.toString() );

        System.out.println("  Shuffleing the Deck ");
      
        myDeck2.selectionShuffle();
        System.out.println( myDeck2.toString() );


   }
}
