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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/#/training-provider/my-training-programs')

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/div_Dont have an accountCreate AccountORSig_b8d1de'))

WebUI.setText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (1) (1)'), 'cmsproj01@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/div_Dont have an accountCreate AccountORSig_b8d1de'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Password_password (1) (1)'), 
    'pTBJ1/YTiw1lhXE0q4kWzw==')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Remember me_okta-signin-submit (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Program Summary/button_Submit training program delivery app_2ec0f1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Training Provider - Create new application/select_Select training programJHSC - Part O_95772d'), 
    '3e2f79fd-4dc3-45b5-875c-737921fcf71e', true)

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Create new application/label_English'))

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Create new application/label_eLearning'))

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Create new application/button_Start new application'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Training Provider - Create new applica_585dfb/h2_Application for Joint Health and Safety _233226'), 
    'Application for Joint Health and Safety Committee training program delivery')

WebUI.scrollToPosition(0, 6000)

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Create new applica_585dfb/div_Applicant information'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Training Provider - Create new applica_585dfb/div_Applicant information'), 
    'Applicant information')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Create new applica_585dfb/div_This section requires you to provide co_a54041'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Create new applica_585dfb/div_Applicant informationDesigning signing _c2aeae'), 
    0)

WebUI.closeBrowser()

