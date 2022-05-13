package sikuli;

import org.testng.annotations.Test;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.BeforeTest;

public class SikuliDesktopWeb {
	Screen s = new Screen();

	@Test
	public void sikuli() throws SikuliException {

		s.click("E:\\Lib\\Sikuli\\Wifi.PNG");  

	}


	

}
