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

Mobile.startExistingApplication(GlobalVariable.APK)

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.Spinner'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.TextView - Andorra'), GlobalVariable.TimeOut)

Mobile.setText(findTestObject('Object Repository/General Store/android.widget.EditText - Enter name here'), GlobalVariable.UserName, 
    GlobalVariable.TimeOut)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.RadioButton - Male'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.Button - Lets  Shop'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('General Store/android.widget.TextView - ADD TO CART'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('General Store/android.widget.FrameLayout'), GlobalVariable.TimeOut)

Mobile.verifyElementText(findTestObject('Object Repository/General Store/android.widget.TextView - Air Jordan 4 Retro'), 
    'Air Jordan 4 Retro')

Mobile.closeApplication()

