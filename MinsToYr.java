class MinsToYr {
  public static void main(String[] args) {
    MinutesToYearsDaysCalculator.printYearsAndDays(46854734);
    MinutesToYearsDaysCalculator.printYearsAndDays(79453);
  }
}

class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes) {
		int hour =(int) minutes / 60;
		int day = (int)(hour / 24);
		int year = day/365;
		day = day % 365;

		if(minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println(minutes + " min = " + year + " y and "  + day + " d");
		}
	}
}
