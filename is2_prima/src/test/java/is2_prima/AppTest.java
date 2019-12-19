package is2_prima;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App.mainPrimaValue(18, 20);
		App.mainPrimaValue(17, 20);
		App.mainPrimaValue(20, 25);
		App.mainPrimaValue(20, 0);
		App.mainPrimaValue(91, 30);
		App.mainPrimaValue(30, 31);
	}

}
