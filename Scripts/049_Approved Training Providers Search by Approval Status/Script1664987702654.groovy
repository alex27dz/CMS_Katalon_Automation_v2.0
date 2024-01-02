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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/safety-and-prevention/home#/safety-and-prevention/home')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Home/div_Approved training providers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Approved training providers/h2_Approved training providers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Approved training providers/div_Select training program All Safety Trai_d82ecb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Approved training providers/div_Search approved training providers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Approved training providers/div_CPO approval status All training provid_85037c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Approved training providers/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Approved training providers/button_Reset filters'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '1ec91659-d817-473a-8e52-c5a72b2f0696', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '9d17c877-c580-4370-9f5d-d0fb04b09ef1', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '990fba34-05fb-4005-9f83-783d96b38dfb', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '6d534dd1-d001-4ad2-b7da-7e3880b15607', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '3e2f79fd-4dc3-45b5-875c-737921fcf71e', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '00000000-0000-0000-0000-000000000000', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Approved training providers/div_Training type All  In-person  Blended  _18fe5e'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All training providersCurrently CPO-_c633b8'), 
    'false', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All training providersCurrently CPO-_c633b8'), 
    'true', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Approved training providers/select_All Safety Training ProgramsJHSC - P_44ccf3'), 
    '6d534dd1-d001-4ad2-b7da-7e3880b15607', true)

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Reset filters'))

WebUI.click(findTestObject('Object Repository/Page_Approved training providers/button_Search'))

WebUI.closeBrowser()

