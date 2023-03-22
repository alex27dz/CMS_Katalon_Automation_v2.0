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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Course Search/mat-label_Training location'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Course Search/mat-label_Training location'), 
    'Training location')

WebUI.setText(findTestObject('Object Repository/Page_Marketplace - Course Search/input_Training location_mat-autocomplete-tr_f1880a'), 
    'Toronto')

WebUI.sendKeys(findTestObject('Object Repository/Page_Marketplace - Course Search/input_Training location_mat-autocomplete-tr_f1880a'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Marketplace - Course Search/input_Training location_mat-autocomplete-tr_f1880a'), 
    'Toronto')

WebUI.sendKeys(findTestObject('Object Repository/Page_Marketplace - Course Search/input_Training location_mat-autocomplete-tr_f1880a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/app-marketplace_Training Program All Safety_8414d5'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Course Search/span_Showing 5 course advertisements'), 
    0)

WebUI.scrollToPosition(0, 5000)

Thread.sleep(3000)

WebUI.closeBrowser()

