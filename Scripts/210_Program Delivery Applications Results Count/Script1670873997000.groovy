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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/internal-portal-qa/#/program-delivery-applications')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (1) (1)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (1)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (1) (1)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (1)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_SearchProgram delivery format All deliv_81254b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_SearchProgram delivery format All deliv_81254b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/button_Reset'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_SnapshotDec 12, 2022 First Deficiency A_3cfe4a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_All 6 Triage 4 Desk 1 Field  Recommenda_863329'), 
    0)

WebUI.closeBrowser()

