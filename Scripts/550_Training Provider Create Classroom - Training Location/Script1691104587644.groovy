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

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (6)'))

WebUI.setText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (7)'), 'cmsproj01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Password_password (7)'), 'pTBJ1/YTiw1lhXE0q4kWzw==')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Remember me_okta-signin-submit (7)'))

WebUI.click(findTestObject('schedule alex'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/button_Create a classroom'), 0)

WebUI.click(findTestObject('Object Repository/Page_Training Schedules/button_Create a classroom'))

WebUI.rightClick(findTestObject('Object Repository/Page_Create a classroom/div_Create a classroom'))

WebUI.rightClick(findTestObject('Object Repository/Page_Create a classroom/h1_Create a classroom'))

WebUI.rightClick(findTestObject('Object Repository/Page_Create a classroom/h1_Create a classroom'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h1_Create a classroom'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/li_Schedule'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/li_Enrolments'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/li_Notifications'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Training program details'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Select program Training type  Language _f99519'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Training date  time'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_DateTime 0000 AM  0015 AM  0030 AM  004_3a406b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Street AddressCityTownProvincePlease se_91aa4d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Seats  pricing'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Total Seats 1  2  3  4  5  6  7  8  9  _6f0685'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_You can add a maximum of three instruct_7ad1ef'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Contact Information'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_EmailPhone numberWebsite Minimum one co_da7a57'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Publishing preferences'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/button_Preview classroom'), 0)

WebUI.click(findTestObject('Object Repository/Page_Create a classroom/div_Enrolments'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Enrolments for this classroom You will _8b4a90'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Create a classroom/li_Notifications'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Notifications for this classroom You wi_b625dd'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Notifications for this classroom You wi_b625dd'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Create a classroom/div_Schedule'))

WebUI.click(findTestObject('Object Repository/Page_Create a classroom/img_Alex Dezho_rotated back-arrow'))

WebUI.closeBrowser()

