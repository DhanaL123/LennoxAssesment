$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/eclipse-workspace/AssessmentLennox/src/test/resources/Leennoxuser1.feature");
formatter.feature({
  "name": "Validation the LennoxPros website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify the lennoxPros website with user 1",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to lanuch the chrome and hit the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LennoxWebsite.user_have_to_lanuch_the_chrome_and_hit_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LennoxWebsite.user_have_to_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the signIn buttn",
  "keyword": "And "
});
formatter.match({
  "location": "LennoxWebsite.click_the_signIn_buttn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to Home and click Menu button",
  "keyword": "Then "
});
formatter.match({
  "location": "LennoxWebsite.go_to_Home_and_click_Menu_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Select lead buttn",
  "keyword": "And "
});
formatter.match({
  "location": "LennoxWebsite.click_Select_lead_buttn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Add Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "LennoxWebsite.click_Add_Lead_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter First name and Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "LennoxWebsite.enter_First_name_and_Last_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the phoneNumber and EmailID",
  "keyword": "Then "
});
formatter.match({
  "location": "LennoxWebsite.enter_the_phoneNumber_and_EmailID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ScrollDown and select Select Scheduling Request Date",
  "keyword": "And "
});
formatter.match({
  "location": "LennoxWebsite.scrolldown_and_select_Select_Scheduling_Request_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Lead Appointment Date",
  "keyword": "Then "
});
formatter.match({
  "location": "LennoxWebsite.select_Lead_Appointment_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click SavedLead",
  "keyword": "And "
});
formatter.match({
  "location": "LennoxWebsite.click_SavedLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saveing the Status ScreenShot",
  "keyword": "Then "
});
formatter.match({
  "location": "LennoxWebsite.saveing_the_Status_ScreenShot()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d89.0.4389.114)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027JOHNMOHAN\u0027, ip: \u0027192.168.225.157\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.114, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\MOHAN\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:65029}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1c7d242e9bb1dac39e9b090e8133fe68\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat org.baseclass.BaseClassLennox.TakeScreenshot(BaseClassLennox.java:131)\r\n\tat stepDefinitions.LennoxWebsite.saveing_the_Status_ScreenShot(LennoxWebsite.java:93)\r\n\tat ✽.saveing the Status ScreenShot(F:/eclipse-workspace/AssessmentLennox/src/test/resources/Leennoxuser1.feature:15)\r\n",
  "status": "failed"
});
});