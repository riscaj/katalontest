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

WebUI.navigateToUrl('https://siis.flyingcapetech.com/signupPage')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/li_Individual'))

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/input_Corporate_radio-buttons'))

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/svg_Select_shrink-0 ml-1 fill-current text-757575'))

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/span_Miss'))

WebUI.setText(findTestObject('Object Repository/SGTech/Page_SGTech Web/input_Ms_firstName'), 'Marisca')

WebUI.setText(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__lastName'), 'J')

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/div_Contact Number'))

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/div_Select_css-ackcql'))

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/div_Assistant Rec'))

WebUI.setText(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__contactNo'), '67676786878')

WebUI.setText(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__employementTitle'), 'QA')

WebUI.setText(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__OrganisationList'), '')

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__OrganisationList'))

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/span_M3ta Singapore Pte Ltd'))

WebUI.setText(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__emailText'), 'mariscajl')

WebUI.setEncryptedText(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__password'), 'oGzcSJoTeTz1IjtchRx/EQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__passwordSalt'), 'oGzcSJoTeTz1IjtchRx/EQ==')

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/input__isCheck'))

WebUI.click(findTestObject('Object Repository/SGTech/Page_SGTech Web/button_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/SGTech/Page_SGTech Web/h2_Success'), 'Success')

WebUI.closeBrowser()

