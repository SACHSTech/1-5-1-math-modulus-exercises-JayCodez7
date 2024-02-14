class Rads extends ConsoleProgram {

  /**
  * A computer program that converts degree measures to radian measures
  * @author:J. Lau
  */
  
  public void run() {
    
    // Declare variables
    double dblRadians;
    double dblDegrees;

    //Calculate conversion
    dblDegrees = readDouble("Input a measurement for degrees: ");
    dblRadians = Math.toRadians(dblDegrees);

    //Output Radians please
    System.out.print("A degree value of " + dblDegrees + " is equal to a radians value of " + dblRadians);
    
  }
}