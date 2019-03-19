class SpeedConversion {
  public static void main(String[] args) {
    SpeedConverter.printConversion(1.5);
    SpeedConverter.printConversion(4.8);
  }
}

class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour) {
            if(kilometersPerHour < 0) return -1;
            
            return Math.round(kilometersPerHour / 1.609); // convert to miles
        
    }
    
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) {
           System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
        
            System.out.println(kilometersPerHour + " km/h = "
            + milesPerHour + " mi/h");
        }
    }
}

