package DataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamples {
	
	@DataProvider(name="DataProvider_TestData")
	public Object[][] DataMethod() {
		
		return new Object[][] {{"Value1"} , {"TestTwo"}};
	}

	
	@Test(dataProvider = "TestData" , dataProviderClass = DataProviderExamples2.class)
	
	public void testcaseDemo(String Values) {
		
		System.out.println("Data is passed from Data Provide :" +Values);
	}
}
