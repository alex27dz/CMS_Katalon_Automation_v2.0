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

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (12)'))

WebUI.setText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (13)'), 'cmsproj01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Password_password (13)'), 'pTBJ1/YTiw1lhXE0q4kWzw==')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Remember me_okta-signin-submit (13)'))

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Program Summary/a_View details (7)'))

Thread.sleep(3000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/h2_My training programs (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Number of certificates issued  0  Numbe_41efa8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_OverviewKey eventsApplication ReviewPro_a37495'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_Overview (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_Key events (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_Application Review (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Key events'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Additional InformationAssigned assessor_88f363'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_OverviewKey eventsApplication ReviewSor_fe896d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Sort ByLatestEarliestFilter ByShow all3_226b07 (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Program Summary/a_Back to my training programs'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/h1_My Training Programs (4)'), 
    0)

WebUI.closeBrowser()

