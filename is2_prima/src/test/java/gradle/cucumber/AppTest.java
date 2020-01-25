package gradle.cucumber;

import static org.junit.Assert.*;

import org.junit.Test;

import is2_prima.App;

public class AppTest {

	@Test
	public void test() {
		assertEquals("Prima Value Test 1", App.mainPrimaValue(20, 25), 1400, 0);
		assertEquals("Prima Value Test 2", App.mainPrimaValue(17, 0), 0, 0);
		assertEquals("Prima Value Test 3", App.mainPrimaValue(18, 30), 1350, 0);
		assertEquals("Prima Value Test 4", App.mainPrimaValue(18, 10), 1400, 0);
		assertEquals("Prima Value Test 5", App.mainPrimaValue(25, 39), 0, 0);
		assertEquals("Prima Value Test 6", App.mainPrimaValue(26, 28), 850, 0);
		assertEquals("Prima Value Test 7", App.mainPrimaValue(32, 25), 900, 0);
		assertEquals("Prima Value Test 8", App.mainPrimaValue(37, 30), 400, 0);
		assertEquals("Prima Value Test 9", App.mainPrimaValue('A', 35), 0, 0);
		assertEquals("Prima Value Test 10", App.mainPrimaValue(45, 20), 400, 0);
		assertEquals("Prima Value Test 11", App.mainPrimaValue(58, 28), 250, 0);
		assertEquals("Prima Value Test 12", App.mainPrimaValue(64, 30), 250, 0);
		assertEquals("Prima Value Test 13", App.mainPrimaValue(67, 1), 750, 0);
		assertEquals("Prima Value Test 14", App.mainPrimaValue(69, 'A'), 0, 0);
		assertEquals("Prima Value Test 15", App.mainPrimaValue('A', 'A'), 0, 0);
		assertEquals("Prima Value Test 16", App.mainPrimaValue(90, 30), 550, 0);
		assertEquals("Prima Value Test 17", App.mainPrimaValue(95, 25), 0, 0);
		assertEquals("Prima Value Test 18", App.mainPrimaValue(65, 25), 750, 0);
		assertEquals("Prima Value Test 19", App.mainPrimaValue(66, 26), 550, 0);
		assertEquals("Prima Value Test 20", App.mainPrimaValue(65, 26), 550, 0);
	}

}
