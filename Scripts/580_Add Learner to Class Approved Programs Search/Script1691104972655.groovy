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

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (22)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (19)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (22)'), 
    'pTBJ1/YTiw1/tnafn7ZGiQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (19)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (22)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (19)'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img (12)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSR Portal/select_Working at HeightsJoint Health  Safe_abc185 (10)'), 
    'wah', true)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (12)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/input_Add learner to class_checkbox-input n_3bd7c8 (4)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Add learner to class (2)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Approved programs'))

WebUI.scrollToPosition(0, 5000)

Thread.sleep(3000)

WebUI.back()

// WebUI.click(findTestObject('viewclassobj'))
WebUI.scrollToPosition(0, 5000)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Class details'))

Thread.sleep(3000)

WebUI.back()

Thread.sleep(3000)

WebUI.back()

Thread.sleep(3000)

WebUI.closeBrowser()

