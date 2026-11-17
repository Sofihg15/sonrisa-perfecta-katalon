/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-89 - Tiempo de carga inicial del sistema.
 * Modulo: CU-RNF (Rendimiento (RNF)) | Criticidad: Alta | Perfil: Sistema
 * Responsable: Jose Miguel Kimachang Luna
 *
 * Pre-condiciones:
 * 1. Ambiente de pruebas estable configurado como espejo de Producción. 2. Herramientas de monitoreo
 * de red (Chrome DevTools / pestaña Network) activas para medir ms. 3. Acceso administrativo directo
 * al cliente SQL (Gestor de BD) para auditar la encriptación de datos en crudo.
 *
 * Pasos:
 * Iniciar sesión Medir tiempo de renderizado de Vista General
 *
 * Resultado esperado:
 * La carga inicial del sistema es menor a 10 segundos (RNF07)
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
