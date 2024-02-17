class Minutes extends ConsoleProgram {

  /**
  * Program that allows you to convert minutes to number of days, hours and minutes that represents.
  * @author:J. Lau
  */
  
  public void run() {
    
    // declare variables
    int intMinutes;
    int intHours;
    int intDays;
    int intHoursLeftover;
    int intMinutesLeftover;

    // get hours
    intMinutes = readInt("Input the number of minutes: ");

    // calculate
    intDays = intMinutes / 1440;
    
    intHoursLeftover = intDays / 24;

    intMinutesLeftover = intHoursLeftover / 60;

    // output answer
    System.out.println(intMinutes + " minutes = " + intDays + " days, " + intHoursLeftover + " hours, and " + intMinutesLeftover + " minutes");
    
  }
}