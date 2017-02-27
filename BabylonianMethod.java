import java.util.Scanner; //implementing the scanner class
import static java.lang.Math.abs; //implementing math for absoulte value
//Ancient method of finding the square root of numbers throught recersion trials 
public class BabylonianMethod{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    //asks the user for all of the necissary inputs needed for the program to function
    System.out.println("Enter a number who's square root you wish to find: ");
    double inputNumber = keyboard.nextDouble(); //variable definition
    
    System.out.println("Enter the amount of error you will tolerate for the answer to deviate from: ");
    double errorTolerated = keyboard.nextDouble(); //variable definition
    
    System.out.println("Guess what you think the square root might be: ");
    double userGuess = keyboard.nextDouble(); //variable definition
    
    System.out.println(SquareRoot(inputNumber, errorTolerated, userGuess)); //used to print out the answer at the end
    
    keyboard.close(); //scanner class requires this sometimes
  }
  
  public void setErrorTolerated(double inputNumber, double errorTolerated, double userGuess){
    double errorFrom = userGuess - errorTolerated; //sets a proper value to errorFrom. This is to be later compared
  }
  
  
  public static double SquareRoot(double inputNumber, double errorFrom, double userGuess) //method to figure out the sqrt
  {
    if(errorFrom >= abs(inputNumber - (userGuess*userGuess))) //using absoulte value to make sure that errorFrom can be compared
      return userGuess; //it would just return the users guess if they happened to be close to the right answer
    
    return SquareRoot(inputNumber, errorFrom, (0.5*((userGuess + inputNumber)/userGuess))); //RECURSION happens here
    }
}
