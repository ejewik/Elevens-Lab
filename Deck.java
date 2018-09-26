import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 *
 *
 *  Emily Jewik
 *  1/13/18
 */
import java.util.ArrayList;
import java.util.Random;
public class Deck
{
   private List<Card> cards;    //contains all the cards in the deck

   private int size;   // size is the number of not-yet-dealt cards.
                       // Cards are dealt from the top (highest index) down.
                       // The next card to be dealt is at size - 1.

   /**
    * Creates a new Deck instance.<BR>
    * It pairs each element of ranks with each element of suits,
    * and produces one of the corresponding card.
    * @param ranks is an array containing all of the card ranks.
    * @param suits is an array containing all of the card suits.
    * @param values is an array containing all of the card point values.
    */
   public Deck(String[] ranks, String[] suits, int[] values)
   {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      
      ArrayList<Card> deck = new ArrayList<Card>();
      
      for( int k = 0; k < suits.length; k++ )
      {
      
      for( int i = 0; i < ranks.length; i++ )
      {
          Card a = new Card( ranks[i] , suits[k] , values[i] );
          deck.add( a );
          size++;
      }
      }
      
      cards = deck;
      // initialize cards as a new ArrayList
      // loop through the parameter arrays to add new cards
      // assign size of cards to the size instance variable
      // shuffle cards

   }

   /**
    * Determines if this deck is empty (no undealt cards).
    * @return true if this deck is empty, false otherwise.
    */
   public boolean isEmpty()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      
      if( size == 0 )
      {
          return true;
      }
      else
      {
          return false;
      }
   }

   /**
    * Accesses the number of undealt cards in this deck.
    * @return the number of undealt cards in this deck.
    */
   public int size()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      
      return size;
   }

   /**
    * Randomly permute the given collection of cards
    * and reset the size to represent the entire deck.
    */
   public void shuffle()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
      /* For Activity 2, this method will do nothing. */
   }

   /**
    * Deals a card from this deck.
    * @return the card just dealt, or null if all the cards have been
    *         previously dealt.
    */
   public Card deal()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      if( size > 0 )
      {
      size--;
      
      return cards.get( size );
      }
      else
      {
          return null;
      }
   }

   /**
    * Generates and returns a string representation of this deck.
    * @return a string representation of this deck.
    */
   @Override
   public String toString()
   {
      String rtn = "size = " + size + "\nUndealt cards: \n";

      for (int k = size - 1; k >= 0; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != 0)
         {
            rtn = rtn + ", ";
         }
         if ((size - k) % 2 == 0)
         {
            // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }

      rtn = rtn + "\nDealt cards: \n";
      for (int k = cards.size() - 1; k >= size; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != size)
         {
            rtn = rtn + ", ";
         }
         if ((k - cards.size()) % 2 == 0)
         {
            // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }
      rtn = rtn + "\n";
      return rtn;
   }
   
    public void selectionShuffle()
   {
      
      
      
      Card temp;
      for( int k = size - 1; k >= 0; k-- )
      {
          Random rand = new Random();
          int number = rand.nextInt( size );
          temp = cards.get(number);
          cards.set( number , cards.get( k ) );
          cards.set( k , temp );
         
      }
      
     
      
      
   }
}
