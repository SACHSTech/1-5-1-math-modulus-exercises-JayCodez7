class Hours extends ConsoleProgram {

  /**
  * Program that allows you to convert hours to days
  * @author:J. Lau
  */
  
  public void run() {
    
    // declare variables
    int intHours;
    int intDays;
    int intHoursLeftover;
    // get hours
    intHours = readInt("Input the number of hours: ");

    // calculate
    intDays = intHours/24;
    intHoursLeftover = intHours%24;

    
    // output answer
    System.out.println(intHours + " hours = " + intDays + " days and " + intHoursLeftover + " hours");

  }
}