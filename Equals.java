class Equals {
  public static void main(String[] args) {
    IntEqualityPrinter.printEqual(-2, 0, 7);
    IntEqualityPrinter.printEqual(4, 4, 4);
    IntEqualityPrinter.printEqual(5, 7, 2);
    IntEqualityPrinter.printEqual(5, 2, 2);
  }
}

class IntEqualityPrinter {
    public static void printEqual(int num1, int num2, int num3){
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        }
        else if( (num1 == num2) && (num2 == num3) && (num1 == num3) ){
            System.out.println("All numbers are equal");
        }
        else if( (num1 != num2) && (num2 != num3) && (num1 != num3) ){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
