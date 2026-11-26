 /*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-13 - Creación fallida: "Nombre de usuario" duplicado.
 * Modulo: CU-USUARIOS (Gestión de Usuarios) | Criticidad: Media | Perfil: Admin
 * Responsable: Norberto Angell Isais Ramirez
 *
 * Pre-condiciones:
 * 1. Sesión activa con una cuenta con rol 'Administrador' o 'Super Admin'. 2. Permiso concedido
 * explícitamente a la pantalla 'Usuarios'. 3. Estar posicionado en el listado de 'Gestión de
 * Usuarios'. 4. Base de datos accesible para registrar la inserción de cuentas.
 *
 * Pasos:
 * Clic Nuevo Usuario Ingresar un usuario que ya existe Clic Guardar
 *
 * Resultado esperado:
 * Error de duplicidad
 *
 * Valores de entrada:
 * Usuario: Angel
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

WebUI.navigateToUrl('https://sistemapruebas.yaelrdf.fun/login')

WebUI.setText(findTestObject('input_Nombre de usuario'), 'admin')

WebUI.setEncryptedText(findTestObject('input_Contraseavisibility_off'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('input_Contraseavisibility_off'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('span_manage_accountsUsuarios'))

WebUI.click(findTestObject('span_person_addNuevo Usuario'))

WebUI.setText(findTestObject('input_Nombre de usuario'), 'Alex')

WebUI.setEncryptedText(findTestObject('input_Contraseavisibility_off_1'), '4nvbrPglk7k=')

WebUI.setText(findTestObject('input_Nombre Real'), 'Fernando')

WebUI.click(findTestObject('span_saveGuardar'))

WebUI.click(findTestObject('div_El nombre de usuario ya existe'))

