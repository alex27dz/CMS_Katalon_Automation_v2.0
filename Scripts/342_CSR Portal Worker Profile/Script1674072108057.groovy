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

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (8)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (7)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (8)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (7)'))

WebUI.click(findTestObject('csr portal button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CSR Portal/span_CSR Portal'), 'CSR Portal')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/span_CSR Portal'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/h2_Manage profiles (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/li_Workers (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/li_Training Providers (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/li_Employers (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_IDLast nameUse exact matchFirst nameUse_d2be0c (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_ID'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Last name (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_First nameUse exact match'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Middle intials'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Email address (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Phone number (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Address (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_City (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Postal code (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Course Type Working at HeightsJoint Hea_9c97c9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Search (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Add a worker (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Add a worker (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/h4_Add a worker (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_First name (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Last name_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Email address_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Phone number_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Secondary email address (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Secondary phone number (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Address_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_City_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Postal code_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Sharing of information Consent to the M_67b6e8 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Create Profile  Cancel (1)'), 0)

WebUI.closeBrowser()

