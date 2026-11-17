/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-87 - Cálculo en tiempo real de la edad.
 * Modulo: CU-RNF (Validaciones (RNF)) | Criticidad: Media | Perfil: Recepcionista
 * Responsable: Jose Miguel Kimachang Luna
 *
 * Pre-condiciones:
 * 1. Ambiente de pruebas estable configurado como espejo de Producción. 2. Herramientas de monitoreo
 * de red (Chrome DevTools / pestaña Network) activas para medir ms. 3. Acceso administrativo directo
 * al cliente SQL (Gestor de BD) para auditar la encriptación de datos en crudo.
 *
 * Pasos:
 * Cambiar la fecha de nacimiento Observar campo Edad
 *
 * Resultado esperado:
 * La edad se recalcula inmediatamente sin necesidad de recargar la página (RNF03)
 *
 * Valores de entrada:
 * Fecha: Cambiada
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
