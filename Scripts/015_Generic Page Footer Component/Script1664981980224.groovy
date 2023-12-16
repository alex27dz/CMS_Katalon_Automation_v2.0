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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/safety-and-prevention/cpo-approved-courses')

Thread.sleep(3000)

WebUI.scrollToPosition(0, 60000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Course Search/div_Ministry of Labour, Training and Skills_1cf71b'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/h2_Ministry of Labour, Training and Skills _ca15bc'), 
    'Ministry of Labour, Immigration, Training and Skills Development')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/a_About Ontario'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/a_About Ontario'), 'About Ontario')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/a_Accessibility'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/a_Accessibility'), 'Accessibility')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/a_News'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/a_News'), 'News')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/a_Privacy'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/a_Privacy'), 'Privacy')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/a_Terms of Use'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/a_Terms of Use'), 'Terms of Use')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/a_Queens Printer for Ontario, 201221'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/a_Queens Printer for Ontario, 201221'), 
    '© King\'s Printer for Ontario, 2012–22')

Thread.sleep(3000)

WebUI.closeBrowser()

