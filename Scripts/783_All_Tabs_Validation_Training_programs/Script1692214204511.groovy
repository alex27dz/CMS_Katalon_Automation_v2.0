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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/safety-and-prevention/home')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Safety  PreventionAll workers have the _cedcb2 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Home (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Workers (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Training providers (5)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Employers (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Working at height training WAHThis Work_995ab9 (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Joint health and safety committee train_02ed90 (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Free trainings for workers and employer_39eb00 (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/h2_Find a CPO-approved training provider (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Training provider company name (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Training Program All coursesJHSC - Part_fafa85 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Training provider company name Training_0780b2 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Basic awareness trainingAll employers m_6ad85e (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Health and safety for small businessesU_09f4f9 (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Basic awareness trainingAll employers m_6ad85e_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_We are ALL responsible  employers, supe_70db6c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Login (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Please login to access your account. Login (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (11)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (11)'))

WebUI.setText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (12)'), 'akhil.pogula@ontario.ca')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Password_password (12)'), 'JsaDmEXgSJc8hsUxZIY+9Q==')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/label_Remember me (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Ontario Account STAGE/div_Dont have an accountCreate AccountORSig_fe4b2d (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Ontario Account STAGE/div_EmailThe email address you registered w_25c7e6'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Remember me_okta-signin-submit (12)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_FR_ontario-header__logo-container ontar_4123cf'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_My Training ProgramsPlease select from _775c79 (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_CPO approved programsWorking at heights_0f8598 (4)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Program Type All Safety Training Progra_ffe37b (6)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/button_Search (6)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/button_Submit training program delivery app_2ec0f1 (6)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/p_Training programs (5)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_akhil po_selected'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_1 (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_1_2 (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Program Summary/li (2)'))

WebUI.rightClick(findTestObject('Object Repository/Page_Training Schedules/div_My training schedules Create a classroom'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_My training schedules Create a classroom'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/Page_Training Schedules/button_Create a classroom (2)'))

WebUI.rightClick(findTestObject('Object Repository/Page_Training Schedules/main_ABC incakhil po3My training schedules _011aaa'))

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Program Summary/li (2)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/button_Create a classroom (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Training Program All programsJHSC - Par_4a3256 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Sort By Earliest start dateMax available seats'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Training Schedules/li'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/h1_My Team (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_SearchRoleAllDesignated signing authori_676fb1 (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/button_Add a member (2)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_First name  Last name  Email  Phone num_9af684 (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_My Team/li_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Notifications/h1_Notifications (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Notifications/div_Category AllClassroomMy learnersMy team_c8b9f4 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Notifications/h1_Notifications (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Notifications/button_Search (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Notifications/li'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Learners/h1_My Learners (1)'), 0)

WebUI.closeBrowser()

