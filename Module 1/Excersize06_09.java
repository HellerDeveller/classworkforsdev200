
public class Excersize06_09 {
	public static void main(String[] args) {
	System.out.println("Feet\tMeters\t\t\tMeters\tFeet");
	System.out.println("----------------------------------------------");
	int count = 1;
	do {
		double foot = count;
		double meter = 15.0 + count * 5;
		System.out.printf("%1.1f\t%5.3f\t\t\t%4.1f\t%5.3f\n", foot, footToMeter(foot), meter, meterToFoot(meter));
		count++;
	} while (count < 11);
	}
	
	public static double footToMeter(double foot) {
	double meter = 0.305 * foot;
	return meter;
	}
	
	public static double meterToFoot(double meter) {
	double foot = 3.279 * meter;
	return foot;
	}
	
}
