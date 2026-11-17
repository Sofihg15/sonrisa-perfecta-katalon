/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-78 - Registro de pago fallido: Campo "Monto" con caracteres no numéricos.
 * Modulo: CU-PAGOS (Adeudos y Pagos) | Criticidad: Media | Perfil: Recepcionista
 * Responsable: Alma Sofia Hernandez Gonzalez
 *
 * Pre-condiciones:
 * 1. Sesión de Recepcionista iniciada. 2. Paciente seleccionado en el sistema. 3. CONDICIÓN CRÍTICA
 * (RN02): El paciente DEBE tener un procedimiento clínico vinculado cuyo estado sea estrictamente
 * 'Completado'. 4. Dicho procedimiento debe poseer un saldo pendiente > $0.00.
 *
 * Pasos:
 * Seleccionar procedimiento Ingresar letras en monto Clic Guardar
 *
 * Resultado esperado:
 * Error: Valor inválido, solo números
 *
 * Valores de entrada:
 * Monto: abc
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
