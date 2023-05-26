package TestNGtest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizedtest {
	@Test
    @Parameters({"browser", "url"})
    public void parameterTest(String browserName,String browserUrl) {
       System.out.println("Browser used : " + browserName);
       System.out.println("url under test : " + browserUrl);
    }
}
	

