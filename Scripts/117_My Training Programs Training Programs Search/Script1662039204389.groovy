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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/safety-and-prevention/home#/training-provider/my-training-programs')

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (3)'))

WebUI.setText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (4)'), 'cmsproj01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Password_password (4)'), 'pTBJ1/YTiw1lhXE0q4kWzw==')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Remember me_okta-signin-submit (4)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/h1_My Training Programs (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/p_Training programs (3)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_My Training ProgramsPlease select from _775c79 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/button_Submit training program delivery app_2ec0f1 (3)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_CPO approved programsWorking at heights_0f8598 (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Program Type All Safety Training Progra_ffe37b (4)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/button_Search (4)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_JHSC - Part OneApplication review in pr_36c4d9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/label_Program Type'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/label_Delivery Type'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/label_Application Status'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/label_Sort By'), 0)

WebUI.closeBrowser()

