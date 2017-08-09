package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseTestSuite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;

public class clientElement1 {
	ExtentTest test;
	WebDriver driver;
	WebElement element = null ;
	
	private static GenericMethods gm ;
	private static final Logger log = LogManager.getLogger(clientElement1.class.getName());
	
	public clientElement1(WebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
		}

	@FindBy(xpath="//div[@id='app-menu-item-dnd']//div[contains(text(),'Do not disturb')]")  //DND Button inside drop-down
	public WebElement dndButton;
	
	@FindBy(xpath="//div[@class='app_menu_icon']")  //Setting Drop-down Icon 
	public WebElement settingDropDown;
	
	@FindBy(xpath="//div[@id='app-menu-item-dnd']//div[contains(text(),'Stop receiving notification')]")  //DND Button sub label inside drop-down
	public WebElement dndSubLabel;
	
	@FindBy(xpath="//div[@id='shell_appMenu_AppMenuItem_0']//div[contains(text(),'For 1 hour')]")  //One Hour DND inside drop-down
	public WebElement oneHourDND;
	
	@FindBy(xpath="//div[@id='shell_appMenu_AppMenuItem_1']//div[contains(text(),'For 8 hour')]")  //Eight Hour DND inside drop-down
	public WebElement eightHourDND;
	
	@FindBy(xpath="//div[@id='shell_appMenu_AppMenuItem_2']//div[contains(text(),'For 12 hour')]")  //Twelve Hour DND inside drop-down
	public WebElement twelveHourDND;
	
	@FindBy(xpath="//div[@id='shell_appMenu_AppMenuItem_3']//div[contains(text(),'Until I resume')]")  //Until I resume DND inside drop-down
	public WebElement untilIResumeDND;
	
	public void clickSettingDropDwon(){             // Click on Setting Drop-down Icon
		settingDropDown.click();
		log.info("Clicked on the Setting Drop Down Icon");
		test.log(LogStatus.INFO, "Clicked on the Setting Drop Down Icon");
	}
	
	public void clickdndButton(){                   // Click on DND Button inside drop-dow
		
	    dndButton.click();
		log.info("Clicked on the DND Button");
		test.log(LogStatus.INFO, "Clicked on the DND Button");
	}
	
	public boolean dndPresent(){                    // Check if DND Button inside drop-down present
		if(dndButton != null){
			test.log(LogStatus.INFO, "DND toggle visible");
			return true;
		}else{
			test.log(LogStatus.FAIL, "DND toggle not visible");
			return false;
			
		}
	}
		
	public boolean dndSubLabelPresent(){                    // Check if DND Button Sub-Label inside drop-down present
			if(dndSubLabel != null){
				test.log(LogStatus.INFO, "DND toggle sub label visible");
				return true;
			}else{
				test.log(LogStatus.FAIL, "DND toggle sub label not visible");
				return false;
			}
	}
	
	public void clickDNDhour() throws Exception{            // Click on all the options under DND
		oneHourDND.click();
		test.log(LogStatus.INFO, "Clicked on 1 hour DND");
		Thread.sleep(2000);
		eightHourDND.click();
		test.log(LogStatus.INFO, "Clicked on 8 hour DND");
		Thread.sleep(2000);
		twelveHourDND.click();
		test.log(LogStatus.INFO, "Clicked on 12 hour DND");
		Thread.sleep(2000);
		untilIResumeDND.click();
		test.log(LogStatus.INFO, "Clicked on Until I resume DND");
	}
	
	
	
	
			
}
	


