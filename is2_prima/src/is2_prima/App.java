package is2_prima;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("=====ASEGURADORA DE CARROS=====");
		  System.out.println("Ingrese edad del conductor: ");
		  
		  while(!scan.hasNextInt()){
		  System.out.println("�Ingrese valores num�ricos solamente!");
		  System.out.println("Ingrese edad del conductor: "); scan.next(); } int edad =
		  scan.nextInt();
		  
		  System.out.println("Ingrese puntos de licencia del coductor: ");
		  while(!scan.hasNextInt()) {
		  System.out.println("�Ingrese valores num�ricos solamente!");
		  System.out.println("Ingrese puntos de licencia del coductor: "); scan.next();
		  } int puntosLicencia = scan.nextInt();
		  
		  scan.close();
		  
		  System.out.println(mainPrimaValue(edad, puntosLicencia));
		 
		 

	}
	
	/**
	 * Static function to calculate the prima value on Main Class. 
	 * @param age driver's age
	 * @param licensePoints driver's license points
	 * @return the prima value. 
	 */
	public static double mainPrimaValue(int age, int licensePoints) {
		
		Driver driver = new Driver(age, licensePoints);
		if(driver.getAge() < 18 || driver.getAge() > 90) {
			System.out.println("Lo sentimos, tu edad no es la indicada.");
			return 0;
		}
		
		double factorEdad = InsuranceCarrier.ageFactor(driver);
		int reduccionConductorSeguro = InsuranceCarrier.safeDriverReduction(driver);
		
		if(reduccionConductorSeguro == -1) {
			System.out.println("�Sin Puntos de Licencia!");
			return 0;
		}
		
		if(reduccionConductorSeguro == 1) {
			System.out.println("Puntos de Licencia Inv�lidos");
			return 0; 
		}
		
		System.out.println("Calculando Valor Prima a Pagar...");
		double primaPagar = InsuranceCarrier.calculatePrimaValue(500.0, factorEdad, reduccionConductorSeguro);
		
		System.out.println("El valor calculado es: $" + primaPagar);
		return primaPagar;
	}

}
