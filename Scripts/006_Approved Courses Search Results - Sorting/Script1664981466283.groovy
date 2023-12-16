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

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/safety-and-prevention/cpo-approved-courses')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Training program All Safety Training Pr_3585c8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Training provider'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Training type All  In-person  Blended  _c38467'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Additional training format Elearning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Training location'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Select radiusAll25 kms50 kms100 kms'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_From date'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_To date'), 0)

WebUI.click(findTestObject('Object Repository/Page_Find a CPO approved course/div_Total seats'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Total seats'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Show the listings with course fee only'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Weekend classes only'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Sort by Date Earliest - LatestDate Late_2e06d9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Find a CPO approved course/div_Search  Reset filters Sort by Date Earl_ef08fa'), 
    0)

WebUI.closeBrowser()

