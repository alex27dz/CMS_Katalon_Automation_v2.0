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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/safety-and-prevention/home')

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Find available courses'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/li_Approved Training Providers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Course Search/div_MLTSD CPO Approved Training CoursesExpl_2ea26a'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/div_MLTSD CPO Approved Training Courses'), 
    'MLITSD CPO Approved Training Courses')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/div_Explore other recommended safety traini_5478a4'), 
    'Explore other recommended safety training by sector or work type')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/div_Working to prevent workplace injuries a_8fc2b8'), 
    'Working to prevent workplace injuries and illnesses, promoting and enforcing employment standards, helping settle workplace disputes and collective agreements, supporting apprenticeships, the skilled trades, industry training and employment services in Ontario.')

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/li_Training Eligibility'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/div_MLTSD CPO Approved Training CoursesExpl_2ea26a'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/div_MLTSD CPO Approved Training Courses'), 
    'MLITSD CPO Approved Training Courses')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/div_Explore other recommended safety traini_5478a4'), 
    'Explore other recommended safety training by sector or work type')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/div_Working to prevent workplace injuries a_8fc2b8'), 
    'Working to prevent workplace injuries and illnesses, promoting and enforcing employment standards, helping settle workplace disputes and collective agreements, supporting apprenticeships, the skilled trades, industry training and employment services in Ontario.')

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Eligibility Checker/li_Approved Training Providers'))

WebUI.rightClick(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/div_MLTSD CPO Approved Training CoursesExpl_2ea26a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/div_MLTSD CPO Approved Training CoursesExpl_2ea26a'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/div_MLTSD CPO Approved Training Courses'), 
    'MLITSD CPO Approved Training Courses')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/div_Explore other recommended safety traini_5478a4'), 
    'Explore other recommended safety training by sector or work type')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/div_Working to prevent workplace injuries a_8fc2b8'), 
    'Working to prevent workplace injuries and illnesses, promoting and enforcing employment standards, helping settle workplace disputes and collective agreements, supporting apprenticeships, the skilled trades, industry training and employment services in Ontario.')

WebUI.closeBrowser()

