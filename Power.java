class Power extends ConsoleProgram {

  /**
  * Program that converts a number into an exponent of another number
  * @author:J. Lau
  */
  
  public void run() {
    // declare variables
    double dblBase;
    double dblExponent;

    // get number
    dblBase = readInt("What is your base? ");
    dblExponent = readInt("What is your exponent? ");

    // print out number
    System.out.println("Your number is: " + Math.pow(dblBase, dblExponent));
    
  }
}