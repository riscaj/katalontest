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

WebUI.navigateToUrl('https://csisweb-test.flyingcapetech.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/img_From 54.50_2xlmax-h-268px lgmax-h-190px_a89359'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Book now'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Individual Booking'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__emailAddress'), 'marisca.julinarti+katalon1@flyingcape.com.sg')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__confirmEmailAddress'), 'marisca.julinarti+katalon1@flyingcape.com.sg')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/span_Select'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/span_Ms'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input_Capt_firstName'), 'Marisca')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__lastName'), 'K')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__contactNumber'), '6878177182')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__billingAddress1'), 'line')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Select'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/span_Singapore'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__postalCode'), '178188')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/span_Select_1'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/span_Internet Bank Transfer'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/input_Declaration_declarationPolicy'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/input_CSIS Personal Data Protection Policy__78e109'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Next'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Pay'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_OK'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/label_Select File'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_OK'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/textarea_test'), 'test')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Submit'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_OK'))

WebUI.closeBrowser()

