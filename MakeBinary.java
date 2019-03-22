import java.util.Arrays;

public class MakeBinary {
    public static void main(String[] args) {
        int num = 63;
        String binary ="";

        while(num > 0) {
            int remaining = num % 2;
            num /= 2;
            binary = binary + remaining;
        }

        String[] strparts = new String[binary.length()];
        if(binary.length() == 0 || binary == null) {
            System.out.println(0);
        } else if(binary.length() > 0) {

            int count = 1;

            for(int i = 0; i < binary.length()-1; i++) {
                strparts = binary.split("0");
            }

            Arrays.sort(strparts, (a, b)->Integer.compare(b.length(), a.length()));
            System.out.println(strparts[0].length());
        }
    }
}
