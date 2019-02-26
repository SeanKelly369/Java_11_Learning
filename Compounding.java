import java.math.RoundingMode;
import java.text.DecimalFormat;

class Compounding {
  public static void main(String[] args) {
    DecimalFormat df2 = new DecimalFormat(".##");
    double investment = 350;
    int year = 1;
    int month = 1;

    for(int i = 3; i < 48; i++) {
      investment *= 1.1;
      if(i == 0 || i % 12 == 0) {
        System.out.println("");
        System.out.println("Year is " + year + ":");
        year++;
      }
        String total = (df2.format(investment)).toString();

      System.out.println("Month " + month + " investment is $" + total);
      month++;
    }
  }
}
