package utilities;

import org.testng.annotations.DataProvider;

public class DataInputs {
	
	
	@DataProvider(name="emails")
	public static Object[][] emailInputs(){
		return new Object[][]{{""},{"jffhfhfh"},{"jffhfhfh@jdjdjjdj"}};
	}

}
