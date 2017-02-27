import java.util.Scanner; //implementing the scanner class
import static java.lang.Math.abs; //implementing math for absoulte value
//Ancient method of finding the square root of numbers throught recersion trials 
public class BabylonianMethod{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
   
    System.out.println("Enter a number who's square root you wish to find: ");
    double inputNumber = keyboard.nextDouble();
    
    System.out.println("Enter the amount of error you will tolerate for the answer to deviate from: ");
    double errorTolerated = keyboard.nextDouble();
    
    System.out.println("Guess what you think the square root might be: ");
    double userGuess = keyboard.nextDouble();
    
    System.out.println(SquareRoot(inputNumber, errorTolerated, userGuess));
    
    keyboard.close();
  }
  
  public void setErrorTolerated(double inputNumber, double errorTolerated, double userGuess){
    double errorFrom = userGuess - errorTolerated;
  }
  
  
  public static double SquareRoot(double inputNumber, double errorFrom, double userGuess)
  {
    if(errorFrom >= abs(inputNumber - (userGuess*userGuess)))
      return userGuess;
    
    return SquareRoot(inputNumber, errorFrom, (0.5*((userGuess + inputNumber)/userGuess)));
    }
}
