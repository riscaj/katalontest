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

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/h3_CPD_title'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_1635.00_btn btn-red text-white text-_f0c40b'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Next_py-5 text-white text-xl font-bo_2ef24a'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__emailAddress'), 'marisca.julinarti+hrkat@flyingcape.com.sg')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__confirmEmailAddress'), 'marisca.julinarti+hrkat@flyingcape.com.sg')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__companyName'), 'MarsCorp')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__companyUEN'), 'MC1213341')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button__btn btn-dropdown justify-between fo_08df5f'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Mr_flex items-center font-normal w-f_8dcaa9'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input_Capt_firstName'), 'Marisca')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__lastName'), 'Julinarti')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__bussinessMobile'), '687687187212')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__companyAddress1'), 'line')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button__btn btn-dropdown justify-between fo_08df5f_1'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Select_flex items-center font-normal_7f38c3'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__postalCode'), '177899')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_No. of Attendees_custom-input btn bt_826b86'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_No. of Attendees_flex items-center w_d104d3'))

//WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button__btn btn-dropdown justify-between fo_08df5f_2'))

//WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Internet Bank Transfer_flex items-ce_81ca9e'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button__btn btn-dropdown justify-between fo_08df5f_3'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Select_flex items-center font-normal_7f38c3_1'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input_Capt_firstName_1'), 'Owen')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__lastName_1'), 'J')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__emailToValidate'), 'marisca.julinarti+katt21@flyingcape.com.sg')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__confirmEmailToValidate'), 'marisca.julinarti+katt21@flyingcape.com.sg')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__bussinessMobile_1'), '6781871823')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__companyName_1'), 'MarsCorp')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button__btn btn-dropdown justify-between fo_08df5f_5'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Mr_flex items-center font-normal w-f_8dcaa9_1'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input_Capt_firstName_2'), 'Mimo')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__lastName_2'), 'J')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__emailToValidate_1'), 'marisca.julinarti+katt22@flyingcape.com.sg')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__confirmEmailToValidate_1'), 'marisca.julinarti+katt22@flyingcape.com.sg')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__bussinessMobile_2'), '6717818723')

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input__companyName_2'), 'MarsCorp')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/input_Declaration_declarationPolicy'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/input_CSIS Personal Data Protection Policy__78e109'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Back_w-32 px-7 py-2 btn-sm btn-red t_9ef9c4'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/input_PO Number_poNumber'), 'PO12345')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Back_w-32 px-7 py-2 btn-sm btn-red t_9ef9c4_1'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/label_File_text-uplod block text-sm text-f9_1db410'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button__swal2-confirm swal2-styled'))

WebUI.setText(findTestObject('Object Repository/CSIS/Page_CSIS/textarea__comments_3'), 'test')

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button_Back_btn btn-red text-white font-bol_99acb7'))

WebUI.click(findTestObject('Object Repository/CSIS/Page_CSIS/button__swal2-confirm swal2-styled'))

WebUI.closeBrowser()

