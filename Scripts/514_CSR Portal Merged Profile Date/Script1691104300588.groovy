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

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (20)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (17)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (20)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('clicocila'))

WebUI.click(findTestObject('crs workers'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Merge (8)'))

WebUI.setText(findTestObject('Object Repository/Page_CSR Portal/input_Profile to keep_input-text ng-untouch_f47ea5 (3)'), 
    'QR732909')

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (11)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/img_Aleksey Dzhoharidze_rotated back-arrow (5)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search_1 (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSR Portal/select_Working at HeightsJoint Health  Safe_abc185 (9)'), 
    'wah', true)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search_1 (4)'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CSR Portal/div_AI041548'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/div_Phone number (2)'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CSR Portal/div_DT466363'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Merge (8)'))

WebUI.setText(findTestObject('Object Repository/Page_CSR Portal/input_Profile to keep_input-text ng-untouch_f47ea5 (3)'), 
    'DT466363')

WebUI.setText(findTestObject('settext'), 'AI041548')

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (11)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_July 28, 2023'), 0)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/img_Aleksey Dzhoharidze_rotated back-arrow (5)'))

WebUI.closeBrowser()

