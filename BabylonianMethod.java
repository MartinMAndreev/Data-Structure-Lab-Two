import java.util.Scanner; //implementing the scanner class
//Ancient method of finding the square root of numbers throught recersion trials 
public class BabylonianMethod{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
   
    System.out.println("Enter a number who's square root you wish to find: ");
    double inputNumber = keyboard.nextDouble();
    
    System.out.println("Enter the amount of error you will tolerate for the answer to deviate from: ");
    double errorTolerated = keyboard.nextDouble();
    
    System.out.println(SquareRoot(inputNumber, errorTolerated));
    
    keyboard.close();
  }
  
  public static double SquareRoot(double inputNumber, double errorTolerated)
  {
    final double lastGuess;
    lastGuess = inputNumber/2;
    return lastGuess;
  }
}