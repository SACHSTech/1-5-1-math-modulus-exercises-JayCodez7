class Cos3rd extends ConsoleProgram {

  /**
  * A computer that allows you to calculate the third side if having a contained angle using the cosine law
  * @author:J. Lau
  */
  
  public void run() {
    
    // declare variables
    double dblSide1;
    double dblSide2;
    double dblAngle;
    double dblSide3;

    // get sides
    dblSide1 = readDouble("What is the length of the first side of the triangle? ");
    dblSide2 = readDouble("What is the length of the second side of the triangle? ");
    dblAngle = readInt("What is the length of the contained angle of the triangle? ");

    // calculate
    dblAngle = Math.toRadians(dblAngle);
    dblSide3 = Math.sqrt((dblSide1 * dblSide1) + (dblSide2 * dblSide2) - 2 * dblSide1 * dblSide2 * Math.cos(dblAngle));

    // print length of missing side
    System.out.println("The angle of your missing side is " + dblSide3);
  }
}