package DataProviderDemo;

import org.testng.annotations.DataProvider;

public class DataProviderExamples2 {
	
	@DataProvider(name="TestData")
	public Object[][] DataMethod() {
		
		return new Object[][] {{"DemoUser1"} , {"DemoUser2"}};
	}

}
