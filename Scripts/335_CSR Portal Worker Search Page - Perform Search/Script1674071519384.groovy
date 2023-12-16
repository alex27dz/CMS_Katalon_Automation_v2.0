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

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (26)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (23)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (26)'), 
    'pTBJ1/YTiw1lhXE0q4kWzw==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (23)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (26)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (23)'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img (15)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSR Portal/select_All ProgramsJHSC - Part OneJHSC - Pa_2e89dc (1)'), 
    '9d17c877-c580-4370-9f5d-d0fb04b09ef1', true)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (15)'))

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('Page_CSR Portal/a_Details'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/div_Records of completion'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/div_Notes and events'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/div_Records of completion'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/div_Learners details'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img_Aleksey Dzhoharidze_rotated back-arrow (3)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/div_Training providers'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/div_Employers'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/div_Training providers'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/div_Learners'))

WebUI.scrollToPosition(0, 5000)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/input_Record issued_ontario-checkboxes__inp_42a34b'))

WebUI.click(findTestObject('inputcheckbox'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Merge (10)'))

WebUI.click(findTestObject('search csr'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Cancel (1)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/input_Record issued_ontario-checkboxes__inp_42a34b'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Add learner to class (3)'))

WebUI.closeBrowser()

