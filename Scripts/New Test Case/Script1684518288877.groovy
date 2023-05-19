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

WebUI.navigateToUrl('https://login.microsoftonline.com/cddc1229-ac2a-4b97-b78a-0e5cacb5865c/oauth2/authorize?client_id=548574b0-d352-43a6-8116-f22c8329b4b3&response_type=code&redirect_uri=https%3A%2F%2Fadfsonekey-auth.login.sys.uat.cf.az.cihs.gov.on.ca%2Flogin%2Fcallback%2Faad-oidc&state=Lhxv69yAu4&scope=openid+email+profile&nonce=sUVATMFzBS73#/program-delivery-applications')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (19)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (19)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img (10)'))

WebUI.switchToWindowTitle('Sign in to your account')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Dzhoharidze, Aleksey (MTO)'))

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/li'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/input_ID_input-text ng-untouched ng-pristin_eff1cb'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSR Portal/select_Working at HeightsJoint Health  Safe_abc185 (8)'), 
    'jhsc', true)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (10)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Worker profile (3)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Worker profile (3)'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CSR Portal/div_CD658662'))

WebUI.switchToWindowTitle('CSR Portal')

WebUI.setText(findTestObject('Object Repository/Page_CSR Portal/input_ID_input-text ng-untouched ng-pristin_eff1cb'), 'CD658662')

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Search (10)'))

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/button_Worker profile (3)'))

WebUI.closeBrowser()

