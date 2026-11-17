/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-66 - Actualización de estado dental a "Obturado".
 * Modulo: CU-EXPEDIENTE (Odontograma y Expediente) | Criticidad: Alta | Perfil: Médico
 * Responsable: Victor Alonzo Luna Alcantara
 *
 * Pre-condiciones:
 * 1. Sesión activa con rol de 'Médico' (garantizando permisos de escritura clínica). 2. El paciente
 * objetivo está seleccionado en el sistema. 3. El usuario navegó exitosamente a 'Expedientes' >
 * pestaña 'Odontogramas'. 4. El componente de interfaz del odontograma gráfico debe haber renderizado
 * (JavaScript activo).
 *
 * Pasos:
 * Clic en un diente Seleccionar estado Obturado Clic Actualizar
 *
 * Resultado esperado:
 * Diente cambia a Color Azul, Sigla O (RN16)
 *
 * Valores de entrada:
 * Estado: Obturado
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
