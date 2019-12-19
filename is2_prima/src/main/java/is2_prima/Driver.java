package is2_prima;

public class Driver {

	private transient int age;
	private transient int licensePoints;
	
	public Driver() {}
	
	public Driver(int age, int licensePoints) {
		this.age = age;
		this.licensePoints = licensePoints;
	}

	public int getAge() {
		return age;
	}

	public int getLicensePoints() {
		return licensePoints;
	}

	public void setLicensePoints(int licensePoints) {
		this.licensePoints = licensePoints;
	}
	
}
