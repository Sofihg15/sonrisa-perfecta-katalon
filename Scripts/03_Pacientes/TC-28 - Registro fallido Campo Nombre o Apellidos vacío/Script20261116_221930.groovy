/*
 * Sonrisa Perfecta - Ciclo de Prueba 1
 * TC-28 - Registro fallido: Campo "Nombre" o "Apellidos" vacío.
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
 * Ingresar CURP y Fecha de Nacimiento Dejar Nombre o Apellidos vacío Hacer clic en Guardar
 *
 * Resultado esperado:
 * El sistema resalta los campos faltantes como obligatorios y bloquea el guardado.
 *
 * Valores de entrada:
 * Nombre: (Vacío), Apellidos: (Vacío)
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
