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

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/h3_Supporting Ontarios Safe Employers Program'), 
    'Supporting Ontario’s Safe Employers Program')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_Supporting Ontarios Safe Employers is a_ec7ea0'), 
    'Supporting Ontario’s Safe Employers is a voluntary Ministry of Labour, Training and Skills Development program run by the Chief Prevention Officer (CPO). It promotes health and safety in the workplace and helps reduce injuries and illness.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/button_More info'))

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/button_More info'))

Thread.sleep(3000)

WebUI.closeBrowser()

