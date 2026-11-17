/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-37 - Búsqueda sin resultados: Ingresar un dato que no existe en la base de datos.
 * Modulo: CU-PACIENTES (GESTION DE PACIENTES) | Criticidad: Media | Perfil: Recepcionista/Médico
 * Responsable: Carlos Alberto Gomez Escamilla
 *
 * Pre-condiciones:
 * 1. Despliegue correcto del ambiente de pruebas (QA). 2. El servidor backend y la base de datos están
 * operativos. 3. Usuario posicionado en la URL de Gestión de Pacientes. 4. Navegador web sin cookies
 * ni sesiones previas (Modo Incógnito recomendado). 5. Para pruebas de éxito, contar con sesión
 * activa.
 *
 * Pasos:
 * Ingresar dato inexistente Ejecutar búsqueda y verificar
 *
 * Resultado esperado:
 * La tabla se muestra vacía con un mensaje tipo "No se encontraron resultados".
 *
 * Valores de entrada:
 * Criterio de búsqueda: "XYZ999"
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
