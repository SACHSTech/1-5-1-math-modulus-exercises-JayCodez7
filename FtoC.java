class FtoC extends ConsoleProgram {

  /**
  * Program that converts a degree of Fahrenheit to celcius
  * @author:J. Lau
  */
  
  public void run() {
    
    // Declare variables
    int intFahrenheit;
    int intCelsius;

    // get Farenheit
    intFahrenheit = readInt("How many degrees in fahrenheit? ");

    // calculate conversion
    intCelsius = (((intFahrenheit - 32) * 5)/ 9);

    // output celsius
    System.out.println(intFahrenheit + " degrees fahrenheit is " + intCelsius + " degrees in Celsius");
    
  }
}