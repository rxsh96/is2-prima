package is2_prima;

/**
 * Class to represent an insurance carrier.
 * @author RS
 *
 */
public class InsuranceCarrier {
	
	private static final int TOTAL_POINTS = 30;
	private static final int ZERO = 0;
	
	private static final double MIN_FACTOR = 0.8;
	private static final double FACTOR = 1.0;
	private static final double FACTOR2 = 1.5;
	private static final double FACTOR3 = 1.8;
	private static final double MAX_FACTOR = 2.8;
	
	
	/**
	 * Calculate the prima value. 
	 * @param basicRate is the basic rate of the insurance carrier
	 * @param ageFactor is the age factor of the driver
	 * @param safeDriverReduction is the discount of the prima value
	 * @return the prima value. 
	 */
	public static double calculatePrimaValue(double basicRate, 
			double ageFactor, 
			int safeDriverReduction) {
		return basicRate*ageFactor-safeDriverReduction;
	}
	
	/**
	 * Calculate the age factor of a driver
	 * @param driver driver
	 * @return age factor 
	 */
	public static double ageFactor(Driver driver) {
		int age = driver.getAge();
		if(age >= 18 && age < 25) return 2.8;
		else if(age >= 25 && age < 35) return 1.8;
		else if(age >= 35 && age < 45) return 1.0;
		else if(age >= 45 && age < 65) return 0.8;
		else if(age >= 65 && age <= 90) return 1.5;
		else return 0;
	}
	
	/**
	 * Calculate the total points of the license that I can lose to apply discount
	 * @param ageFactor is the age factor of the driver
	 * @return points of the license that can lose
	 */
	public static int pointsCanLose(double ageFactor) {
		if(ageFactor == 2.8) return 1;
		else if(ageFactor == 1.8) return 3;
		else if(ageFactor == 1.0) return 5;
		else if(ageFactor == 0.8) return 7;
		else if(ageFactor == 1.5) return 5;
		else return 0;
	}
	
	/**
	 * It returns the value of the reduction that I can apply to the value of prima
	 * @param driver conductor
	 * @return reduction value
	 */
	public static int safeDriverReduction(Driver driver) {
		double ageFactor = ageFactor(driver);
		int licensePoints = driver.getLicensePoints();
		if(licensePoints <= ZERO) {
			return -1;
		}
		if(licensePoints > TOTAL_POINTS) {
			return 1;
		}
		int pointsCanLose = pointsCanLose(ageFactor);
		if(Double.compare(ageFactor, MAX_FACTOR) == ZERO && TOTAL_POINTS - licensePoints <= pointsCanLose) return 50; 
		else if(Double.compare(ageFactor, FACTOR3) == ZERO && TOTAL_POINTS - licensePoints <= pointsCanLose) return 50;
		else if(Double.compare(ageFactor, FACTOR) == ZERO && TOTAL_POINTS - licensePoints <= pointsCanLose) return 100;
		else if(Double.compare(ageFactor, MIN_FACTOR) == ZERO && TOTAL_POINTS - licensePoints <= pointsCanLose) return 150;
		else if(Double.compare(ageFactor, FACTOR2) == ZERO && TOTAL_POINTS - licensePoints <= pointsCanLose) return 200;
		else return 0;
	}
}
