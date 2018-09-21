
public class AreaCalculator {
	public static void main(String[] args) {
		double radius = 24.5;
	}
	
	public static double area(double radius) {
		
		double PI = 3.14159;
		double area = PI * (radius * radius);
		
		if(radius < 0) {
			return -1.0;
		} else {
			return area;			
		}		
	}
	
	public static double area(double x, double y) {
		
		double area = 0.0;
		
		if( x < 0 || y < 0) {
			area = -1;
		} else {
			area = x * y;
		}
		return area;
	}
}







