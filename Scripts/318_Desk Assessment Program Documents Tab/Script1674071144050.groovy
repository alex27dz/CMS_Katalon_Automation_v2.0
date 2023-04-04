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

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (7)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (6)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (7)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (6)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/h1_Program delivery applications'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_WAH'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_JHSC'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/ul_All 2 Triage  Desk  Field 1 Recommendati_b64648'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_All 2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Triage'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Desk'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_SearchProgram delivery format All deliv_81254b'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_JHSC'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_Ministry action'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_Ministry'), 0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/input_Search_input-text ng-untouched ng-pri_6c3f6c'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_All'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_Applicant'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/a_Provider profile'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/button_Review application'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_ABCs Training CenterFIELD 8 days Pre-fi_a4fb97'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_Review application'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_View details'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_Applicant information  Attestations  Pr_328caf'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/ul_Applicant information  Attestations  Pro_8b1ebd'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Attestations'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Program documents'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_1. Lesson PlanIMG_7591.JPGUploaded On D_41d201'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Program requirements'))

WebUI.closeBrowser()

