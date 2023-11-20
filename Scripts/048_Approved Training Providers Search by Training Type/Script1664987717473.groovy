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

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Find available courses'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/li_Approved Training Providers'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/h2_Find a training provider'), 
    'Find a training provider')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/mat-label_Training type'), 
    'Training type')

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Blended'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Distance'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_eLearning'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_In-Class'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_All'), 'All')

WebUI.closeBrowser()

