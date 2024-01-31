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
| TC_02 | P0 | Verify that the login screen contains elements such as Username, Password, Sign in button, Remember password check box, Forgot password link, and create an account link. |
| TC_03 | P1 | Verify that all the fields such as Username and password have a valid placeholder.
| TC_04 | P1 | Verify whether all the text boxes have a minimum and maximum length.
| TC_05 | P0 | Verify to see if the font style and size of the labels, as well as the text on each object, are clearly visible.
| TC_06 | P1|  Verify that the application’s UI is responsive i.e. it should adjust to different screen resolutions and devices.
| TC_07 | P1 | Verify that the size, color, and UI of the different elements are as per the specifications.

NOTE: The test cases for the login page can be different as per the website used.

<h3> 
  To use different browsers like Firefox and Edge use their respective drivers:
  Firefox: 
  System.setProperty("webdriver.gecko.diver","PATH";
  WebDriver driver=new FirefoxDriver();
 
  Edge:
  System.setPropery("webdriver.edge.driver","PATH");
  WebDriver driver=new EdgeDriver();
 
</h3>



