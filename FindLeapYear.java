class FindLeapYear {
  public static void main(String[] args) {
    System.out.println(LeapYear.isLeapYear(2019));
    System.out.println(LeapYear.isLeapYear(2020));
  }
}

class LeapYear {
    public static boolean isLeapYear(int year){
    
        if(year >= 1 && year <= 9999){
            if (year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
