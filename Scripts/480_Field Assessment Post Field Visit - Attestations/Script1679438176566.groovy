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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/internal-portal-qa/#/program-delivery-applications')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (3) (1)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (3) (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (3) (1)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (3) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_Review application (2)'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_More details'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_Program nameWorking at Heights - FullPr_4a974e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_TRIAGE Action required by MinistryMay 2_1a2428'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Key events'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_2023 MAY 29Triage stage started Triage _28e611'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Documents'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Notifications'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Overview (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_Alex IncTRIAGE 2  DaysUnder review by P_526885'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img_Aleksey Dzhoharidze_rotated back-arrow (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/h1_Program delivery applications (1)'), 
    0)

WebUI.closeBrowser()

