import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

// Usa la misma URL que te funcionó en TC-52 / TC-53 (evita /medicos o rutas cortadas)
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

// Si el formulario exige seleccionar Tipo de Cita o fecha/hora para agendar sin médico,
// agrega aquí abajo los pasos correspondientes de tu Object Repository antes de guardar.

WebUI.scrollToElement(findTestObject('Page_Sonrisa perfecta/span_Guardar'), 5)
WebUI.waitForElementClickable(findTestObject('Page_Sonrisa perfecta/span_Guardar'), 10)
WebUI.enhancedClick(findTestObject('Page_Sonrisa perfecta/span_Guardar'))

WebUI.verifyElementPresent(findTestObject('Page_Sonrisa perfecta/span_addNueva Cita'), 5)