/**
 * This class provides a convenient way to test shuffling methods.
 *
 *
 *  Emily Jewik
 *  2/15/18
 */
import java.util.Random;
public class Shuffler
{

   /**
    * The number of consecutive shuffle steps to be performed in each call
    * to each sorting procedure. Change this value to your code.
    */
   private static final int SHUFFLE_COUNT = 1;


   /**
    * Tests shuffling methods.
    * @param args is not used.
    */
   public static void main(String[] args)
   {
      System.out.println("Results of " + SHUFFLE_COUNT +
                         " consecutive perfect shuffles:");
      int[] values1 = {0, 1, 2, 3};
      for (int j = 1; j <= SHUFFLE_COUNT; j++)
      {
         int[] shuffled = perfectShuffle(values1);
         System.out.print("  " + j + ":");
         for (int k = 0; k < values1.length; k++)
         {
            System.out.print(" " + shuffled[k]);
         }
         System.out.println();
      }
      System.out.println();

      System.out.println("Results of " + SHUFFLE_COUNT +
                         " consecutive efficient selection shuffles:");
      int[] values2 = {0, 1, 2, 3};
      for (int j = 1; j <= SHUFFLE_COUNT; j++)
      {
         selectionShuffle(values2);
         System.out.print("  " + j + ":");
         for (int k = 0; k < values2.length; k++)
         {
            System.out.print(" " + values2[k]);
         }
         System.out.println();
      }
      System.out.println();
   }


   /**
    * Apply a "perfect shuffle" to the argument.
    * The perfect shuffle algorithm splits the deck in half, then interleaves
    * the cards in one half with the cards in the other.
    * @param values is an array of integers simulating cards to be shuffled.
    */
   public static int[] perfectShuffle(int[] cards)
   {
      
       int[] shuffled = new int[ cards.length ];
       
     
       
       int k = 1;
       for( int j = 0; j < (shuffled.length + 1 ) / 2 ; j++ )
       {
           if( shuffled.length + 1 == k || shuffled.length == k )
           {
               break;
           }
           shuffled[j] = cards[k];
           System.out.println( "k: " + k );
           System.out.println( "j: " + j );
           k += 2;
       }
       System.out.println();
       int p = 0;
       for( int j = (shuffled.length + 1 ) / 2; (shuffled.length + 1 ) / 2 < shuffled.length - 1; j++ )
       {
           if( shuffled.length == p )
           {
               break;
           }
           shuffled[j] = cards[p];
           System.out.println( "p: " + p );
           System.out.println( "j: " + j );
           p += 2;
       }
    
       return shuffled;
   }

   /**
    * Apply an "efficient selection shuffle" to the argument.
    * The selection shuffle algorithm conceptually maintains two sequences
    * of cards: the selected cards (initially empty) and the not-yet-selected
    * cards (initially the entire deck). It repeatedly does the following until
    * all cards have been selected: randomly remove a card from those not yet
    * selected and add it to the selected cards.
    * An efficient version of this algorithm makes use of arrays to avoid
    * searching for an as-yet-unselected card.
    * @param values is an array of integers simulating cards to be shuffled.
    */
   public static void selectionShuffle(int[] values)
   {
      
      
      
      int temp = 0;
      for( int k = values.length - 1; k >= 0; k-- )
      {
          Random rand = new Random();
          int number = rand.nextInt( values.length );
          temp = values[number];
          values[number] = values[k];
          values[k] = temp;
      }
      
      
   }
}
