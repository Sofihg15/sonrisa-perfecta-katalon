/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-48 - Eliminación de médico con citas asociadas.
 * Modulo: CU-MEDICOS (Gestión de Médicos) | Criticidad: Alta | Perfil: Administrador
 * Responsable: Alexander Hernandez Juarez
 *
 * Pre-condiciones:
 * 1. Sesión de Administrador iniciada. 2. Estar posicionado en el módulo 'Gestión de Médicos'. 3. Para
 * escenarios de eliminación y edición, deben existir médicos pre-registrados en la BD (algunos con
 * citas y otros sin citas).
 *
 * Pasos:
 * Clic Eliminar en médico con citas
 *
 * Resultado esperado:
 * Sistema bloquea o muestra advertencia (integridad referencial)
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
 */
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// TODO: grabar los pasos con Web Recorder y completar el script
WebUI.openBrowser('')
WebUI.navigateToUrl('https://sistemapruebas.yaelrdf.fun/login')
// Ejemplo:
// WebUI.setText(findTestObject('Object Repository/Login/input_usuario'), 'usuario_prueba')
// WebUI.verifyElementPresent(findTestObject('Object Repository/VistaGeneral/titulo'), 10)
WebUI.closeBrowser()
