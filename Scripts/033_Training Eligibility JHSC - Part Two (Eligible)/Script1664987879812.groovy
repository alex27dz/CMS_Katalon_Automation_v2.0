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

WebUI.click(findTestObject('eligible'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/button_Name (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/input_Name_input-text ng-untouched ng-prist_4756be (2)'), 
    '1a')

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/button_Phone Number (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/input_Postal Code_input-text ng-untouched n_54d6f1 (2)'), 
    '(111) 111-1112')

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/button_Step 2 (2)'))

WebUI.closeBrowser()

