package flockClient;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseTestSuite;

public class settingDropDown extends BaseTestSuite {
  
	private static final Logger log = LogManager.getLogger(searchPlus.class.getName());
	
	
	
	
	@Test
  public void DND() throws Exception {
		ce1.clickSettingDropDwon();
		Thread.sleep(2000);
		if(ce1.dndPresent()){
			ce1.clickdndButton();
			ce1.clickDNDhour();
			Thread.sleep(4000);
			ce1.clickdndButton();
		}
		
		ce1.dndSubLabelPresent();

		
  }
	

	
	
}

