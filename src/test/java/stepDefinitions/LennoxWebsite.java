package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClassLennox;
import org.baseclass.PojoClassLennox;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.en.*;

public class LennoxWebsite extends BaseClassLennox {
	PojoClassLennox lennox;

	@Given("User have to lanuch the chrome and hit the URL")
	public void user_have_to_lanuch_the_chrome_and_hit_the_URL() {
		lanuchBrower();
		lanuchURL("https://www.liidaveqa.com/");
		implicitiWait();
		lennox = new PojoClassLennox();

		clickButton(lennox.getSignbuttn());
	}

	@When("User have to enter the username and password")
	public void user_have_to_enter_the_username_and_password() {
		SendData(lennox.getUsername(), "lenproautomation8@lenqat.com");
		SendData(lennox.getPassword(), "Community17");

	}

	@When("click the signIn buttn")
	public void click_the_signIn_buttn() {
		clickButton(lennox.getSingIn());

	}

	@Then("Go to Home and click Menu button")
	public void go_to_Home_and_click_Menu_button() {
		clickButton(lennox.getMenuButtn());
		clickButton(lennox.getMenu1());
		clickButton(lennox.getMenu3());

	}

	@Then("click Select lead buttn")
	public void click_Select_lead_buttn() throws InterruptedException {
		otherclick(lennox.getSelectLeadbutton());
	}
	@Then("click Add Lead button")
	public void click_Add_Lead_button() {
	   clickButton(lennox.getAddlead());
		}
	@Then("enter First name and Last Name")
	public void enter_First_name_and_Last_Name() throws IOException {
	SendData(lennox.getFirstName(), readfromexcel(1, 0));   
	SendData(lennox.getLastName(), readfromexcel(1, 1));
	
	}
	@Then("Enter the phoneNumber and EmailID")
	public void enter_the_phoneNumber_and_EmailID() throws IOException {
	    SendData(lennox.getPhoneNumber(), readfromexcel(1, 2));
	    SendData(lennox.getMailID(), readfromexcel(1, 3));
		
	}
	@Then("ScrollDown and select Select Scheduling Request Date")
	public void scrolldown_and_select_Select_Scheduling_Request_Date() {
	    ScrolDown(lennox.getScroldown());
	    clickButton(lennox.getSchedulingRequestDate());
	    clickButton(lennox.getRequestdate());
	    }

	@Then("select Lead Appointment Date")
	public void select_Lead_Appointment_Date() throws AWTException 
	{	
		clickButton(lennox.getCalender2());
		clickButton(lennox.getAppointmentDate());
//		otherclick(lennox.getAppointmenttime());
		}
	
	@Then("click SavedLead")
	public void click_SavedLead() {
		
		ScrolDown(lennox.getUploadbutton());
		clickButton(lennox.getSaveButton());
		
	   }
	
	
	@Then("saveing the Status ScreenShot")
	public void saveing_the_Status_ScreenShot() throws IOException, InterruptedException {
		waitTime();
		TakeScreenshot();
	}
	
	





	


	
	
	
	

}
