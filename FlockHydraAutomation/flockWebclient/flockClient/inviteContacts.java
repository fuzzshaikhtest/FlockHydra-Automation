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
			
			ce.clickInviteContactCancel();

		}
	}
}
