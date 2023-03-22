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

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/h3_Basic awareness training'), 
    'Basic awareness training')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_All employers must ensure workers and s_2ad5f5'), 
    'All employers must ensure workers and supervisors complete, or have completed, an awareness training program that meets the regulatory requirements. This is mandatory whether they work on a construction project, in a retail store or factory, hospital or long-term care facility, mine or mining plant, or farming operation, etc.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/button_Worker health and safety awareness i_719f0b'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/button_Supervisor health and safety awarene_ce833a'))

WebUI.closeBrowser()

