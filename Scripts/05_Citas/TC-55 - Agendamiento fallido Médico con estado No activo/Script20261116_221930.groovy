import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.maximizeWindow()

// Asegúrate de usar la URL exacta que te abrió el sistema en TC-53 / TC-54
WebUI.navigateToUrl('https://sistemapruebas.yaelrdf.fun')

WebUI.waitForElementVisible(findTestObject('Page_Sonrisa perfecta/input_Nombre de usuario'), 15)
WebUI.setText(findTestObject('Page_Sonrisa perfecta/input_Nombre de usuario'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Sonrisa perfecta/input_Contraseavisibility_off'), 'hUKwJTbofgPU9eVlw/CnDQ==')
WebUI.sendKeys(findTestObject('Page_Sonrisa perfecta/input_Contraseavisibility_off'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/div_c24'), 15)
WebUI.click(findTestObject('Page_Sonrisa perfecta/div_c24'))

WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/span_addNueva Cita'), 15)
WebUI.click(findTestObject('Page_Sonrisa perfecta/span_addNueva Cita'))

WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/span_Seleccionar Paciente'), 15)
WebUI.click(findTestObject('Page_Sonrisa perfecta/span_Seleccionar Paciente'))

WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/div_c96'), 15)
WebUI.click(findTestObject('Page_Sonrisa perfecta/div_c96'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Sonrisa perfecta/span_Guardar'), 5)
WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/span_Guardar'), 15)
WebUI.enhancedClick(findTestObject('Page_Sonrisa perfecta/span_Guardar'))

WebUI.delay(2)