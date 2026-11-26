 /*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-47 - Eliminación de médico sin citas asociadas.
 * Modulo: CU-MEDICOS (Gestión de Médicos) | Criticidad: Alta | Perfil: Administrador
 * Responsable: Alexander Hernandez Juarez
 *
 * Pre-condiciones:
 * 1. Sesión de Administrador iniciada. 2. Estar posicionado en el módulo 'Gestión de Médicos'. 3. Para
 * escenarios de eliminación y edición, deben existir médicos pre-registrados en la BD (algunos con
 * citas y otros sin citas).
 *
 * Pasos:
 * Clic Eliminar Clic Confirmar en diálogo Verificar lista
 *
 * Resultado esperado:
 * El médico desaparece de la base de datos
 *
 * Valores de entrada:
 * N/A
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

WebUI.navigateToUrl('https://sistemapruebas.yaelrdf.fun/')

WebUI.setText(findTestObject('Page_Sonrisa perfecta/input_Nombre de usuario'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Sonrisa perfecta/input_Contraseavisibility_off'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Sonrisa perfecta/span_Entrar'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/i_c43'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/i_delete'))

WebUI.click(findTestObject('Page_Sonrisa perfecta/span_Eliminar'))

