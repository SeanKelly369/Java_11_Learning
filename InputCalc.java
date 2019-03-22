import java.util.Scanner;

public class InputCalc {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int count = 0;
        if(count == 0) {
            System.out.println("Please input values and a non-number to end");
        }

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        long average = 0;

        while(sc.hasNextInt()) {
            sum += sc.nextInt();
            count++;
        }

        average = Math.round(sum / count);
        System.out.println("SUM = " + sum + " " + "AVG = " + average);
    }
}
