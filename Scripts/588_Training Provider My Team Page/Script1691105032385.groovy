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

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (8)'))

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (9)'))

WebUI.setText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (9)'), 'cmsproj01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Password_password (9)'), 'pTBJ1/YTiw1lhXE0q4kWzw==')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Remember me_okta-signin-submit (9)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/img (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Program Summary/img (2)'))

WebUI.click(findTestObject('Object Repository/Page_My Learners/img'))

WebUI.click(findTestObject('Object Repository/Page_Notifications/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/h1_My Team'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Team/h1_My Team'), 'My Team')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_First name  Last name  Email  Phone num_9af684'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_SearchRoleAllDesignated signing authori_676fb1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/button_Add a member'), 0)

WebUI.closeBrowser()

