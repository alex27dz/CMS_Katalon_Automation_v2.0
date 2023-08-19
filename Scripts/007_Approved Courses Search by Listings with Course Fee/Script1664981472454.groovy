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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/marketplace/course-search')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/label_Show the listings with course fee only'), 
    'Show the listings with course fee only')

WebUI.rightClick(findTestObject('Object Repository/Page_Marketplace - Course Search/label_Show the listings with course fee only'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/input_Total seats_checkbox-option-Show the _98d51f'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/input_Total seats_checkbox-option-Show the _98d51f'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Course Search/span_Showing 5 course advertisements'), 
    0)

WebUI.closeBrowser()

