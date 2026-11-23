import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

// Reemplaza la URL por la exacta que usaste en TC-52 si no es la raíz
WebUI.navigateToUrl('https://sistemapruebas.yaelrdf.fun')

WebUI.setText(findTestObject('Page_Sonrisa perfecta/input_Nombre de usuario'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Sonrisa perfecta/input_Contraseavisibility_off'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Page_Sonrisa perfecta/input_Contraseavisibility_off'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/div_c24'), 10)
WebUI.click(findTestObject('Page_Sonrisa perfecta/div_c24'))

WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/span_addNueva Cita'), 10)
WebUI.click(findTestObject('Page_Sonrisa perfecta/span_addNueva Cita'))

WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/span_Seleccionar Paciente'), 10)
WebUI.click(findTestObject('Page_Sonrisa perfecta/span_Seleccionar Paciente'))

WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/div_c96'), 10)
WebUI.click(findTestObject('Page_Sonrisa perfecta/div_c96'))

WebUI.scrollToElement(findTestObject('Page_Sonrisa perfecta/span_Guardar'), 5)
WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/span_Guardar'), 10)
WebUI.enhancedClick(findTestObject('Page_Sonrisa perfecta/span_Guardar'))

WebUI.verifyElementPresent(findTestObject('Page_Sonrisa perfecta/span_Seleccionar Paciente'), 5)