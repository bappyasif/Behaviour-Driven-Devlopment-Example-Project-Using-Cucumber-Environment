import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class ValidUserLoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am Navigated To User Login Page")
	def navigateToLoginPage() {
		println ("\n :navigateToLoginPage:  ")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("User Enters Their Crerdentials, (.*) And (.*)")
	def loginCredentials(String userName, String userPassword) {
		println ("\n :loginCredentials:  ")
		println ("\n user _ name : "+userName+"\n user_password : "+userPassword)
		
		WebUI.setText(findTestObject('Object Repository/Login Logout/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), userName)
		
		WebUI.setText(findTestObject('Object Repository/Login Logout/Page_OrangeHRM/input_Username_txtPassword'), userPassword)
		
	}

	@And("Click On Login Button")
	def loginButton() {
		println ("\n :loginButton:  ")
		WebUI.click(findTestObject('Object Repository/Login Logout/Page_OrangeHRM/input_Password_Submit'))
	}

	@Then("User Lands On Dashboard")
	def verifyDashboard() {
		println ("\n :verifyDashboard:  ")
		
		WebUI.verifyElementText(findTestObject('Login Logout/Page_OrangeHRM/h1_Dashboard'), 'Dashboard')
		
		WebUI.verifyElementPresent(findTestObject('Login Logout/Page_OrangeHRM/b_Dashboard'), 2)
		
		WebUI.closeBrowser()
	}
}