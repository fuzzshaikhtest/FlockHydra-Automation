package flockClient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseTestSuite;
import utilities.DataInputs;

public class inviteContacts extends BaseTestSuite {
	/*
	 * Created on 10th August 2017 By Farzan Shaikh
	 */

	private static final Logger log = LogManager.getLogger(searchPlus.class.getName());

	@Test(priority = 1)
	public void appMenuInvite() {
		if (ce.inviteAppMenuPresent()) {

			ce.clickinviteAppMenu();
			if(ce.inviteContactModalDisplayed()){
				inviteModalTextContent();
			}
				
			
			ce.clickInviteContactCancel();
		}
	}
	
	public void inviteModalTextContent(){
		gm.elementDisplayed(By.xpath("//div[contains(@class,'invite-dialog') and contains(@role,'dialog')]//div[contains(text(),'Invite team members')]"), "Invite Modal Header");
		gm.getText(By.xpath("//div[contains(@class,'invite-dialog') and contains(@role,'dialog')]//div[contains(text(),'Invite team members')]"));
		gm.compareText(By.xpath("//div[contains(@class,'invite-dialog') and contains(@role,'dialog')]//div[contains(text(),'Invite team members')]"), "Invite team members");
		
		gm.elementDisplayed(By.xpath("//div[contains(@class,'invite-dialog') and contains(@role,'dialog')]//p[contains(@class,'invite-modal-text')]"), "Invite Modal SubHeader");
		gm.getText(By.xpath("//div[contains(@class,'invite-dialog') and contains(@role,'dialog')]//p[contains(@class,'invite-modal-text')]"));
		gm.compareText(By.xpath("//div[contains(@class,'invite-dialog') and contains(@role,'dialog')]//p[contains(@class,'invite-modal-text')]"), "Flock works best when your team is here too. Add members by entering their email ID.");
		
		gm.isElementPresent("//div[contains(@class,'inputBoxWrapper') and contains(@class,'emailInput') and @tabindex='1']//input[@placeholder='Enter an email ID']", "xpath");
		gm.getText(By.xpath("//div[contains(@class,'inputBoxWrapper') and contains(@class,'emailInput') and @tabindex='1']//input[@placeholder='Enter an email ID']"));
		gm.compareText(By.xpath("//div[contains(@class,'inputBoxWrapper') and contains(@class,'emailInput') and @tabindex='1']//input[@placeholder='Enter an email ID']"), "Enter an email ID");
		
		gm.isElementPresent("//div[contains(@class,'invite-dialog')]//button[contains(text(),'Invite')]", "xpath");
		gm.getText(By.xpath("//div[contains(@class,'invite-dialog')]//button[contains(text(),'Invite')]"));
		gm.compareText(By.xpath("//div[contains(@class,'invite-dialog')]//button[contains(text(),'Invite')]"), "Invite");
	}
}
