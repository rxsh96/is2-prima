package gradle.cucumber;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import is2_prima.App;

public class Stepdefs {
	
	private int age;
	private int licensePoints;
	private double primaValue;

	@Given("Que mi potencial cliente tiene edad {int}")
	public void que_mi_potencial_cliente_tiene_edad(int age) {
	    this.age = age;
	}

	@When("Ha perdido {int} puntos de licencia")
	public void ha_perdido_puntos_de_licencia(int pointsLost) {
	    this.licensePoints = 30 - pointsLost;
	}

	@Then("Debe pagar un monto de $ {double}")
	public void debe_pagar_un_monto_de_$(double double1) {
	    primaValue = App.mainPrimaValue(age, licensePoints);
	    assertEquals(double1, primaValue, 0);
	}
	
	@Given("la edad de mi potencial es {int}")
	public void la_edad_de_mi_potencial_es(Integer int1) {
		this.age = int1;
	}

	@Given("Ha perdido {int} puntos")
	public void ha_perdido_puntos(Integer int1) {
		this.licensePoints = 30 - int1;
	}

	@When("Quiere saber el valor de la prima")
	public void quiere_saber_el_valor_de_la_prima() {
		primaValue = App.mainPrimaValue(age, licensePoints);
	}

	@Then("Su valor a pagar es {int}")
	public void su_valor_a_pagar_es(Integer int1) {
	    System.out.println(int1);
	}
	
}
