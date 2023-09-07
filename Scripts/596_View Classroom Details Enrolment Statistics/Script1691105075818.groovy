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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/safety-and-prevention/home#/training-provider/my-training-programs')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (9)'))

WebUI.setText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (10)'), 'akhil.pogula@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/div_Dont have an accountCreate AccountORSig_fe4b2d'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Password_password (12)'), '5FqiqbTG23n8RmtHkNf4rA==')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Remember me_okta-signin-submit (10)'))

Thread.sleep(3000)

WebUI.click(findTestObject('new schedule'))

WebUI.click(findTestObject('Object Repository/Page_Training Schedules/div_View classroom'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/h1_Training Classroom'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Training Classroom/h1_Training Classroom'), 'Training Classroom')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/div_Training program details Select program_5b1d3b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/div_Training program details Select program_5b1d3b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/div_Training program details Select program_5b1d3b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/button_Edit classroom'), 0)

WebUI.click(findTestObject('Object Repository/Page_Training Classroom/div_Enrolments'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/button_Create enrolment'), 0)

WebUI.click(findTestObject('Object Repository/Page_Training Classroom/button_Create enrolment'))

WebUI.click(findTestObject('Object Repository/Page_Create Enrolment/img_akhil po_rotated back-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Training Classroom/img_akhil po_rotated back-arrow'))

WebUI.closeBrowser()

