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

WebUI.openBrowser('https://accounts.bukalapak.com/register/')

WebUI.setText(findTestObject('buka/Page_Daftar Akun Bukalapak  Bukalapak/input_Nomor handphone atau email_bl-text-field__input'), 
    email)

WebUI.click(findTestObject('buka/Page_Daftar Akun Bukalapak  Bukalapak/button_Daftar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('buka/Page_Daftar Akun Bukalapak  Bukalapak/button_Ya, kirim kode'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('buka/Page_Daftar Akun Bukalapak  Bukalapak/div_Kode rahasia'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('buka/Page_Daftar Akun Bukalapak  Bukalapak/button_Verifikasi'))

WebUI.setText(findTestObject('buka/Page_Daftar Akun Bukalapak  Bukalapak/input_Nama lengkap_bl-text-field__input'), nama)

WebUI.setEncryptedText(findTestObject('buka/Page_Daftar Akun Bukalapak  Bukalapak/div_Password'), password)

WebUI.click(findTestObject('buka/Page_Daftar Akun Bukalapak  Bukalapak/button_Simpan'))

WebUI.closeBrowser()

