 /*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-76 - Registro de pago fallido: Campo "Procedimiento" no seleccionado.
 * Modulo: CU-PAGOS (Adeudos y Pagos) | Criticidad: Alta | Perfil: Recepcionista
 * Responsable: Alma Sofia Hernandez Gonzalez
 *
 * Pre-condiciones:
 * 1. Sesión de Recepcionista iniciada. 2. Paciente seleccionado en el sistema. 3. CONDICIÓN CRÍTICA
 * (RN02): El paciente DEBE tener un procedimiento clínico vinculado cuyo estado sea estrictamente
 * 'Completado'. 4. Dicho procedimiento debe poseer un saldo pendiente > $0.00.
 *
 * Pasos:
 * Dejar procedimiento sin seleccionar Llenar monto y método Clic Guardar
 *
 * Resultado esperado:
 * Error: Campo obligatorio
 *
 * Valores de entrada:
 * Procedimiento: Vacío
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

// TODO: grabar los pasos con Web Recorder y completar el script
WebUI.openBrowser('')

WebUI.navigateToUrl('https://sistemapruebas.yaelrdf.fun/login')

WebUI.setText(findTestObject('Page_Sonrisa perfecta/input_Nombre de usuario'), 'alisson')

WebUI.setEncryptedText(findTestObject('Page_Sonrisa perfecta/input_Contraseavisibility_off'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Page_Sonrisa perfecta/span_Entrar'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/div_c36'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/span_Seleccionar Paciente'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/div_c73'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/button_c62'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/i_payments'))

WebUI.setText(findTestObject('Page_Sonrisa perfecta/input_Monto _'), '500')

WebUI.click(findTestObject('Page_Sonrisa perfecta/span_Registrar'))

// Ejemplo:
// WebUI.setText(findTestObject('Object Repository/Login/input_usuario'), 'usuario_prueba')
// WebUI.verifyElementPresent(findTestObject('Object Repository/VistaGeneral/titulo'), 10)
WebUI.closeBrowser()

