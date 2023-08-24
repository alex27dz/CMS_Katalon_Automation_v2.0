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

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt (24)'), 'aleksey.dzhoharidze@ontario.ca')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (21)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd (24)'), 
    'uJrlGS0s9DWEB1gjPJtQ8Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9 (21)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/header_Assessor Portal Aleksey Dzhoharidze'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/h1_Program delivery applications (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_WAH (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_JHSC (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_All32'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Triage25'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Desk (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Field'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Recommendation2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Approved5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Archived'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/div_SearchProgram delivery format All deliv_81254b (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_Aleksey Dzhoharidze_selected'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_1_2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/li_1_2_3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/button_Search (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img (13)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Assessor Portal/h1_Approved Programs'), 0)

WebUI.click(findTestObject('Object Repository/Page_Assessor Portal/img_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/h2_Manage profiles (4)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Add a worker (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/li_Workers (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/li_Training Providers (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/li_Employers (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_IDLast nameUse exact matchFirst nameUse_d2be0c (4)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Search (13)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Merge (9)'), 0)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/h1_Notifications'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/div_Category AllSort By Newest to oldestOld_1fbfdf'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/button_Search_1 (5)'), 0)

WebUI.click(findTestObject('Object Repository/Page_CSR Portal/img_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/h2_Records of completion'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/li_Learner records'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CSR Portal/li_Classrooms'), 0)

WebUI.closeBrowser()

