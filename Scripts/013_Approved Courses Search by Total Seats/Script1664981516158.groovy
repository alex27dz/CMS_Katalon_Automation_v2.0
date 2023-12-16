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

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/label_Total seats'), 'Total seats')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Total seats_number-button minus'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Total seats_number-button plus'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/img'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/img'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/img'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/img'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/img'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/img'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/img'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/img'))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Reset filters'))

WebUI.closeBrowser()

