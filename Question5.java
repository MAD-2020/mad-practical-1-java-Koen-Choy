import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> data = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the number of integers in the array: "); /* Gets length of array */
    int length = in.nextInt(); 
                                      
    for (int x = 0; x < length; x++) /* Inputs integers into array */
    {
      System.out.print((x+1) + ". Input integer: ");
      int number = in.nextInt();
      data.add(number);
    }
    
    ArrayList<Integer> distinct = new ArrayList<>();
    for (int i = 0; i < length; i++) /* Creates new array without repeated integers */
    {
      if (!distinct.contains(data.get(i)))
      {
        distinct.add(data.get(i));
      }
    }
    
    ArrayList<Integer> counts = new ArrayList<>(); /* Creates new array with the frequencies of the different integers */
    for (int i = 0; i < distinct.size(); i++)
    {
      counts.add(Collections.frequency(data, distinct.get(i)));
    }
    int maxcount = Collections.max(counts); /* Gets highest frequency */
    int mode = distinct.get(counts.indexOf(maxcount)); /* Gets the integer with the highest frequency */
    System.out.println("Mode: " + mode); /* That integer is the mode */
  }  
}
/*Note: This does not work if the array has more than 1 modes as it only gives the mode at the lower index */
