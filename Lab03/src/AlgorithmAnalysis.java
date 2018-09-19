import java.util.Calendar;

/**
 * Algorithm Analysis Class:
 * Tests various algorithm run times using a command line prompt.
 * @author Matthew McCarthy
 *
 */

/**
 * Adding more comments.
 * @author Matthew McCarthy
 *
 */
public class AlgorithmAnalysis{

  public static void main(String[] args){
    // pass the value of n as a command line argument
    long n = Long.parseLong(args[0]);

    // counter for output
    int fragNum = 1;
    
    // get current time
    long startTime = System.nanoTime();
    
    // Fragment 1
    long sum = 0;
    for( int i = 0; i < n; i++ ){
        sum++;
        try{
            Thread.sleep(1);
        }
        catch(InterruptedException ie){
            System.out.println("Unable to sleep.");
        }
    }
    // System.out.println(sum);
    
    // get stop time and calculate actual run time
    long endTime = System.nanoTime();
    long diff = endTime - startTime;
    System.out.println("Time to compute Fragment " + fragNum++ + " was " + diff + " milliseconds."); 
  
    // Fragment 2
    startTime = System.nanoTime();
    
    sum = 0;
    for (int i = 0; i < n; i += 2) {
    	sum++;
    	try{
            Thread.sleep(1);
        }
        catch(InterruptedException ie){
            System.out.println("Unable to sleep.");
        }
    }
    
    endTime = System.nanoTime();
    diff = endTime - startTime;
    System.out.println("Time to compute Fragment " + fragNum++ + " was " + diff + " milliseconds."); 

    // Fragment 3
    startTime = System.nanoTime();
    
    sum = 0;
    for (int i = 0; i < n; i++) {
    	for (int j = 0; j < n; j++) {
    		sum++;
    		try{
                Thread.sleep(1);
            }
            catch(InterruptedException ie){
                System.out.println("Unable to sleep.");
            }
    	}
    }
    
    endTime = System.nanoTime();
    diff = endTime - startTime;
    System.out.println("Time to compute Fragment " + fragNum++ + " was " + diff + " milliseconds."); 
    
    // Fragment 4
    startTime = System.nanoTime();
    
    sum = 0;
    for (int i = 0; i < n; i++) {
    	sum++;
    	try{
            Thread.sleep(1);
        }
        catch(InterruptedException ie){
            System.out.println("Unable to sleep.");
        }
    }
    for (int j = 0; j < n; j++) {
    	sum++;
    	try{
            Thread.sleep(1);
        }
        catch(InterruptedException ie){
            System.out.println("Unable to sleep.");
        }
    }
    
    endTime = System.nanoTime();
    diff = endTime - startTime;
    System.out.println("Time to compute Fragment " + fragNum++ + " was " + diff + " milliseconds."); 
    
    // Fragment 5
    startTime = System.nanoTime();
    
    sum = 0;
    /*for (int i = 0; i < n; i++) {
    	for (int j = 0; j < n * n; j++) {
    		sum++;
    		try{
                Thread.sleep(1);
            }
            catch(InterruptedException ie){
                System.out.println("Unable to sleep.");
            }
    	}
    }*/
    
    endTime = System.nanoTime();
    diff = endTime - startTime;
    System.out.println("Time to compute Fragment " + fragNum++ + " was " + diff + " milliseconds."); 
    
    // Fragment 6
    startTime = System.nanoTime();
    
    sum = 0;
    for (int i = 0; i < n; i++) {
    	for (int j = 0; j < i; j++) {
    		sum++;
    		try{
                Thread.sleep(1);
            }
            catch(InterruptedException ie){
                System.out.println("Unable to sleep.");
            }
    	}
    }
    
    endTime = System.nanoTime();
    diff = endTime - startTime;
    System.out.println("Time to compute Fragment " + fragNum++ + " was " + diff + " milliseconds.");
    
    // Fragment 7
    startTime = System.nanoTime();
    
    sum = 0;
    /*for (int i = 0; i < n; i++) {
    	for (int j = 0; j < n * n; j++) {
    		for (int k = 0; k < j; k++) {
    			sum++;
    			try{
    				Thread.sleep(1);
    			}
    			catch(InterruptedException ie){
    				System.out.println("Unable to sleep.");
    			}
    		}
    	}
    }*/
    
    endTime = System.nanoTime();
    diff = endTime - startTime;
    System.out.println("Time to compute Fragment " + fragNum++ + " was " + diff + " milliseconds.");
    
    // Fragment 8
    startTime = System.nanoTime();
    
    sum = 0;
    for (int i = 1; i < n; i = i * 2) {
    	sum++;
    	try{
    		Thread.sleep(1);
    	}
    	catch(InterruptedException ie){
    		System.out.println("Unable to sleep.");
    	}
    	
    }
    
    endTime = System.nanoTime();
    diff = endTime - startTime;
    System.out.println("Time to compute Fragment " + fragNum++ + " was " + diff + " milliseconds.");
  }

}