/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-59 - Cambio de estado exitoso a "En progreso" o "Completada".
 * Modulo: CU-CITAS (Gestión de Citas) | Criticidad: Media | Perfil: Médico
 * Responsable: Andrea Itzayana Ortega Prieto
 *
 * Pre-condiciones:
 * 1. Sesión activa en el sistema (Recepcionista o Médico). 2. El catálogo de BD debe tener pacientes y
 * médicos registrados previamente. 3. El paciente objetivo debe estar buscado y seleccionado en la
 * barra superior para habilitar el botón 'Nueva Cita'. 4. La pantalla de Gestión de Citas debe estar
 * visible.
 *
 * Pasos:
 * Clic Cambiar Estado Seleccionar estado Confirmar en diálogo
 *
 * Resultado esperado:
 * Estado actualizado correctamente (RF08, RN10)
 *
 * Valores de entrada:
 * Estado: Completada
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
