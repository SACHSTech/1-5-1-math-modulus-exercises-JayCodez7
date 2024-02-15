class AreaSin extends ConsoleProgram {

  /**
  * Program that calculates the area of a traingle given a contained angle
  * @author:J. Lau
  */
  
  public void run() {
    // declare variables
    double dblSide1;
    double dblSide2;
    double dblAngle;
    double dblArea;

    // get sides and angle
    dblSide1 = readDouble("What is the length of the first side of the triangle? ");
    dblSide2 = readDouble("What is the length of the second side of the triangle? ");
    dblAngle = readInt("How many degrees is the contained angle of the triangle? ");
 
    // calculate
    dblAngle = Math.toRadians(dblAngle);
    dblArea = (dblSide1 * dblSide2 * Math.sin(dblAngle)) / 2;

    // print area
    System.out.println("The area of your triangle is " + dblArea);
  }
}