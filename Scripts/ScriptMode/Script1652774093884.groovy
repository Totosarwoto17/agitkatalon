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

WebUI.openBrowser('https://www.lazada.co.id/')

WebUI.navigateToUrl('https://www.lazada.co.id/')

WebUI.click(findTestObject('Object Repository/lazada/Page_Lazada.co.id  Jual Beli Online Terbaik_b46a9c/span_Peralatan Elektronik'))

WebUI.click(findTestObject('Object Repository/lazada/Page_Jual Handphone Samsung Terbaru  Lazada.co.id/div_Layanan LazMallCicilanBayar di TempatDi_d363d0'))

WebUI.click(findTestObject('Object Repository/lazada/Page_Jual Handphone Samsung Terbaru  Lazada.co.id/div_Hapus semua_picture-wrapper'))

WebUI.click(findTestObject('Object Repository/lazada/Page_Samsung Galaxy A03s 464  Lazada Indonesia/a_1955 Penilaian'))

WebUI.click(findTestObject('Object Repository/lazada/Page_Samsung Galaxy A03s 464  Lazada Indonesia/span_Beli Sekarang'))

WebUI.click(findTestObject('Object Repository/lazada/Page_Samsung Galaxy A03s 464  Lazada Indonesia/i_Lazada 2022_next-icon next-icon-close nex_6c4a2e'))

WebUI.closeBrowser()

