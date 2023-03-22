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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '3e2f79fd-4dc3-45b5-875c-737921fcf71e', true)

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '6d534dd1-d001-4ad2-b7da-7e3880b15607', true)

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '990fba34-05fb-4005-9f83-783d96b38dfb', true)

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '9d17c877-c580-4370-9f5d-d0fb04b09ef1', true)

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.closeBrowser()

