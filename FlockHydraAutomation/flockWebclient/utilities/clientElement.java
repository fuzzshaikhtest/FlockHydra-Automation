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

public class clientElement {
	ExtentTest test;
	WebDriver driver;
	WebElement element = null ;
	
	private static GenericMethods gm ;
	private static final Logger log = LogManager.getLogger(clientElement.class.getName());
	
	public clientElement(WebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
		}
	@BeforeMethod
	public void beforeMethod(){
		
	}
	
	@FindBy(id="shell_plus_PlusWidget_0")
	public WebElement univerlSearchPlusIcon;
	
	public boolean univerlSearchPlusIconPresent(){
		if(univerlSearchPlusIcon != null){
			log.info("The universal SearchPlus Icon is present");
			test.log(LogStatus.INFO, "The universal SearchPlus Icon is present");
			return true;
		}else{
			log.info("The universal SearchPlus Icon is present");
			test.log(LogStatus.FAIL, "The universal SearchPlus Icon is present");
			return false;
		}
	}
	
	public void clickUniverlSearchPlusIcon(){
		if(univerlSearchPlusIcon.getSize() != null){
		
		univerlSearchPlusIcon.click();
		log.info("Clicked on the Universal Search Button");
		test.log(LogStatus.INFO, "Clicked on the sUniversal Search Button");
		}else{
			log.info("Not clicked on the Universal Search Button");
			test.log(LogStatus.INFO, "Not clicked on the Universal Search Button");
		}
	}
	
	@FindBy(xpath="//div[@class='plus-item__icon group']")
	WebElement searchPlusCreateChannelButton;
	
	public void  clickSearchPlusCreateChannel(){
		if(searchPlusCreateChannelButton.getSize() != null){
			searchPlusCreateChannelButton.click();
			test.log(LogStatus.INFO, "The Create Channel Option is clicked");
			log.info("The Create Channel Option is not clicked");
		}else{
			test.log(LogStatus.ERROR, "The Create Channel Option is not clicked");
			log.info("The Create Channel Option is not clicked");
		}		
	}
	
	@FindBy(xpath="//div[contains(@class,'channel-type-dialog')]//span[@role='button']")
	WebElement startNewChannelCancel;
	
	public void  clickStartChannelModalClose(){
		if(startNewChannelCancel.getSize() != null){
			startNewChannelCancel.click();
			test.log(LogStatus.INFO, "The Cancle option in StartNewChannel Modal is clicked");
			log.info("The Cancle option in StartNewChannel Modal is clicked");
		}else{
			test.log(LogStatus.ERROR, "The Cancle option in StartNewChanne Modal is not clicked");
			log.info("The Cancle option in StartNewChannel Modal is not clicked");
		}		
	}
	
	@FindBy(xpath="//div[@class='plus-item__icon join_channel']")
	WebElement searchPlusJoinChannelButton;
	
	public void clickSearchPlusJoinChannel(){
		if(searchPlusJoinChannelButton.getSize() !=  null){
			searchPlusJoinChannelButton.click();
			test.log(LogStatus.INFO, "The Join Channel Button is clicked");
			log.info("The Join Channel Button is clicked");
		}else{
			test.log(LogStatus.ERROR, "The Join Channel Button could not be clicked clicked");
			log.info("The Join Channel Button could not be clicked clicked");
		}		
	}
	
	@FindBy(xpath="//div[contains(@class,'group-discovery')]//span[contains(@role,'button')]")
	WebElement joinChannelCancel;
	
	public void  clickJoinChannelModalClose(){
		if(joinChannelCancel.getSize() != null){
			joinChannelCancel.click();
			test.log(LogStatus.INFO, "The Cancle option in Join Channel Modal is clicked");
			log.info("The Cancle option in Join Channel Modal is clicked");
		}
		else{
			test.log(LogStatus.ERROR, "The Cancle option in Join Channel Modal is not clicked");
			log.info("The Cancle option in Join Channel Modal is not clicked");
		}		
	}

	@FindBy(xpath="//div[@class='plus-item__icon invite']")
	WebElement searchPlusInviteButton;
	
	public void clickSearchPlusInviteButton(){
		if(searchPlusInviteButton.getSize() !=  null){
			searchPlusInviteButton.click();
			test.log(LogStatus.INFO, "The Invite Contact Button is clicked");
			log.info("The Invite Contact Button is clicked");
		}else{
			test.log(LogStatus.ERROR, "The Invite Contact Button could not be clicked clicked");
			log.info("The Invite Contact Button could not be clicked clicked");
		}		
	}

	@FindBy(xpath="//div[contains(@class,'invite-dialog')]//span[@role='button']")
	WebElement inviteContactCancel;
	
	public void  clickInviteContactCancel(){
		if(inviteContactCancel.getSize() != null){
			inviteContactCancel.click();
			test.log(LogStatus.INFO, "The Cancle option in Invite Contact Modal is clicked");
			log.info("The Cancle option in Invite Contact Modal is clicked");
		}else{
			test.log(LogStatus.ERROR, "The Cancle option in Invite Contact Modal is not clicked");
			log.info("The Cancle option in Invite Contact Modal is not clicked");
		}		
	}
	
	@FindBy(xpath="//div[contains(@class,'app_menu_invite')]")
	WebElement inviteAppMenu;
	
	public boolean inviteAppMenuPresent(){
		if(inviteAppMenu != null){
			log.info("The Invite hook in the App Menu is present");
			test.log(LogStatus.INFO, "The Invite hook in the App Menu is present");
			return true;
		}else{
			log.info("The Invite hook in the App Menu is present");
			test.log(LogStatus.FAIL, "The Invite hook in the App Menu is present");
			return false;
		}
	}
	
	public void clickinviteAppMenu(){
		if(inviteAppMenu != null){
			inviteAppMenu.click();
			test.log(LogStatus.INFO, "The Invite Option in the App Menu is clicked");
			log.info("The Invite Option in the App Menu is clicked");
		}else{
			test.log(LogStatus.ERROR, "The Invite Option in the App Menul is not clicked");
			log.info("The Invite Option in the App Menu is not clicked");
		}		
	}
	
	@FindBy(className="invite__contacts")
	WebElement inviteRoster;
	
	public boolean inviteRosterPresent(){
		if(inviteRoster != null){
			log.info("The Invite Option in Roster is present");
			test.log(LogStatus.INFO, "The Invite Option in Roster is present");
			return true;
		}else{
			log.info("The Invite Option in Roster is not present");
			test.log(LogStatus.FAIL, "The Invite Option in Roster is not present");
			return false;
		}
	}
	
	public void clickInviteRoster(){
		if(inviteRoster != null){
			inviteRoster.click();
			test.log(LogStatus.INFO, "The Invite Option in the Roster is clicked");
			log.info("The Invite Option in the Roster is clicked");
		}else{
			test.log(LogStatus.ERROR, "The Invite Option in the Roster is not clicked");
			log.info("The Invite Option in the Roster is not clicked");
		}		
	}
	
	@FindBy(className="conv-search__editor")
	WebElement universalSearchBarEditor;
	
	public boolean universalSearchBarEditorPresent(){
		if(universalSearchBarEditor != null){
			log.info("The universal search bar editor is present");
			test.log(LogStatus.INFO, "The uuniversal search bar editor is present");
			return true;
		}else{
			log.info("The universal search bar editor is present");
			test.log(LogStatus.FAIL, "The universal search bar editor is present");
			return false;
		}
	}
	
	public void clickUniversalSearchBarEditor(){
		if(universalSearchBarEditor != null){
			universalSearchBarEditor.click();
			test.log(LogStatus.INFO, "Clicked inside the universal search bar editor");
			log.info("Clicked inside the universal search bar editor");
		}else{
			test.log(LogStatus.ERROR, "Can not click inside the universal search bar editor");
			log.info("Can not click inside the universal search bar editor");
		}		
	}
	
	@FindBy(className="search__handle-search")
	WebElement universalSearchBarIcon;
	
	public void clickUniversalSearchBarIcon(){
		if(universalSearchBarIcon != null){
			universalSearchBarIcon.click();
			test.log(LogStatus.INFO, "Clicked on the universal search magnifying glass icon");
			log.info("Clicked  on the universal search magnifying glass icon");
		}else{
			test.log(LogStatus.ERROR, "Can not click on the universal search magnifying glass icon");
			log.info("Can not click on the universal search magnifying glass icon");
		}		
	}
	
	public boolean universalSearchBarIconPresent(){
		if(universalSearchBarIcon != null){
			log.info("The universal search bar icon is present");
			test.log(LogStatus.INFO, "The uuniversal search bar icon is present");
			return true;
		}else{
			log.info("The universal search bar icon is present");
			test.log(LogStatus.FAIL, "The universal search bar icon is present");
			return false;
		}
	}
	
	@FindBy(xpath="//div[contains(@class,'invite-dialog') and contains(@role,'dialog')]")
	WebElement inviteContactModal;
	
	public boolean  inviteContactModalDisplayed(){
		if(inviteContactModal.isDisplayed()){
			log.info("The Invite Contact Modal is displayed");
			test.log(LogStatus.INFO, "The Invite Contact Modal is displayed");
			return true;
		}else{
			log.info("The Invite Contact Modal is not displayed");
			test.log(LogStatus.FAIL, "The Invite Contact Modal is not displayed");
			return false;
		}
	}
	
	public boolean inviteContactModalPresent(){
		if(inviteContactModal != null){
			log.info("The Invite Contact Modal is present");
			test.log(LogStatus.INFO, "The Invite Contact Modal is present");
			return true;
		}else{
			log.info("The Invite Contact Modal is not present");
			test.log(LogStatus.FAIL, "The Invite Contact Modal is not present");
			return false;
		}
		
	}
	
}
