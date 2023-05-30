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

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (9)'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img (4)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/h2_Manage profiles (3)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_IDLast nameUse exact matchFirst nameUse_d2be0c (3)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Search (4)'), 0)

WebUI.setText(findTestObject('Object Repository/Page_CSR Portal/input_ID_input-text ng-untouched ng-pristin_eff1cb'), 'IO502876')

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (10)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Worker profile (3)'))

Thread.sleep(3000)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/h4_Worker profile (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Email address (3)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Akhil1gmail.com'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Add learner to class (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Merge (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Edit (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/img_Aleksey Dzhoharidze_rotated back-arrow _18b608'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSR Portal/select_Working at HeightsJoint Health  Safe_abc185 (3)'), 
    'jhsc', true)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img (2)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (2)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/mat-label_Showing 10 results out of 47 (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Merge (7)'))

WebUI.setText(findTestObject('Object Repository/Page_CSR Portal/input_Profile to keep_input-text ng-untouch_f47ea5 (2)'), 
    'NV856946')

WebUI.setText(findTestObject('Object Repository/Page_CSR Portal/input_Profile to keep_input-text ng-untouch_f47ea5 (2)'), 
    'QH196001')

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (9)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Profile to keepJaclyn BinchFebruary 9, _e1b73c (6)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Profile to mergeMartin Cerisano123March_70bd16 (5)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Search Merged profileJaclyn BinchIDNV85_06ae0c (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Merge worker profile (4)'), 0)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/img_Aleksey Dzhoharidze_rotated back-arrow (4)'))

Thread.sleep(3000)

WebUI.closeBrowser()

