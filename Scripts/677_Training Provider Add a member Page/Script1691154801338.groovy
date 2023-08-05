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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Please login to access your account. Login'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (10)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Login (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Safety  PreventionAll workers have the _cedcb2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Home (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Workers (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Training providers (4)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Employers (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/h2_CPO-approved training programs'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Working at height training WAHThis Work_995ab9 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Joint health and safety committee train_02ed90 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Free trainings for workers and employer_39eb00 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/h2_Find a CPO-approved training provider (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Training provider company name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Training Program All coursesJHSC - Part_fafa85'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Training provider company name Training_0780b2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Health and safety for small businessesU_09f4f9 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Basic awareness trainingAll employers m_6ad85e (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/li_Training providers (4)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_Check worker eligibilityCheck worker el_347032'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/button_Check eligibility (3)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_Training delivery formats WAH JHSCTrain_4e6767'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_Training delivery modes for Working at _1556d0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/h2_Become an approved training provider (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_Become an approved training provider by_6cde4c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/h2_CPO-approved training programs'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_Working at height training WAHThis Work_995ab9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_Joint health and safety committee train_f5b235'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/div_Joint health and safety committee train_17599b'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Training Providers/li_Home (1)'))

WebUI.click(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Login (10)'))

WebUI.setText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Email_username (11)'), 'cmsproj01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Password_password (11)'), 'pTBJ1/YTiw1lhXE0q4kWzw==')

WebUI.click(findTestObject('Object Repository/Page_My Ontario Account STAGE/input_Remember me_okta-signin-submit (11)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/h1_My Training Programs (3)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Please select from the available option_87c1e7 (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_My Training Programs_circle-container (2)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Submit training program delivery applic_b771ea'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_CPO approved programsWorking at heights_0f8598 (3)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/button_Submit training program delivery app_2ec0f1 (5)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/p_Training programs (4)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Program Type All Safety Training Progra_ffe37b (5)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Program Type All Safety Training Progra_d1773f (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Delivery Type All Training TypesBlended_10cd2c (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Application Status All StatusesIncomple_d94bff (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/div_Sort By StatusProgram Type (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/button_Search (5)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_1 (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/li_1_2 (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Provider - Program Summary/img (3)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Training Provider - Program Summary/img_Alex Dezho_schedule (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/h1_My training schedules'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Training Program All programsJHSC - Par_4a3256'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Training Program All programsJHSC - Par_b4b9a9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Instructorevaluator'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Training typeAllBlendedDistanceeLearnin_513bed'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Class statusAllFullSeats availableLangu_671858'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Schedule statusCurrent  FuturePastCusto_ef482d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Training Location'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/div_Show listings with course fee onlyWeeke_3648a5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Schedules/button_Create a classroom (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Training Schedules/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/h1_My Team (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_SearchRoleAllDesignated signing authori_676fb1 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_First name  Last name  Email  Phone num_9af684 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_Alex  Dezho  cmsproj01gmail.com  (123) _e90459'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_Last login'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_03 Aug 2023'), 0)

WebUI.click(findTestObject('Object Repository/Page_My Team/a_Edit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/h1_Edit member'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/div_Additional Information Designated signi_f2c471'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/h4_Member details'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/div_First name Last name Email addressPhone_225242'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/button_Save member'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Training Classroom/div_Additional Information Designated signi_f2c471'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Training Classroom/img_Alex Dezho_rotated back-arrow'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/button_Add a member (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_My Team/li'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Notifications/h1_Notifications'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Notifications/button_Create notification'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Notifications/div_Category AllClassroomMy learnersMy team_c8b9f4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Notifications/button_Search'), 0)

WebUI.click(findTestObject('Object Repository/Page_Notifications/img (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Learners/h1_My Learners'), 0)

WebUI.click(findTestObject('Object Repository/Page_My Learners/img (1)'))

WebUI.click(findTestObject('Object Repository/Page_Notifications/button_Create notification'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Send notification/h1_Send notification'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Send notification/div_Sending notificationsAll recipients wil_819994'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Send notification/img_Alex Dezho_rotated back-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Notifications/img_1'))

WebUI.click(findTestObject('Object Repository/Page_My Team/button_Add a member (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/h1_Add a member'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_Additional Information Designated signi_f2c471'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/div_First name Last name Email addressPhone_1e7901'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Team/button_Add a second role'), 0)

WebUI.click(findTestObject('Object Repository/Page_My Team/img_Alex Dezho_rotated back-arrow'))

WebUI.click(findTestObject('Object Repository/Page_My Team/img_Alex Dezho_schedule'))

WebUI.click(findTestObject('Object Repository/Page_Training Schedules/button_Create a classroom (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h1_Create a classroom (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Schedule (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Enrolments (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Notifications'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Training program details (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Select program Training type  Language _f99519 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_DateTime 0000 AM  0015 AM  0030 AM  004_3a406b (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Training location'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Street AddressCityTownProvincePlease se_91aa4d (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Seats  pricing (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_Total Seats 1  2  3  4  5  6  7  8  9  _6f0685 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Teaching staff'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_You can add a maximum of three instruct_7ad1ef (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/h4_Contact Information (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/label_Minimum one contact detail is mandatory'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/div_EmailPhone numberWebsite Minimum one co_da7a57 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/label_Publishing this training classroom to_615791'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a classroom/button_Preview classroom (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Create a classroom/img_Alex Dezho_rotated back-arrow (1)'))

WebUI.click(findTestObject('Object Repository/Page_Training Schedules/img_1'))

WebUI.closeBrowser()

