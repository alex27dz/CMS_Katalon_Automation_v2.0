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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home - Safety and Prevention/div_Working at height training WAHThis Work_995ab9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home - Safety and Prevention/div_Joint health and safety committee train_02ed90'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home - Safety and Prevention/div_Free trainings for workers and employer_39eb00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home - Safety and Prevention/button_Find available courses'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home - Safety and Prevention/button_Find available courses'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home - Safety and Prevention/button_Find available courses'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home - Safety and Prevention/h2_Find a CPO-approved training provider'), 
    0)

WebUI.closeBrowser()

