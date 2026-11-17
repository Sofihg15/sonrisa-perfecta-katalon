/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-21 - Intentar eliminar el propio usuario activo.
 * Modulo: CU-USUARIOS (Seguridad) | Criticidad: Alta | Perfil: Cualquier usuario
 * Responsable: Norberto Angell Isais Ramirez
 *
 * Pre-condiciones:
 * 1. Sesión activa con una cuenta con rol 'Administrador' o 'Super Admin'. 2. Permiso concedido
 * explícitamente a la pantalla 'Usuarios'. 3. Estar posicionado en el listado de 'Gestión de
 * Usuarios'. 4. Base de datos accesible para registrar la inserción de cuentas.
 *
 * Pasos:
 * Ir a Gestión de Usuarios Clic Eliminar en usuario propio
 *
 * Resultado esperado:
 * El sistema bloquea la acción
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
