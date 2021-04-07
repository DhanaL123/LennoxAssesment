Feature: Validation the LennoxPros website 
Scenario: verify the lennoxPros website with user 1
    Given User have to lanuch the chrome and hit the URL
    When User have to enter the username and password 
    And click the signIn buttn
    Then Go to Home and click Menu button
    And click Select lead buttn
    And click Add Lead button
    And enter First name and Last Name
    Then Enter the phoneNumber and EmailID
    And ScrollDown and select Select Scheduling Request Date
     Then select Lead Appointment Date	
     And click SavedLead
     
     Then saveing the Status ScreenShot
     
  
    