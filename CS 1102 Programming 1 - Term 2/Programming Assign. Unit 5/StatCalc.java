/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statcalc;

/*
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */
 
public class StatCalc {
 
   private int count;   // Number of numbers that have been entered.
   private double sum;  // The sum of all the items that have been entered.
   private double squareSum;  // The sum of the squares of all the items.
 
   /**
    * Add a number to the dataset.  The statistics will be computed for all
    * the numbers that have been added to the dataset using this method.
    */
   public void enter(double num) {
          count++;
          sum += num;
          squareSum += num*num;
   }
 
   /**
    * Return the number of items that have been entered into the dataset.
    */
   public int getCount() {
          return count;
   }
 
   /**
    * Return the sum of all the numbers that have been entered.
    */
   public double getSum() {
          return sum;
   }
 
   /**
    * Return the average of all the items that have been entered.
    * The return value is Double.NaN if no numbers have been entered.
   */
   public double getMean() {
          return sum / count;
   }
 
   /**
    * Return the standard deviation of all the items that have been entered.
    * The return value is Double.NaN if no numbers have been entered.
    */
   public double getStandardDeviation() {
          double mean = getMean();
          return Math.sqrt( squareSum/count - mean*mean );
   }         
   
   public static void main(String a[]) throws Exception   {
       
        StatCalc stats;
        stats = new StatCalc();
 
        // Add all numbers
        stats.enter(5);
        stats.enter(7);
        stats.enter(12);
        stats.enter(23);
        stats.enter(3);
        stats.enter(2);
        stats.enter(8);
        stats.enter(14);
        stats.enter(10);
        stats.enter(5);
        stats.enter(9);
        stats.enter(13);
 
    // Calling and printing the amount of numbers    
        
    System.out.println("Count: "+stats.getCount());
    
    // Calling and priting the average of the numbers
    
    System.out.println("Mean: "+stats.getMean());
    
    // Calling and priting the standard deviation
    
    System.out.println("Standard Deviation: "+stats.getStandardDeviation());       
       
}  // end class StatCalc
    }
