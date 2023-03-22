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

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/div_Provider nameCityTownRegistered address_186803'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/label_Provider name'), 
    'Provider name')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/label_CityTown'), 'City/Town')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/label_Registered address'), 
    'Registered address')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/label_Contact'), 'Contact')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/label_Offered to'), 
    'Offered to')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Marketplace - Approved Provider List/label_Program offered'), 
    'Program offered')

WebUI.closeBrowser()

