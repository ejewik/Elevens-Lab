/**
 * This is a class that tests the Card class.
 *
 *  Emily Jewik
 *  1/13/18
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card Spades3 = new Card( "three" , "spades" , 3 );
      Card Clubs3 = new Card( "seven" , "clubs" , 7 );
      Card Clubs3V2 = new Card ( "seven" , "clubs" , 7 );

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      
      System.out.println("**** Tests Card 2: three of spades ****");
      System.out.println("  rank: " + Spades3.rank());
      System.out.println("  suit: " + Spades3.suit());
      System.out.println("  pointValue: " + Spades3.pointValue());
      System.out.println("  toString: " + Spades3.toString());
      System.out.println();

      // Test card 3
      
      System.out.println("**** Tests Card 3: seven of clubs ****");
      System.out.println("  rank: " + Clubs3.rank());
      System.out.println("  suit: " + Clubs3.suit());
      System.out.println("  pointValue: " + Clubs3.pointValue());
      System.out.println("  toString: " + Clubs3.toString());
      System.out.println();
      
       System.out.println("**** Tests Card 4: seven of clubs ****");
      System.out.println("  rank: " + Clubs3.rank());
      System.out.println("  suit: " + Clubs3.suit());
      System.out.println("  pointValue: " + Clubs3.pointValue());
      System.out.println("  toString: " + Clubs3.toString());
      System.out.println();

      // Test matches() method
      
      boolean match = aceHearts.matches( Clubs3 );
      boolean match2 = Clubs3.matches( Clubs3V2 );
      System.out.println( "Match: " + match );
      System.out.println( "Match: " + match2 );

   }
}
