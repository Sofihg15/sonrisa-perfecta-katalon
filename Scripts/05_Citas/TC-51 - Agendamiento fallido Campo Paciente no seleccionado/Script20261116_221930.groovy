 /*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-51 - Agendamiento fallido: Campo "Paciente" no seleccionado.
 * Modulo: CU-CITAS (Gestión de Citas) | Criticidad: Alta | Perfil: Recepcionista
 * Responsable: Andrea Itzayana Ortega Prieto
 *
 * Pre-condiciones:
 * 1. Sesión activa en el sistema (Recepcionista o Médico). 2. El catálogo de BD debe tener pacientes y
 * médicos registrados previamente. 3. El paciente objetivo debe estar buscado y seleccionado en la
 * barra superior para habilitar el botón 'Nueva Cita'. 4. La pantalla de Gestión de Citas debe estar
 * visible.
 *
 * Pasos:
 * Clic Nueva Cita Dejar Paciente vacío Clic Guardar
 *
 * Resultado esperado:
 * Error: Campo obligatorio
 *
 * Valores de entrada:
 * Paciente: Vacío
 *
 * COMO COMPLETAR ESTE CASO:
 * 1. Abre el caso en Katalon Studio y usa Web Recorder (o Spy) para grabar
 *    los pasos sobre https://sistemapruebas.yaelrdf.fun
 * 2. Reemplaza el codigo de abajo por los pasos grabados y agrega
 *    verificaciones (WebUI.verifyElementText / verifyElementPresent)
 *    segun el resultado esperado de arriba.
 * 3. Los valores de entrada de la matriz estan solo como referencia en
 *    este comentario; no se ejecutan como codigo.
 */ import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://sistemapruebas.yaelrdf.fun/medicos')

WebUI.setText(findTestObject('Page_Sonrisa perfecta/input_Nombre de usuario'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Sonrisa perfecta/input_Contraseavisibility_off'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Page_Sonrisa perfecta/input_Contraseavisibility_off'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Sonrisa perfecta/div_c24'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/i_add'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/span_Guardar'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/i_save'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/div_2'))

WebUI.verifyElementPresent(findTestObject('Page_Sonrisa perfecta/span_Seleccionar Paciente'), 5)

