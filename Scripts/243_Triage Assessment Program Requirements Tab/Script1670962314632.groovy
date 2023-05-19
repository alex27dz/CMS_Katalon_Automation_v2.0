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

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (3)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (3)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (3)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (3)'))

WebUI.click(findTestObject('field'))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/Page_InternalPortal/button_Review application'))

WebUI.click(findTestObject('Object Repository/Page_InternalPortal/button_View details'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/li_Applicant information'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_Applicant Business Information  Organiz_677f4d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_Add internal comments for applicant inf_9cb2eb'), 
    0)

WebUI.scrollToPosition(0, 5000)

WebUI.click(findTestObject('Object Repository/Page_InternalPortal/img_Add internal comments for applicant inf_bb2888'))

WebUI.scrollToPosition(0, 5000)

WebUI.click(findTestObject('Object Repository/Page_InternalPortal/li_Attestations'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_Training provider attestationTraining p_cbc9cf'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_Add internal comments for attestations step'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_InternalPortal/li_Program documents'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/li_Attestations'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/li_Program documents'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/li_Program requirements'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_1. Lesson Plan Program review assessmen_7a5645'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_InternalPortal/li_Program requirements'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_InternalPortal/div_Adult learning principles  This section_8ec510'), 
    0)

WebUI.closeBrowser()

