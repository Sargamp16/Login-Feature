# Login-Feature

Introduction: This repository will cover every general test case related to the Login Form.
<br> 
Web URL: https://rahulshettyacademy.com/locatorspractice/ <br>
Driver Used: Google Chrome

<h3> Test Scenario: Validate the functionality of the login page. </h3>

<h3> Test Cases for Login Page: Non-Functional </h3>
<br>

| Test Case ID | Priority | Description | Actual Result | Expected Result | Status (Pass/Fail) |
| --- | --- | --- | --- | --- | --- |
| TC_01 | P0 | Verify the Company's logo on the page and in the Page Title. | The Company's logo should be on the Page and in its Page Title. | The Company's logo is on the Page and in its Page Title. | Pass |
| TC_02 | P0 | Verify that the login screen contains elements such as Username, Password, Sign in button, Remember password check box, and Forgot password link. | Login screen should have elements such as Username, Password, Sign in button, Remember password check box, and Forgot password link. | Login screen contains elements such as Username, Password, Sign in button, Remember password check box, and Forgot password link.| Pass |
| TC_03 | P1 | Verify that all the fields such as Username and password have a valid placeholder. | All the fields such as Username and password should have a valid placeholder. |  All the fields such as Username and password have a valid placeholder. | Pass |
| TC_04 | P1 | Verify whether all the text boxes have a minimum and maximum length. |  All the text boxes have a minimum and maximum length. | All the text boxes don't have a minimum and maximum length. | Fail |
| TC_05 | P0 | Verify to see if the font style and size of the labels, as well as the text on each object, are clearly visible. | Font style and size of the labels, as well as the text on each object, should be clearly visible. | Font style and size of the labels, as well as the text on each object, are clearly visible. | Pass |
| TC_06 | P1|  Verify that the application’s UI is responsive i.e. it should adjust to different screen resolutions and devices. | Application's UI should be responsive. | Application's UI is responsive. | Pass |
| TC_07 | P1 | Verify that the size, color, and UI of the different elements are as per the specifications. | Size, color, and UI of the different elements should be as per the specifications. | Size, color, and UI of the different elements are as per the specifications. | Pass |

NOTE: The test cases for the login page can be different as per the website used.

<h4> 
  To use different browsers like Firefox and Edge use their respective drivers:
</h4>
  Firefox: 
  System.setProperty("webdriver.gecko.diver","PATH";
  WebDriver driver=new FirefoxDriver();
 
  Edge:
  System.setPropery("webdriver.edge.driver","PATH");
  WebDriver driver=new EdgeDriver();
 



