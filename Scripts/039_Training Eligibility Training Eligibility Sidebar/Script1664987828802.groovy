import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/#/safety-and-prevention/home')

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Training providers'))

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/button_Check eligibility'))

WebUI.switchToWindowTitle('Marketplace - Eligibility Checker')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/h3_How to access training records'), 
    'How to access training records?')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/h6_Learner ID  Name on training records'), 
    'Learner ID & Name on training records')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/div_The ministry requires either a Learner _f7fa35'), 
    'The ministry requires either a Learner ID number or full name to look up the eligibility of a learner.The Learner ID is issued by the ministry and is a combination of letters and numbers.The full name only includes the learner\'\'s first and last name.If using name, it must match the name that was submitted to the ministry the last time the learner completed training for a CPO-approved course.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/h6_Email address Phone number Postal code'), 
    'Email address/ Phone number/ Postal code')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/div_The ministry also requires a secondary _885aef'), 
    'The ministry also requires a secondary piece of information to validate the learner\'s identity. It can be any one of the learners: email address, phone number, or postal code.It must match the information that was submitted to the ministry the last time the learner completed training for a CPO-approved course.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/h6_To access training records'), 
    'To access training records')

WebUI.closeBrowser()

