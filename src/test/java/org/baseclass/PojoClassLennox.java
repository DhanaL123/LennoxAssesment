package org.baseclass;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassLennox extends BaseClassLennox {

	public PojoClassLennox() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Sign In']")
	private WebElement signbuttn;

	@FindBy(xpath = "//input[@name='j_username']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='j_password']")
	private WebElement password;
	@FindBy(id = "loginSubmit")
	private WebElement singIn;

	@FindBy(xpath = "//*[@class='gor-navigation pull-left gor-menu-container v2-hmaburger-menu-container']")
	private WebElement MenuButtn;

	@FindBy(xpath = "//*[text()='Build a Proposal']")
	private WebElement Menu3;

	@FindBy(xpath = "//*[text()='Sales Tools']")
	private WebElement Menu1;

	@FindBy(xpath = "//*[text()='SELECT LEAD']")
	private WebElement selectLeadbutton;
	@FindBy(xpath="(//*[text()='ADD LEAD'])[2]")
	private WebElement Addlead;

	@FindBy(xpath="//*[@id='firstName']")
	private WebElement FirstName;
	@FindBy(xpath="//*[@id='lastName']")
	private WebElement LastName;
	@FindBy(id="phNo")
	private WebElement phoneNumber;
	@FindBy(xpath="//input[@id='email']")
	private WebElement mailID;
	@FindBy(id="oldSystemDescription")
	private WebElement scroldown;
	@FindBy(xpath="//*[text()='Add Document']")
	private WebElement scroldown1;
	@FindBy(id="calender1")
	private WebElement SchedulingRequestDate;
	@FindBy(xpath="//*[text()='16']")
	private WebElement requestdate;
	@FindBy(xpath="//*[text()=\"23\"]")
	private WebElement AppointmentDate;
	@FindBy(id="calender2")
	private WebElement calender2;
	@FindBy(xpath="//*[@class='styled-select valid']")
	private WebElement appointmenttime;
	@FindBy(xpath="//*[text()='SAVE LEAD']")
	private WebElement saveButton;
	@FindBy(xpath="//*[text()='Uploads']")
	private WebElement uploadbutton;







	public WebElement getUploadbutton() {
		return uploadbutton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getAppointmenttime() {
		return appointmenttime;
	}

	public WebElement getCalender2() {
		return calender2;
	}

	public WebElement getRequestdate() {
		return requestdate;
	}

	public WebElement getSchedulingRequestDate() {
		return SchedulingRequestDate;
	}

	public void setRequestdate(WebElement requestdate) {
		this.requestdate = requestdate;
	}

	public WebElement getAppointmentDate() {
		return AppointmentDate;
	}

	public void setAppointmentDate(WebElement appointmentDate) {
		AppointmentDate = appointmentDate;
	}

	public WebElement getScroldown() {
		return scroldown;
	}

	public WebElement getScroldown1() {
		return scroldown1;
	}
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getMailID() {
		return mailID;
	}

	public WebElement getAddlead() {
		return Addlead;
	}

	public WebElement getSignbuttn() {
		return signbuttn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSingIn() {
		return singIn;

	}

	public WebElement getMenuButtn() {
		return MenuButtn;
	}

	public WebElement getMenu1() {
		return Menu1;
	}

	public WebElement getMenu3() {
		return Menu3;
	}

	public WebElement getSelectLeadbutton() {
		return selectLeadbutton;
	}

}
