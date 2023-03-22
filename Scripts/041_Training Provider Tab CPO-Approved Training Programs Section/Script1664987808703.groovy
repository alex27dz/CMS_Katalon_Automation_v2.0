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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/#/safety-and-prevention/home')

Thread.sleep(3000)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Home/h3_Working at height training WAH'), 
    'Working at height training [WAH]')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_This Working at Heights Training Progra_32ec01'), 
    'This Working at Heights Training Program Standard sets out the requirements that must be met by training programs submitted to the Chief Prevention Officer (CPO) for approval. It should be read in conjunction with the Working at Heights Training Provider Standard, which sets out the requirements that must be met by training providers seeking approval by the CPO to deliver an approved working at heights training program.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Find available courses'), 
    'Find available courses')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Home/h3_Joint health and safety committee training JHSC'), 
    'Joint health and safety committee training [JHSC]')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Home/div_Certification of certain Joint Health a_488373'), 
    'Certification of certain Joint Health and Safety Committee (JHSC) members is required under section 9 of Ontario’s Occupational Health and Safety Act (OHSA). The JHSC Certification Training Program Standard specifies the criteria that a program must meet in order to be approved by the Chief Prevention Officer (CPO).')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Find available courses'), 
    'Find available courses')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Home/h3_Free trainings for workers and employers'), 
    'Free trainings for workers and employers')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Prevention Landing Page - Home/button_Find available courses'), 
    'Find available courses')

WebUI.closeBrowser()

