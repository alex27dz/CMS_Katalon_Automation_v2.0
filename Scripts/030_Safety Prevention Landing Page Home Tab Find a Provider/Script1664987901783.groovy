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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/marketplace/course-search')

WebUI.setText(findTestObject('Object Repository/Page_Marketplace - Course Search/input_Training provider_mat-autocomplete-tr_d9d537'), 
    'better test')

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/div_Training Program All Safety Training Pr_fda766'))

WebUI.click(findTestObject('Object Repository/Page_Marketplace - Course Search/button_Search (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Course Search/div_In-ClassJune09FridaySeats available2323_fbbfe5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marketplace - Course Search/div_Training provider'), 0)

WebUI.closeBrowser()

