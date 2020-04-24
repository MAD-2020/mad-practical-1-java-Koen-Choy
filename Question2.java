import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter height (in meters) and weight (in kg): ");
    double height = in.nextDouble();
    double weight = in.nextDouble();
    double bmi = weight/(height**2);
    
    System.out.println("Height: " + height + "m");
    System.out.println("Weight: " + weight + "kg");
    System.out.println("BMI: " + bmi + "kg/m^2");
  }
}
