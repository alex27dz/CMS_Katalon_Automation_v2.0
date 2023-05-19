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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (10)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (9)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (10)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (16)'))

WebUI.click(findTestObject('field'))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_Review application (1)'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_View details (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_FIELD ASSESSMENT'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Prep  observation'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Program standards'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Provider standards'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Notes'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_Applicant information Applicant Busines_2adfb8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/button_Back to Overview'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_Applicant information  Attestations  Pr_eb0666'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/div_Attestations'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/div_Attestations'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/div_Additional observation'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/div_Additional observation'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Program standards'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Provider standards'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li_Notes'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/button_Back to Overview'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Overview'), 0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img_Aleksey Dzhoharidze_rotated back-arrow'))

WebUI.closeBrowser()

