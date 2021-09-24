/* Questions from HW 06:

What should the functions have as parameter?
Each method to convert should have one parameter which is the input Temperature to
 be converted to the other.
the main should have the normal (String[] args)

What type should they be?
They should be double so no rounding to zero occurs when working with the intergers
and the fraction in the formula.

What should the functions return?
the converted temperature from the input
*/
public class CtoFTester{
  public static double celsiusToFahrenheit(double celcius){
    return ((celcius * (9.0/5.0)) + 32); //change divsion because numbers have to be floats
  }

  public static double fahrenheitToCelsius(double farenheight){
    return ((farenheight - 32) * (5.0/9.0));
  }

  public static void main(String[] args){
    System.out.println("Celsius to farenheight with example input of 31.");
    System.out.println("expected value 87.8");
    System.out.println(celsiusToFahrenheit(31));
    System.out.println("\n");
    System.out.println("farenheight to celcius with example input of 96");
    System.out.println("expected value 35.5556");
    System.out.println(fahrenheitToCelsius(96));
  }
}
