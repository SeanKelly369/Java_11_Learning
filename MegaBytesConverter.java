public class MegaBytesConverter {
  public static void main(String[] args) {
	int kiloBytes = 1024;
	printMegaBytesAndKiloBytes(kiloBytes);
  }
  
  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
	  if(kiloBytes < 0) {
		  System.out.println("Invalid Value");
	  } else {
			  int remainder = (kiloBytes % 100);
			  int megaBytes = (kiloBytes - remainder) * 1000;
			  System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + remainder + "KB");
		  }	  
	  }

}