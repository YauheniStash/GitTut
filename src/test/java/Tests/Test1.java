package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Config.Base;

public class Test1 extends Base {

	@Test
	public void launchApp() throws IOException {
		browserInit();
	}
}
